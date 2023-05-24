name := "wikipedia"

scalaVersion := "2.13.9"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.3.2",
  "org.apache.spark" %% "spark-sql" % "3.3.2",
  "junit" % "junit" % "4.13.2" % Test,
  "org.scalatest" %% "scalatest" % "3.2.15" % Test,
  "org.scalameta" %% "munit" % "0.7.29" % Test
)
