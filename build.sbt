name := "example-app"

version := "1.0"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings

enablePlugins(LinuxPlugin)
enablePlugins(DebianPlugin)

maintainer := "Roman <roman.suslov.18@gmail.com>"

packageSummary := "My custom package"

packageDescription := "Package-01"

