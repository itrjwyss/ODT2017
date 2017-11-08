
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itrjwyss/Documents/gitrepos/ODT2017/PlayDemo/conf/routes
// @DATE:Wed Nov 08 13:22:41 ECT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:8
  JsonController_1: controllers.JsonController,
  // @LINE:12
  JWTController_0: controllers.JWTController,
  // @LINE:16
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:8
    JsonController_1: controllers.JsonController,
    // @LINE:12
    JWTController_0: controllers.JWTController,
    // @LINE:16
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_2, JsonController_1, JWTController_0, Assets_3, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, JsonController_1, JWTController_0, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """returnHash""", """controllers.JsonController.returnHash"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """returnObject""", """controllers.JsonController.returnObject"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """catchObject""", """controllers.JsonController.catchObject"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """returnToken""", """controllers.JWTController.returnToken"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validateToken""", """controllers.JWTController.validateToken"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_JsonController_returnHash1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("returnHash")))
  )
  private[this] lazy val controllers_JsonController_returnHash1_invoker = createInvoker(
    JsonController_1.returnHash,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JsonController",
      "returnHash",
      Nil,
      "GET",
      this.prefix + """returnHash""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_JsonController_returnObject2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("returnObject")))
  )
  private[this] lazy val controllers_JsonController_returnObject2_invoker = createInvoker(
    JsonController_1.returnObject,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JsonController",
      "returnObject",
      Nil,
      "GET",
      this.prefix + """returnObject""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_JsonController_catchObject3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("catchObject")))
  )
  private[this] lazy val controllers_JsonController_catchObject3_invoker = createInvoker(
    JsonController_1.catchObject,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JsonController",
      "catchObject",
      Nil,
      "POST",
      this.prefix + """catchObject""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_JWTController_returnToken4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("returnToken")))
  )
  private[this] lazy val controllers_JWTController_returnToken4_invoker = createInvoker(
    JWTController_0.returnToken,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JWTController",
      "returnToken",
      Nil,
      "GET",
      this.prefix + """returnToken""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_JWTController_validateToken5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validateToken")))
  )
  private[this] lazy val controllers_JWTController_validateToken5_invoker = createInvoker(
    JWTController_0.validateToken,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JWTController",
      "validateToken",
      Nil,
      "POST",
      this.prefix + """validateToken""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:8
    case controllers_JsonController_returnHash1_route(params@_) =>
      call { 
        controllers_JsonController_returnHash1_invoker.call(JsonController_1.returnHash)
      }
  
    // @LINE:9
    case controllers_JsonController_returnObject2_route(params@_) =>
      call { 
        controllers_JsonController_returnObject2_invoker.call(JsonController_1.returnObject)
      }
  
    // @LINE:10
    case controllers_JsonController_catchObject3_route(params@_) =>
      call { 
        controllers_JsonController_catchObject3_invoker.call(JsonController_1.catchObject)
      }
  
    // @LINE:12
    case controllers_JWTController_returnToken4_route(params@_) =>
      call { 
        controllers_JWTController_returnToken4_invoker.call(JWTController_0.returnToken)
      }
  
    // @LINE:13
    case controllers_JWTController_validateToken5_route(params@_) =>
      call { 
        controllers_JWTController_validateToken5_invoker.call(JWTController_0.validateToken)
      }
  
    // @LINE:16
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
