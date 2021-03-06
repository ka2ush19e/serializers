name := "serializers"

version := "1.0"

scalaVersion := "2.10.5"

libraryDependencies ++= Seq(
  // Avro
  "org.apache.avro" % "avro" % "1.7.7",
  "org.apache.avro" % "avro-ipc" % "1.7.7",
  // Thrift
  "org.apache.thrift" % "libthrift" % "0.9.2",
  "com.twitter" %% "scrooge-core" % "3.19.0",
  "com.twitter" %% "finagle-thrift" % "6.26.0",
  // Protocol Buffers
  "com.google.protobuf" % "protobuf-java" % "2.6.1",
  // Kryo
  "com.twitter" %% "chill" % "0.6.0"
)

resolvers += "twitter" at "http://maven.twttr.com"
