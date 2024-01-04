ThisBuild / scalaVersion := "3.3.1"
ThisBuild / organization := "the.whatever.org"

lazy val app = project
  .in(file("."))
  .settings(
    name := "the app",
    libraryDependencies ++= Seq(
      "org.scala-lang" %% "toolkit" % "0.1.7"
    )
  )
  .aggregate(corelib)

lazy val corelib = project
  .in(file("lib"))
  .settings(
    name := "the core lib",
    libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"
  )

lazy val standalone = project
  .in(file("tool"))
