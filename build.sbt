name := "euler"

organization := "com.ntk"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.6"

sbtVersion :=  "0.13.0"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.12.1" % "test" withSources() withJavadoc()
)
