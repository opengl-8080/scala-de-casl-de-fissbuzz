package casl

object MAIN {
  def START() {}
}

object Implicits {
  def END() {}
  def RET() = throw new ReturnException
}

class ContinueException extends Exception
class ReturnException extends Exception
