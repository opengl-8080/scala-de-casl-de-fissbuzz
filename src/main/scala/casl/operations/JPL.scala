package casl.operations

import casl.Register
import casl.controls.Function

import scala.language.dynamics

object JPL extends Dynamic {

  def selectDynamic(functionName: String): Unit = {
    if (Register.FR > 0) {
      Function.call(functionName)
    }
  }

  def applyDynamic(key: String)(): Unit = {}
}
