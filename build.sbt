name := "wiki_task"

version := "0.1"

scalaVersion := "2.13.8"

val http4sVersion = "0.23.14"

// Only necessary for SNAPSHOT releases
resolvers ++= Resolver.sonatypeOssRepos("snapshots")


val http4s = Seq(
  "org.http4s" %% "http4s-dsl" % http4sVersion,
  "org.http4s" %% "http4s-ember-server" % http4sVersion,
  "org.http4s" %% "http4s-ember-client" % http4sVersion
)

val doobie = Seq(
  "org.tpolecat" %% "doobie-core"      % "1.0.0-RC1",
  "org.tpolecat" %% "doobie-hikari"    % "1.0.0-RC1",          // HikariCP transactor.
  "org.tpolecat" %% "doobie-postgres"  % "1.0.0-RC1",          // Postgres driver 42.3.1 + type mappings.
  "org.tpolecat" %% "doobie-specs2"    % "1.0.0-RC1" % "test", // Specs2 support for typechecking statements.
)

val catsEffect =  "org.typelevel" %% "cats-effect" % "3.3.14"

libraryDependencies ++= http4s ++ doobie :+ catsEffect

