package fizzbuzz

import casl.controls
import casl.controls.{Label, Loop}

object Variables {
  // 関数
  val LOOP = new Loop("LOOP")

  val PUTFIZZ = new controls.Function("PUTFIZZ")
  val PUTBUZZ = new controls.Function("PUTBUZZ")
  val PUTFZBZ = new controls.Function("PUTFZBZ")
  val COUNTUP = new controls.Function("COUNTUP")
  val FINISH = new controls.Function("FINISH")

  val DIVIDE = new controls.Function("DIVIDE")
  val DNEXT = new controls.Function("DNEXT")
  val DIVEND = new controls.Function("DIVEND")

  val MSGHUND = new controls.Function("MSGHUND")
  val MSGTEN = new controls.Function("MSGTEN")
  val MSGONE = new controls.Function("MSGONE")

  // 変数
  val BEGINIDX = new Label[Int]("BEGINIDX")
  val ENDIDX = new Label[Int]("ENDIDX")

  val FIZZ = new Label[String]("FIZZ")
  val BUZZ = new Label[String]("BUZZ")
  val FIZZBUZZ = new Label[String]("FIZZBUZZ")
  val LEN1 = new Label[Int]("LEN1")
  val LEN4 = new Label[Int]("LEN4")
  val LEN8 = new Label[Int]("LEN8")

  val ZERO = new Label[Int]("ZERO")
  val ONE = new Label[Int]("ONE")
  val THREE = new Label[Int]("THREE")
  val FIVE = new Label[Int]("FIVE")
  val TEN = new Label[Int]("TEN")
  val FIFTEEN = new Label[Int]("FIFTEEN")
  val HUNDRED = new Label[Int]("HUNDARED")

  val NUM = new Label[String]("NUM")
  val MSG = new Label[String]("MSG")
  val LEN = new Label[Int]("LEN")
}

object Comments {
  def ループインデックスを初期化() {}
  def メインループ開始() {}
  def メインループ処理() {}
  def ループ終了条件確認() {}
  def GR5がENDIDXより大きければ終了() {}
  def 商を初期化() {}
  def 割り算処理() {}
  def GR1_割られる数() {}
  def GR2_割る数() {}
  def GR3_商() {}
  def 変数定義() {}
  def GR4_余り() {}
  def 割り算開始() {}
  def 割れるか検証() {}
  def 割れないなら終了() {}
  def GR1からGR2を引く() {}
  def 商を加算() {}
  def 次のステップ() {}
  def 余りをGR4に保存() {}
  def 割り算終了() {}
  def 現在の数を15で割る() {}
  def 余りを0と比較() {}
  def 割り切れたらfizzbuzz出力() {}
  def 現在の数を5で割る() {}
  def 現在の数を3で割る() {}
  def 割り切れたらbuzz出力() {}
  def 割り切れたらfizz出力() {}
  def 割り切れなかったら数字をそのまま出力() {}
  def fizzbuzz出力() {}
  def カウントアップへ() {}
  def buzz出力() {}
  def fizz出力() {}
  def カウントを１進めて() {}
  def 次のループへ() {}
  def ループ終了() {}
  def GR5_出力する値() {}
  def GR6_現在のメッセージサイズ() {}
  def GR7_文字保存一時領域() {}
  def 現在の数を100で割る() {}
  def 現在の数を10で割る() {}
  def 商があるか確認() {}
  def 商がない場合は10の位の出力へ() {}
  def 商がない場合は1の位の出力へ() {}
  def 商を一時領域に退避() {}
  def 退避した商を最終出力する文字列に格納() {}
  def 文字の位置を１つ移動() {}
  def 数値出力終了() {}
  def 続いて10の位を出力() {}
  def 続いて1の位を出力() {}
  def 余りを一時領域に退避() {}
  def 退避していた余りを最終出力する文字列に格納() {}
}