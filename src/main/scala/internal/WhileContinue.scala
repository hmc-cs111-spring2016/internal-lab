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

  def while_c (cond: =>Boolean) (body: =>Unit): Unit = {
    if (cond) {
      try {
        body
        while_c (cond)(body)
      } catch { 
        case e: Exception => while_c (cond)(body) // restart the loop
      }
    }
  }
  
  // exception when we get to continue
  def continue = throw new Exception("No")
  
  var i = -1

  while_c (i < 9) {
      i += 1
      if ( (i % 2) != 0 )
          continue
      println(i)
  }        

}
