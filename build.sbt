
ThisBuild / scalaVersion := "2.12.8"

ThisBuild / organization := "com.example"

lazy val hello = (project in file("."))
  .settings(
    name := "tdd_with_example",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
  )
