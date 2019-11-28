name := "maxmind-geoip2-scala"

organization := "com.sanoma.cda"

version := "1.3.1-THIB"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "com.maxmind.geoip2" % "geoip2" % "0.8.0"
)

publishTo := Some(Resolver.file("file",  new File(sys.props.getOrElse("publishTo", ""))))
