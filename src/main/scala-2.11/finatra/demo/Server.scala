package finatra.demo

import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.filters.CommonFilters
import com.twitter.finatra.http.routing.HttpRouter

/**
  * Created by zcfrank1st on 6/20/16.
  */
object DemoServer extends Server

class Server extends HttpServer {
  override protected def configureHttp(router: HttpRouter): Unit = {
    router
      .filter[CommonFilters]
      .add[DemoController]
  }
}
