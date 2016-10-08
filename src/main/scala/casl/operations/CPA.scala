package casl.operations

import casl.controls.Label
import casl.{GR, Register}

object CPA {
  def GR1(gr: GR) = this.cpa(Register.GR1, gr.asInt())
  def GR2(gr: GR) = this.cpa(Register.GR2, gr.asInt())
  def GR3(gr: GR) = this.cpa(Register.GR3, gr.asInt())
  def GR4(gr: GR) = this.cpa(Register.GR4, gr.asInt())
  def GR5(gr: GR) = this.cpa(Register.GR5, gr.asInt())
  def GR6(gr: GR) = this.cpa(Register.GR6, gr.asInt())
  def GR7(gr: GR) = this.cpa(Register.GR7, gr.asInt())
  def GR8(gr: GR) = this.cpa(Register.GR8, gr.asInt())

  def GR1(label: Label[Int]) = this.cpa(Register.GR1, label.get())
  def GR2(label: Label[Int]) = this.cpa(Register.GR2, label.get())
  def GR3(label: Label[Int]) = this.cpa(Register.GR3, label.get())
  def GR4(label: Label[Int]) = this.cpa(Register.GR4, label.get())
  def GR5(label: Label[Int]) = this.cpa(Register.GR5, label.get())
  def GR6(label: Label[Int]) = this.cpa(Register.GR6, label.get())
  def GR7(label: Label[Int]) = this.cpa(Register.GR7, label.get())
  def GR8(label: Label[Int]) = this.cpa(Register.GR8, label.get())

  private def cpa(gr: GR, n: Int) = Register.FR = gr.asInt() - n
}