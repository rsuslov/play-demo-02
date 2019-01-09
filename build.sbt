name := """example-app"""

version := "1.0"

<<<<<<< HEAD
libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)

//play.Project.playJavaSettings

//enablePlugins(LinuxPlugin)

//enablePlugins(DebianPlugin)

maintainer := "Roman Suslov <roman.suslov.18@gmail.com>"

packageSummary := "My custom package"

packageDescription := """A fun package description of our software"""
=======
organization := "com.example"
>>>>>>> temp-branch

enablePlugins(DebianPlugin)

maintainer := "Roman Suslov <roman.suslov.18@gmail.com>"

packageSummary := "My custom package"

packageDescription := """A fun package description of our software"""

lazy val root = (project in file("."))
  .settings(
    name := "example-app"
  )
