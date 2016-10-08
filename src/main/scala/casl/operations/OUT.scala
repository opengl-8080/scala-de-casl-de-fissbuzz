package casl.operations

import casl.controls.Label

import scala.language.dynamics

object OUT extends Dynamic {

  def selectDynamic(functionName: String): Unit = {}

  def applyDynamic(key: String)(length: Label[Int]): Unit = {
    val text = Label.get(key).asString()
    println(text.substring(0, length.get()))
  }
}