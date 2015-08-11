enablePlugins(SimpleFXPlugin)

scalaVersion := "2.11.7"

organization := "SANDEC"

resolvers += Resolver.url("SANDEC", url("http://dl.bintray.com/sandec/repo"))(Resolver.ivyStylePatterns)

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-language:_")

addCompilerPlugin("org.scalamacros" % "paradise" % "2.0.1" cross CrossVersion.full)

fork := true
