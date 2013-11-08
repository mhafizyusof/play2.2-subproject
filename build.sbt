import play.Project._

name := "TestProject"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  cache,
  "mysql" % "mysql-connector-java" % "5.1.25"
)

play.Project.playJavaSettings

lazy val root = project.in(file(".")).aggregate(common, api, manager).dependsOn(common, api, manager)

lazy val common = project.in(file("modules/common"))

lazy val api = project.in(file("modules/api")).dependsOn(common)

lazy val manager = project.in(file("modules/manager")).dependsOn(common)