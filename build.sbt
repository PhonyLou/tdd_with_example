
ThisBuild / scalaVersion := "2.12.8"

ThisBuild / organization := "com.example"

lazy val tdd_with_example = (project in file("."))
  .settings(
    name := "tdd_with_example",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.3" % Test
  )
