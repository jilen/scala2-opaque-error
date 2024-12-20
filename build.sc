import mill._, scalalib._

object lib extends ScalaModule {
  def scalaVersion = "3.5.2"
}

object app extends ScalaModule {

  def moduleDeps = Seq(lib)

  def scalaVersion = "2.13.15"

  def scalacOptions = Seq("-Ytasty-reader")
}
