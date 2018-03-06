
// @GENERATOR:play-routes-compiler
// @SOURCE:F:/Play Projects/mynewapp/conf/routes
// @DATE:Tue Mar 06 11:50:56 IST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  Assets_3: controllers.Assets,
  // @LINE:13
  UserController_1: controllers.UserController,
  // @LINE:27
  LoginController_2: controllers.LoginController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    Assets_3: controllers.Assets,
    // @LINE:13
    UserController_1: controllers.UserController,
    // @LINE:27
    LoginController_2: controllers.LoginController
  ) = this(errorHandler, HomeController_0, Assets_3, UserController_1, LoginController_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_3, UserController_1, LoginController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """welcome/""" + "$" + """name<[^/]+>""", """controllers.HomeController.welcomee(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/create""", """controllers.UserController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """id<[^/]+>""", """controllers.UserController.show(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/edit/""" + "$" + """id<[^/]+>""", """controllers.UserController.edit(id:Integer)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/edit""", """controllers.UserController.update()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/create""", """controllers.UserController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/delete/""" + "$" + """id<[^/]+>""", """controllers.UserController.destroy(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login()"""),
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
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_welcomee2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("welcome/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_welcomee2_invoker = createInvoker(
    HomeController_0.welcomee(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "welcomee",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """welcome/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_index3_invoker = createInvoker(
    UserController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """users"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_create4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/create")))
  )
  private[this] lazy val controllers_UserController_create4_invoker = createInvoker(
    UserController_1.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "create",
      Nil,
      "GET",
      """""",
      this.prefix + """users/create"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UserController_show5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_show5_invoker = createInvoker(
    UserController_1.show(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """users/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UserController_edit6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_edit6_invoker = createInvoker(
    UserController_1.edit(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "edit",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """users/edit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_UserController_update7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/edit")))
  )
  private[this] lazy val controllers_UserController_update7_invoker = createInvoker(
    UserController_1.update(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "update",
      Nil,
      "PUT",
      """""",
      this.prefix + """users/edit"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_UserController_save8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/create")))
  )
  private[this] lazy val controllers_UserController_save8_invoker = createInvoker(
    UserController_1.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """users/create"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_UserController_destroy9_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_destroy9_invoker = createInvoker(
    UserController_1.destroy(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "destroy",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """users/delete/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_LoginController_login10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login10_invoker = createInvoker(
    LoginController_2.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_HomeController_welcomee2_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_HomeController_welcomee2_invoker.call(HomeController_0.welcomee(name))
      }
  
    // @LINE:13
    case controllers_UserController_index3_route(params) =>
      call { 
        controllers_UserController_index3_invoker.call(UserController_1.index)
      }
  
    // @LINE:15
    case controllers_UserController_create4_route(params) =>
      call { 
        controllers_UserController_create4_invoker.call(UserController_1.create())
      }
  
    // @LINE:17
    case controllers_UserController_show5_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UserController_show5_invoker.call(UserController_1.show(id))
      }
  
    // @LINE:19
    case controllers_UserController_edit6_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UserController_edit6_invoker.call(UserController_1.edit(id))
      }
  
    // @LINE:21
    case controllers_UserController_update7_route(params) =>
      call { 
        controllers_UserController_update7_invoker.call(UserController_1.update())
      }
  
    // @LINE:23
    case controllers_UserController_save8_route(params) =>
      call { 
        controllers_UserController_save8_invoker.call(UserController_1.save())
      }
  
    // @LINE:25
    case controllers_UserController_destroy9_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UserController_destroy9_invoker.call(UserController_1.destroy(id))
      }
  
    // @LINE:27
    case controllers_LoginController_login10_route(params) =>
      call { 
        controllers_LoginController_login10_invoker.call(LoginController_2.login())
      }
  }
}
