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
  def for_loop(start: Unit)(condition: =>Boolean)(end: =>Unit)(function: =>Unit): Unit = {
    if (condition) {
      start
      function
      for_loop(end)(condition)(end)(function)
    }
  }
  
  var i = 0;
  for_loop(i = 0)(i < 10)(i += 2) {
    println(i);
  }

}