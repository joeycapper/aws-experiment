
name := "OurFirstLambda"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "com.amazonaws"                 %  "aws-lambda-java-core"        % "1.1.0",
  "com.amazonaws"                 %  "aws-lambda-java-events"      % "1.3.0",
  "com.amazonaws"                 %  "aws-java-sdk-dynamodb"       % "1.11.61"
)