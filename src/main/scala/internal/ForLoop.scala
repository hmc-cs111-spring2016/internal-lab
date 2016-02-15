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

  def for_loop(start: Unit)(cond: => Boolean)(update: =>Unit)(function: => Unit): Unit = {
  	if(cond) {
  		start
  		function
  		for_loop(update)(cond)(update)(function)
  	}
  }
  
  var i = 0;
  for_loop(i = 0)(i < 10)(i += 2) {
    println(i);
  }

}
