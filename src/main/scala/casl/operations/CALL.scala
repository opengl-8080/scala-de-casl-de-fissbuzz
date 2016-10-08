package casl.operations

import casl.ReturnException
import casl.controls.Function

import scala.language.dynamics

object CALL extends Dynamic {

  def selectDynamic(functionName: String): Unit = {
    try {
      Function.call(functionName)
    } catch {
      case e: ReturnException =>
    }
  }

  def applyDynamic(key: String)(): Unit = {}
}