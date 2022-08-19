import cats.Monad
import doobie.Transactor

class WikiRepository[F[_]](transactor: Transactor[F])(implicit F: Monad[F]) {
}