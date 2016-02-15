package internal

/**
 * the loop body should execute 10 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */
object LoopUntil extends App {

  // define the new control-flow structure here
  
  def loop_until(b: =>Boolean)(code: =>Unit):Unit = {
    if (!b) {
      code
      loop_until(b)(code)
    }
  }

  var i = 0
  
  loop_until (i > 9) {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  }
  var x = 42
  var s = ""
  loop_until (x == 0) {
    s = (x%2).toString + s
    x = x/2
    
  }
  println(s)

}
