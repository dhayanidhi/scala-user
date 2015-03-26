import sbt._
import PlayKeys._

object MyBuild extends Build {


    lazy val root = project.in(file(".")).aggregate(model).enablePlugins(PlayScala)

    lazy val model = project.in(file("Model"))

}