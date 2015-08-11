resolvers += Resolver.url("SANDEC", url("http://dl.bintray.com/sandec/repo"))(Resolver.ivyStylePatterns)

addSbtPlugin("SANDEC" % "simplefx-plugin" % "2.1.2")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.12.0")
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "3.0.0")