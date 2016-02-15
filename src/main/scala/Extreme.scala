//package andtho.extreme
package com.example

import unfiltered.request._
import unfiltered.response._

class ExtremeApp extends unfiltered.filter.Plan{

  def intent = {
    case Path(Seg(p :: Nil)) => ResponseString(p)
  }

}

object ExtremeServer {
  def main(args: Array[String]) {
    unfiltered.jetty.Server.anylocal.plan(new ExtremeApp).run()
  }
}

