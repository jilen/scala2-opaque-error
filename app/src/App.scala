package app

import lib.Foo


object FooApp {
  def main(args: Array[String]) = {
    val f = new Foo(Foo.Id(0L))
    println(f)
  }
}
