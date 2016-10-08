package casl.operations

import casl.controls.Label
import casl.{GR, Register}

object ADDA {
  def GR1(label: Label[Int]) = this.adda(Register.GR1, label.get())
  def GR2(label: Label[Int]) = this.adda(Register.GR2, label.get())
  def GR3(label: Label[Int]) = this.adda(Register.GR3, label.get())
  def GR4(label: Label[Int]) = this.adda(Register.GR4, label.get())
  def GR5(label: Label[Int]) = this.adda(Register.GR5, label.get())
  def GR6(label: Label[Int]) = this.adda(Register.GR6, label.get())
  def GR7(label: Label[Int]) = this.adda(Register.GR7, label.get())
  def GR8(label: Label[Int]) = this.adda(Register.GR8, label.get())

  def GR1(other: GR) = this.adda(Register.GR1, other.asInt())
  def GR2(other: GR) = this.adda(Register.GR2, other.asInt())
  def GR3(other: GR) = this.adda(Register.GR3, other.asInt())
  def GR4(other: GR) = this.adda(Register.GR4, other.asInt())
  def GR5(other: GR) = this.adda(Register.GR5, other.asInt())
  def GR6(other: GR) = this.adda(Register.GR6, other.asInt())
  def GR7(other: GR) = this.adda(Register.GR7, other.asInt())
  def GR8(other: GR) = this.adda(Register.GR8, other.asInt())

  private def adda(gr: GR, n: Int): Unit = {
    gr.plus(n)
  }
}