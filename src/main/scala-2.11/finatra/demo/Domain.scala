package finatra.demo

import com.twitter.finatra.request.RouteParam
import com.twitter.finatra.validation.Size

/**
  * Created by zcfrank1st on 6/20/16.
  */
case class PostRequest (
  @Size(min = 1, max = 140) message: String,
  location: Option[String],
  nsfw: Boolean = false
)

case class GetRequest (@RouteParam id: String)

