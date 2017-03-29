
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/LoanSub/conf/routes
// @DATE:Sat Feb 11 00:40:00 GMT 2017


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
