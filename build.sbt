name := "example-app"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings

maintainer := "Roman <roman.suslov.18@gmail.com>"

packageSummary := "My custom package"

packageDescription := "Package-01"

enablePlugins(DebianPlugin)


