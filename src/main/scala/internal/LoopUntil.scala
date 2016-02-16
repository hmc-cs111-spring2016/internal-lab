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

  def loop_until (cond: =>Boolean) (body: =>Unit) = {
    // execute the body in the context of the cond
    while (!cond) body 
  }

  var i = 0
  
  loop_until (i > 9) {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  }

}
