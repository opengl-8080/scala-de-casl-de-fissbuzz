package fizzbuzz

import casl.Implicits._
import casl.Register._
import casl._
import casl.operations._
import fizzbuzz.Comments._
import fizzbuzz.Variables._

object FizzBuzz {

  def main(args: Array[String]): Unit = {
    MAIN START

             LD   GR5 BEGINIDX   ; ループインデックスを初期化
             CALL LOOP           ; メインループ開始}

   {LOOP    {CPA  GR5 ENDIDX     ; ループ終了条件確認
             JPL  FINISH         ; GR5がENDIDXより大きければ終了
             LD   GR1 GR5
             LD   GR2 FIFTEEN
             CALL DIVIDE         ; 現在の数を15で割る
             CPA  GR4 ZERO
             JZE  PUTFZBZ        ; 割り切れたらfizzbuzz出力
             LD   GR1 GR5
             LD   GR2 FIVE
             CALL DIVIDE         ; 現在の数を5で割る
             CPA  GR4 ZERO
             JZE  PUTBUZZ        ; 割り切れたらbuzz出力
             LD   GR1 GR5
             LD   GR2 THREE
             CALL DIVIDE         ; 現在の数を3で割る
             CPA  GR4 ZERO
             JZE  PUTFIZZ        ; 割り切れたらfizz出力
             CALL MSGHUND        ; 割り切れなかったら数字をそのまま出力
             JUMP COUNTUP        ; カウントアップへ}
    PUTFIZZ {OUT  FIZZ LEN4      ; fizz出力
             JUMP COUNTUP        ; カウントアップへ}
    PUTBUZZ {OUT  BUZZ LEN4      ; buzz出力
             JUMP COUNTUP        ; カウントアップへ}
    PUTFZBZ {OUT  FIZZBUZZ LEN8  ; fizzbuzz出力
             JUMP COUNTUP        ; カウントアップへ}
    COUNTUP {ADDA GR5 ONE        ; カウントを１進めて
             JUMP LOOP           ; 次のループへ}
    FINISH  {RET                 ; ループ終了}

    ; GR5_出力する値
    ; GR6_現在のメッセージサイズ
    ; GR7_文字保存一時領域
    MSGHUND {LD   GR6 ZERO
             LD   GR1 GR5
             LD   GR2 HUNDRED
             CALL DIVIDE         ; 現在の数を100で割る
             CPA  GR3 ZERO
             JMI  MSGTEN         ; 商がない場合は10の位の出力へ
             JZE  MSGTEN         ; 商がない場合は10の位の出力へ
             LD   GR7 NUM GR3    ; 商を一時領域に退避
             ST   GR7 MSG GR6    ; 退避した商を最終出力する文字列に格納
             ADDA GR6 ONE        ; 文字の位置を１つ移動
             JUMP MSGTEN         ; 続いて10の位を出力}
    MSGTEN  {LD   GR1 GR4
             LD   GR2 TEN
             CALL DIVIDE         ; 現在の数を10で割る
             CPA  GR3 ZERO
             JMI  MSGONE         ; 商がない場合は1の位の出力へ
             JZE  MSGONE         ; 商がない場合は1の位の出力へ
             LD   GR7 NUM GR3    ; 商を一時領域に退避
             ST   GR7 MSG GR6    ; 退避した商を最終出力する文字列に格納
             ADDA GR6 ONE        ; 文字の位置を１つ移動
             JUMP MSGONE         ; 続いて1の位を出力}
    MSGONE  {LD   GR7 NUM GR4    ; 余りを一時領域に退避
             ST   GR7 MSG GR6    ; 退避していた余りを最終出力する文字列に格納
             ADDA GR6 ONE        ; 文字の位置を１つ移動
             ST   GR6 LEN
             OUT  MSG LEN
             RET                 ; 数値出力終了}

    ; 割り算処理
    ; GR1_割られる数
    ; GR2_割る数
    ; GR3_商
    ; GR4_余り
    DIVIDE  {LD   GR3 ZERO       ; 商を初期化
             JUMP DNEXT          ; 割り算開始}
    DNEXT   {CPA  GR1 GR2        ; 割れるか検証
             JMI  DIVEND         ; 割れないなら終了
             SUBA GR1 GR2        ; GR1からGR2を引く
             ADDA GR3 ONE        ; 商を加算
             JUMP DNEXT          ; 次のステップ}
    DIVEND  {LD   GR4 GR1        ; 余りをGR4に保存
             RET                 ; 割り算終了}

    ; 変数定義
    BEGINIDX DC 1
    ENDIDX   DC 100

    FIZZ     DC "fizz"
    BUZZ     DC "buzz"
    FIZZBUZZ DC "fizzbuzz"
    LEN1     DC 1
    LEN4     DC 4
    LEN8     DC 8

    ZERO     DC 0
    ONE      DC 1
    THREE    DC 3
    FIVE     DC 5
    TEN      DC 10
    FIFTEEN  DC 15
    HUNDRED  DC 100

    NUM      DC "0123456789"
    MSG      DS 3
    LEN      DS 1

    END}
}
