package lib


object Alias {
  opaque type Of[X] <: X = X

  def of[X](i: X): Alias.Of[X] = i
}
class Foo(id: Alias.Of[Long])
