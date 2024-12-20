package lib

class Foo(id: Foo.Id)


object Alias {
  def of[X](x: X): Of[X]  = x
  opaque type Of[X] <: X = X
}

object Foo {
  def Id(i: Long): Id = Alias.of(i)
  opaque type Id <: Long & Alias.Of[Long] = Alias.Of[Long]
}
