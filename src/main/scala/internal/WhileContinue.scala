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
  object ContinueException extends Exception("")
  def continue = throw ContinueException
  def while_c(test: =>Boolean)(body: =>Unit) = {
    
    while(test) {
      try {
        body
      } catch {
        case e:Exception if e == ContinueException => Unit
      }
    }    
  }

  var i = -1

  while_c (i < 9) {
      i += 1
      if ( (i % 2) != 0 )
          continue
      println(i)
  }        

}
