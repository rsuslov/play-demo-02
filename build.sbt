name := "example-app"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings

enablePlugins(DebianPlugin)

maintainer := "Roman <roman.suslov.18@gmail.com>"
packageSummary := "My custom package"
packageDescription := "Package-01"

