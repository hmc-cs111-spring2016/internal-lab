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
  def continue  = {
      while_c(cond)(body)
    }
  def while_c(cond: =>Boolean)(body: =>Unit){
    
    if(cond){
      body
      while_c(cond)(body)
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
