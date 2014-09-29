name := "maxmind-geoip2-scala"

organization := "com.sanoma.cda"

version := "1.2.2-THIB"

scalaVersion := "2.11.2"

// twitter util doesn't have 2.9.3
// crossScalaVersions := Seq("2.9.2", "2.10.3")

libraryDependencies ++= Seq(
  "com.maxmind.geoip2" % "geoip2" % "0.8.0",
  "org.scalacheck" %% "scalacheck" % "1.10.0" % "test",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test"
)

publishTo := Some(Resolver.sftp(
  "iliaz",
  "scala.iliaz.com"
) as ("scala_iliaz_com", Path.userHome / ".ssh" / "id_rsa"))
