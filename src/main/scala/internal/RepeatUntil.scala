package internal

/**
 * the loop body should execute 10 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */

object RepeatUntil extends App {
  
  // define the new control-flow structure here
  def repeat(body: =>Unit) : repeatStruct = {
    new repeatStruct(body)
  }
  
  class repeatStruct(body: =>Unit) {
    def until(c : =>Boolean) = {
      while(!c) body
    }
  }
  

  var i = 0
  repeat  {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  } until(i > 9)        
}

