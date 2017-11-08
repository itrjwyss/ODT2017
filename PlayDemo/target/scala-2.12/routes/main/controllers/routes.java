
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itrjwyss/Documents/gitrepos/ODT2017/PlayDemo/conf/routes
// @DATE:Wed Nov 08 13:22:41 ECT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseJsonController JsonController = new controllers.ReverseJsonController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseJWTController JWTController = new controllers.ReverseJWTController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseJsonController JsonController = new controllers.javascript.ReverseJsonController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseJWTController JWTController = new controllers.javascript.ReverseJWTController(RoutesPrefix.byNamePrefix());
  }

}
