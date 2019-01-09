name := "example-app"

version := "1.0-SNAPSHOT"

organization := "com.example"

enablePlugins(DebianPlugin)

maintainer := "Roman Suslov <roman.suslov.18@gmail.com>"

packageSummary := "My custom package"

packageDescription := """A fun package description of our software"""

lazy val root = (project in file("."))
  .settings(
    name := "example-app"
  )
