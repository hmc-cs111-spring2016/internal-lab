package internal

/**
 * the loop body should execute 10 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */

object WhileContinue extends App {

  // define the new control-flow structures here
  case class ContinueException(msg:String) extends Exception(msg)
  
  def while_c(c : =>Boolean)(body: =>Unit) = {
    while(c) {
      try {
        while(c) body
      } catch{
        case x:ContinueException=>
      }
    }
  }
  
  def continue = {
    throw new ContinueException("Continue")
  }

  var i = -1

  while_c (i < 9) {
      i += 1
      if ( (i % 2) != 0 )
          continue
      println(i)
  }        

}
