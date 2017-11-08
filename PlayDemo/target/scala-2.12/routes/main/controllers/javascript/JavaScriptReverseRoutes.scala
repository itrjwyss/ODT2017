
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itrjwyss/Documents/gitrepos/ODT2017/PlayDemo/conf/routes
// @DATE:Wed Nov 08 13:22:41 ECT 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:8
  class ReverseJsonController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def catchObject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JsonController.catchObject",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "catchObject"})
        }
      """
    )
  
    // @LINE:8
    def returnHash: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JsonController.returnHash",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "returnHash"})
        }
      """
    )
  
    // @LINE:9
    def returnObject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JsonController.returnObject",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "returnObject"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseJWTController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def validateToken: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JWTController.validateToken",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validateToken"})
        }
      """
    )
  
    // @LINE:12
    def returnToken: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JWTController.returnToken",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "returnToken"})
        }
      """
    )
  
  }


}
