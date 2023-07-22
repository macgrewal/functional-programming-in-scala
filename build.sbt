name := "functional-programming-in-scala"

version := "1.0"

scalaVersion := "2.13.11"

val scalaTestVersion = "3.2.16"

libraryDependencies += "org.scalactic" %% "scalactic" % scalaTestVersion
libraryDependencies += "org.scalatest" %% "scalatest" % scalaTestVersion % "test"