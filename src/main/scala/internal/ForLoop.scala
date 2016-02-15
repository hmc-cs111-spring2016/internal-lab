package internal

/**
 * the loop body should execute 5 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */

object ForLoop extends App {

  // define the new control-flow structure here 
  
  def for_loop(startVal: =>Unit) (cond: =>Boolean) (inc: =>Unit) (body: =>Unit) {
    startVal
    if (cond) {
      body
      inc
      for_loop(Nil)(cond)(inc)(body)
    }
  }
  
  var i = 0;
  for_loop(i = 0)(i < 10)(i += 2) {
    println(i);
  }

}
