name := "twitter-finatra-sample"

version := "1.0"

scalaVersion := "2.11.8"

resolvers ++= Seq("twttr" at "http://maven.twttr.com")

libraryDependencies ++= Seq(
  "com.twitter.finatra" %% "finatra-http" % "2.1.6",
  "com.twitter.finatra" %% "finatra-utils" % "2.1.6",
  "com.twitter.finatra" %% "finatra-slf4j" % "2.1.6",
  "com.twitter.finatra" %% "finatra-jackson" % "2.1.6",
  "com.twitter.finatra" %% "finatra-thrift" % "2.1.6",
  "ch.qos.logback" % "logback-classic" % "1.1.7"
)