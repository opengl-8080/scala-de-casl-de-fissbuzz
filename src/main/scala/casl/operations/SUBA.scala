package casl.operations

import casl.controls.Label
import casl.{GR, Register}

object SUBA {
  def GR1(other: GR) = this.suba(Register.GR1, other.asInt())
  def GR2(other: GR) = this.suba(Register.GR2, other.asInt())
  def GR3(other: GR) = this.suba(Register.GR3, other.asInt())
  def GR4(other: GR) = this.suba(Register.GR4, other.asInt())
  def GR5(other: GR) = this.suba(Register.GR5, other.asInt())
  def GR6(other: GR) = this.suba(Register.GR6, other.asInt())
  def GR7(other: GR) = this.suba(Register.GR7, other.asInt())
  def GR8(other: GR) = this.suba(Register.GR8, other.asInt())

  def GR1(other: Label[Int]) = this.suba(Register.GR1, other.get())
  def GR2(other: Label[Int]) = this.suba(Register.GR2, other.get())
  def GR3(other: Label[Int]) = this.suba(Register.GR3, other.get())
  def GR4(other: Label[Int]) = this.suba(Register.GR4, other.get())
  def GR5(other: Label[Int]) = this.suba(Register.GR5, other.get())
  def GR6(other: Label[Int]) = this.suba(Register.GR6, other.get())
  def GR7(other: Label[Int]) = this.suba(Register.GR7, other.get())
  def GR8(other: Label[Int]) = this.suba(Register.GR8, other.get())

  private def suba(gr: GR, n: Int) = gr.minus(n)
}
