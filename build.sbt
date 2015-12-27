name := "maxmind-geoip2-scala"

organization := "com.sanoma.cda"

version := "1.2.3-THIB"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.maxmind.geoip2" % "geoip2" % "0.8.0",
  "org.scalacheck" % "scalacheck_2.11" % "1.10.0" % "test",
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
)
