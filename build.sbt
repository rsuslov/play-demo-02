name := "example-app"

version := "1.0-SNAPSHOT"

organization := "com.example"


//libraryDependencies ++= Seq(
//  javaJdbc,
// javaEbean,
//  cache
//)     

//lazy val root = (project in file(".")) //.enablePlugins(PlayJava)

//enablePlugins(PlayJava)

enablePlugins(DebianPlugin)

maintainer := "Roman Suslov <roman.suslov.18@gmail.com>"

packageSummary := "My custom package"

packageDescription := """A fun package description of our software"""

//play.Project.playJavaSettings

lazy val root = (project in file("."))
  .settings(
    name := "example-app"
  )
