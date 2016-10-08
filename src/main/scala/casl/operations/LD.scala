package casl.operations

import casl.controls.Label
import casl.{GR, Register}

object LD {
  def GR1(from: GR) = this.ld(Register.GR1, from)
  def GR2(from: GR) = this.ld(Register.GR2, from)
  def GR3(from: GR) = this.ld(Register.GR3, from)
  def GR4(from: GR) = this.ld(Register.GR4, from)
  def GR5(from: GR) = this.ld(Register.GR5, from)
  def GR6(from: GR) = this.ld(Register.GR6, from)
  def GR7(from: GR) = this.ld(Register.GR7, from)
  def GR8(from: GR) = this.ld(Register.GR8, from)

  private def ld(to: GR, from: GR): LDwithGR = {
    to.reserve(from)
    return new LDwithGR(to, from)
  }

  def GR1(label: Label[_]) = this.ld(Register.GR1, label)
  def GR2(label: Label[_]) = this.ld(Register.GR2, label)
  def GR3(label: Label[_]) = this.ld(Register.GR3, label)
  def GR4(label: Label[_]) = this.ld(Register.GR4, label)
  def GR5(label: Label[_]) = this.ld(Register.GR5, label)
  def GR6(label: Label[_]) = this.ld(Register.GR6, label)
  def GR7(label: Label[_]) = this.ld(Register.GR7, label)
  def GR8(label: Label[_]) = this.ld(Register.GR8, label)

  private def ld(gr: GR, label: Label[_]): LDwithLabel = {
    gr.reserve(label.get())
    return new LDwithLabel(gr, label)
  }
}

class LDwithGR(val to: GR, val from: GR) {
  def GR1() = this.ld(Register.GR1)
  def GR2() = this.ld(Register.GR2)
  def GR3() = this.ld(Register.GR3)
  def GR4() = this.ld(Register.GR4)
  def GR5() = this.ld(Register.GR5)
  def GR6() = this.ld(Register.GR6)
  def GR7() = this.ld(Register.GR7)
  def GR8() = this.ld(Register.GR8)

  private def ld(positionGr: GR): Unit = {
    val position = positionGr.asInt()
    val text = from.asString()

    to.set(text.charAt(position).toString)
  }
}

class LDwithLabel(val gr: GR, val label: Label[_]) {
  def GR1() = this.ld(Register.GR1)
  def GR2() = this.ld(Register.GR2)
  def GR3() = this.ld(Register.GR3)
  def GR4() = this.ld(Register.GR4)
  def GR5() = this.ld(Register.GR5)
  def GR6() = this.ld(Register.GR6)
  def GR7() = this.ld(Register.GR7)
  def GR8() = this.ld(Register.GR8)

  private def ld(positionGr: GR): Unit = {
    val position = positionGr.asInt()
    val text = label.asString()

    gr.set(text.charAt(position).toString)
  }
}