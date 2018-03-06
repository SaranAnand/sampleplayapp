
// @GENERATOR:play-routes-compiler
// @SOURCE:F:/Play Projects/mynewapp/conf/routes
// @DATE:Tue Mar 06 11:50:56 IST 2018


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
