name := """mynewapp"""
organization := "com.agiliztech"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)

scalaVersion := "2.11.7"

//libraryDependencies += guice
libraryDependencies += javaJdbc
libraryDependencies += cache
libraryDependencies += javaWs

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.36"
libraryDependencies += evolutions

resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"

//EclipseKeys.preTasks := Seq(compile in Compile)
EclipseKeys.projectFlavor := EclipseProjectFlavor.Java           // Java project. Don't expect Scala IDE
EclipseKeys.createSrc := EclipseCreateSrc.ValueSet(EclipseCreateSrc.ManagedClasses, EclipseCreateSrc.ManagedResources)  // Use .class files instead of generated .scala files for views and routes


//fork in run := false

//fork in Test := false