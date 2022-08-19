import cats.effect.{ExitCode, IO, IOApp}
import com.comcast.ip4s._
import org.http4s.HttpRoutes
import org.http4s.dsl.io._
import org.http4s.ember.server.EmberServerBuilder
import org.http4s.implicits._

object WikiController extends IOApp {

  val wikiService = HttpRoutes.of[IO] {
    case GET -> Root / "documents"  => ???
    case GET -> Root / "documents" / title => ???
    case GET -> Root / "documents" / title / timestamp => ???
    case POST -> Root / "documents" / title / "latest" => ???
  }.orNotFound


  override def run(args: List[String]): IO[ExitCode] =
    EmberServerBuilder
      .default[IO]
      .withHost(host"0.0.0.0")
      .withPort(port"8080")
      .withHttpApp(wikiService)
      .build
      .use(_ => IO.never)
      .as(ExitCode.Success)
}
