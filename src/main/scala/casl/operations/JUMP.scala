package casl.operations

import casl.controls.Function

import scala.language.dynamics

object JUMP extends Dynamic {

  def selectDynamic(functionName: String): Unit = {
    Function.call(functionName)
  }

  def applyDynamic(key: String)(): Unit = {}
}