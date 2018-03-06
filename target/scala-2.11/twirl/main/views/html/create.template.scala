
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object create_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /* create Template File */
  def apply/*2.2*/(userForm: Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*2.24*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<html>
<head>
<title>Create user</title>
</head>

<body>
<h1>Create User</h1>

"""),_display_(/*13.2*/helper/*13.8*/.form(action= routes.UserController.save())/*13.51*/{_display_(Seq[Any](format.raw/*13.52*/("""
	"""),_display_(/*14.3*/helper/*14.9*/.inputText(userForm("ID"))),format.raw/*14.35*/("""
	"""),_display_(/*15.3*/helper/*15.9*/.inputText(userForm("Name"))),format.raw/*15.37*/("""
	"""),_display_(/*16.3*/helper/*16.9*/.inputText(userForm("Location"))),format.raw/*16.41*/("""
	"""),_display_(/*17.3*/helper/*17.9*/.inputText(userForm("Number"))),format.raw/*17.39*/("""
	"""),format.raw/*18.2*/("""<input type="submit" value="Create User">
""")))}),format.raw/*19.2*/("""

"""),format.raw/*21.57*/("""




"""),format.raw/*26.1*/("""</body>

</html>"""))
      }
    }
  }

  def render(userForm:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


}

/* create Template File */
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Tue Mar 06 11:50:56 IST 2018
                  SOURCE: F:/Play Projects/mynewapp/app/views/create.scala.html
                  HASH: 01ad426355f5badc9ead795130b1297d5764a98c
                  MATRIX: 773->28|905->50|932->68|959->69|1065->149|1079->155|1131->198|1170->199|1199->202|1213->208|1260->234|1289->237|1303->243|1352->271|1381->274|1395->280|1448->312|1477->315|1491->321|1542->351|1571->353|1644->396|1674->454|1706->459
                  LINES: 27->2|32->2|33->4|34->5|42->13|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|47->18|48->19|50->21|55->26
                  -- GENERATED --
              */
          