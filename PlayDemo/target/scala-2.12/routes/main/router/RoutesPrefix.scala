
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itrjwyss/Documents/gitrepos/ODT2017/PlayDemo/conf/routes
// @DATE:Wed Nov 08 13:22:41 ECT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
