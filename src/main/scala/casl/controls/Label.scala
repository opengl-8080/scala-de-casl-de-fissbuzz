package casl.controls

import scala.collection.mutable.Map
import scala.reflect.ClassTag

class Label[T](val name: String)(implicit c: ClassTag[T]) {
  Label.put(this)

  private var values: Array[T] = Array[T]()
  private var reservedValue: T = _

  def DC(value: T): Unit = {
    this.values = new Array[T](1)
    this.values(0) = value
  }

  def DS(size: Int): Unit = this.values = new Array[T](size)

  def get() = this.getValues()(0)

  def set(value: T): Unit = this.set(0, value)
  def set(position: Int, value: T): Unit = {
    this.values(position) = value
    this.cancelReserve()
  }

  def reserve(value: T) = this.reservedValue = value
  def cancelReserve() = this.reservedValue = null.asInstanceOf[T]

  def asString() = if (this.getValues().isEmpty) "" else this.getValues().mkString("")

  private def getValues(): Array[T] = {
    if (this.reservedValue != null) {
      this.set(0, this.reservedValue)
    }

    return this.values
  }

  override def toString = s"Label{name=$name, values=[${values.mkString(", ")}, reservedValue=$reservedValue]"
}

object Label {
  private val map = Map[String, Label[_]]()

  def put(label: Label[_]) = Label.map.put(label.name, label)
  def get(name: String) = Label.map(name)
}