package casl.controls

import casl.ContinueException

class Loop(val name: String) {
  def apply(block: => Unit): Unit = {
    val loopBlock = () => {
      while (true) {
        try {
          block
        } catch {
          case e: ContinueException =>
        }
      }
    }

    Function.put(this.name, loopBlock)
  }
}