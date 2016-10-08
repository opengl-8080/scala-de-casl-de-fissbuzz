package casl

object Register {
  var GR1 = new GR
  var GR2 = new GR
  var GR3 = new GR
  var GR4 = new GR
  var GR5 = new GR
  var GR6 = new GR
  var GR7 = new GR
  var GR8 = new GR

  var FR: Int = 0
}

class GR {
  private var value: Any = _
  private var reservedValue: Any = _

  def asInt() = this.get().asInstanceOf[Int]
  def asString() = this.get().asInstanceOf[String]

  def cast[T]() = this.get().asInstanceOf[T]

  def minus(n: Int) = this.set(this.asInt() - n)
  def plus(n: Int) = this.set(this.asInt() + n)

  def set(other: GR): Unit = this.set(other.get())

  def set(value: Any): Unit = {
    this.value = value
    this.cancelReserve()
  }

  private def get(): Any = {
    if (this.reservedValue != null) {
      this.set(this.reservedValue)
    }

    return this.value
  }

  def reserve(other: GR): Unit = this.reserve(other.get())
  def reserve(value: Any): Unit = this.reservedValue = value

  def cancelReserve(): Unit = {
    this.reservedValue = null
  }
}
