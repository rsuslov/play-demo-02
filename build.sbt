name := "example-app"

version := "1.0"

maintainer := "Roman Suslov <roman.suslov.18@gmail.com>"

packageSummary := "My custom package"

packageDescription := """A fun package description of our software,
  with multiple lines."""

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings

enablePlugins(LinuxPlugin)

enablePlugins(DebianPlugin)
