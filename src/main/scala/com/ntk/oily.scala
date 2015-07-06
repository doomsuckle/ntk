package com.ntk.euler

import com.ntk.euler.utils._

/**
 * Created by kypreos on 7/5/15.
 */
object oily extends App {

  println(s"Oily!")

  val primeTester = new PrimeTester
  val st = new stampy
  println(s"" + st.gwar())
  println(s"" + primeTester.isPrime(15))
  println(s"" + primeTester.isPrime(7))

}
