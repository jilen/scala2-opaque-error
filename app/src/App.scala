package app

import lib._


object FooApp {
  def main(args: Array[String]) = {
    val f = new Foo(Alias.of(0L))
    println(f)
  }
}
