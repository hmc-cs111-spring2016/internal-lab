package internal

/**
 * the loop body should execute 10 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */

class repeat(code: =>Unit) {
  def until(cond: =>Boolean):Unit = {
    code
    if(!cond) {
      until(cond)
    }
  }
}


object RepeatUntil extends App {
  
  // define the new control-flow structure here
  
  
  var i = 0
  repeat  {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  } until(i > 9)        
}

