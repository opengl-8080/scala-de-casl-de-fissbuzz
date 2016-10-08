package casl.operations

import casl.controls.Label
import casl.{GR, Register}

import scala.language.dynamics

object ST {
  def GR1[T](label: Label[T]): ST[T] = this.st(Register.GR1, label)
  def GR2[T](label: Label[T]): ST[T] = this.st(Register.GR2, label)
  def GR3[T](label: Label[T]): ST[T] = this.st(Register.GR3, label)
  def GR4[T](label: Label[T]): ST[T] = this.st(Register.GR4, label)
  def GR5[T](label: Label[T]): ST[T] = this.st(Register.GR5, label)
  def GR6[T](label: Label[T]): ST[T] = this.st(Register.GR6, label)
  def GR7[T](label: Label[T]): ST[T] = this.st(Register.GR7, label)
  def GR8[T](label: Label[T]): ST[T] = this.st(Register.GR8, label)

  private def st[T](gr: GR, label: Label[T]): ST[T] = {
    label.reserve(gr.cast[T]())
    return new ST(gr, label)
  }
}

class ST[T](val gr: GR, val label: Label[T]) {
  def GR1() = this.st(Register.GR1)
  def GR2() = this.st(Register.GR2)
  def GR3() = this.st(Register.GR3)
  def GR4() = this.st(Register.GR4)
  def GR5() = this.st(Register.GR5)
  def GR6() = this.st(Register.GR6)
  def GR7() = this.st(Register.GR7)
  def GR8() = this.st(Register.GR8)

  private def st(positionGr: GR): Unit = {
    val position = positionGr.asInt()
    val value = this.gr.cast[T]()

    this.label.set(position, value)
  }
}
