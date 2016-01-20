organization := "com.mvikram"
name := "spring-boot-akka"
version := "1.0"
scalaVersion := "2.11.7"
sbtVersion := "0.13.1"
retrieveManaged := true

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % "1.2.7.RELEASE",
  "com.typesafe.akka" %% "akka-actor" % "2.4.1",
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"
)