sbtPlugin := true

name := "sbt-native-packager"

organization := "com.typesafe"

version := "0.4.4-SNAPSHOT"

scalacOptions in Compile += "-deprecation"

publishTo := Some(Resolver.url("sbt-plugin-releases", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns))

publishMavenStyle := false
