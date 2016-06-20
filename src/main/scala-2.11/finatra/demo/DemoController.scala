package finatra.demo

import com.google.inject.{Inject, Singleton}
import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller




/**
  * Created by zcfrank1st on 6/20/16.
  */
@Singleton
class DemoController @Inject()() extends Controller {

  get("/ping") { request: Request =>
    "pong"
  }

  get("/name") { request: Request =>
    response.ok("hello")
  }

  post("/demo") { request: PostRequest =>
    println(request.location)
    println(request.message)
    println(request.nsfw)

    response.ok
  }
}
