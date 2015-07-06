package com.ntk.euler.utils

/**
 * Created by kypreos on 7/5/15.
 */
object PrimeTester {

  def isComposite(x: Int): Boolean = {
    (2 to x / 2) exists (x % _ == 0)
  }

  def isPrime(x: Int): Boolean = {
    !isComposite(x)
  }

  def apply(x: Int): Boolean = {
    isPrime(x)
  }
}
