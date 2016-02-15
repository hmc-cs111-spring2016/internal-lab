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
  
  def for_loop(init: =>Unit)(test: =>Boolean)(inc: =>Unit)(body: =>Unit):Unit = {
    init
    forloopH(test)(inc)(body)
  }
  
  def forloopH(test: =>Boolean)(inc: =>Unit)(body: =>Unit):Unit = {
    if (test) {
      body
      inc
      forloopH(test)(inc)(body)
    }
  }
  
  var i = 0;
  for_loop(i = 0)(i < 10)(i += 2) {
    println(i);
  }

}
