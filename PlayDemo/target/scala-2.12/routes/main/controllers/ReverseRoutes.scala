
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itrjwyss/Documents/gitrepos/ODT2017/PlayDemo/conf/routes
// @DATE:Wed Nov 08 13:22:41 ECT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:8
  class ReverseJsonController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def catchObject(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "catchObject")
    }
  
    // @LINE:8
    def returnHash(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "returnHash")
    }
  
    // @LINE:9
    def returnObject(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "returnObject")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:12
  class ReverseJWTController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def validateToken(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validateToken")
    }
  
    // @LINE:12
    def returnToken(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "returnToken")
    }
  
  }


}
