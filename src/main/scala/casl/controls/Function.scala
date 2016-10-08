package casl.controls

import scala.collection.mutable.Map

class Function(name: String) {

  def apply(block: => Unit): Unit = {
    Function.put(this.name, () => block)
  }
}

object Function {
  private val map = Map[String, () => Unit]()

  def put(name: String, block: () => Unit): Unit = {
    Function.map(name) = block
  }

  def call(name: String) = Function.map(name).apply()
}
