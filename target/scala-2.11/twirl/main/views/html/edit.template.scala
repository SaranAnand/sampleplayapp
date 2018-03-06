
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object edit_Scope0 {
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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /* edit Template File */
  def apply/*2.2*/(userForm: Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*2.24*/("""
"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/layout("Edit User")/*6.21*/{_display_(Seq[Any](format.raw/*6.22*/("""
"""),format.raw/*7.1*/("""<h1>Edit User</h1>

"""),_display_(/*9.2*/helper/*9.8*/.form(action= routes.UserController.update())/*9.53*/{_display_(Seq[Any](format.raw/*9.54*/("""	
	"""),_display_(/*10.3*/helper/*10.9*/.inputText(userForm("ID"))),format.raw/*10.35*/("""
	"""),_display_(/*11.3*/helper/*11.9*/.inputText(userForm("Name"))),format.raw/*11.37*/("""
	"""),_display_(/*12.3*/helper/*12.9*/.inputText(userForm("Location"))),format.raw/*12.41*/("""
	"""),_display_(/*13.3*/helper/*13.9*/.inputText(userForm("Number"))),format.raw/*13.39*/("""
	"""),format.raw/*14.2*/("""<input type="submit" value="Edit User">
		
""")))}),format.raw/*16.2*/("""
""")))}),format.raw/*17.2*/("""

"""))
      }
    }
  }

  def render(userForm:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


}

/* edit Template File */
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Tue Mar 06 11:50:56 IST 2018
                  SOURCE: F:/Play Projects/mynewapp/app/views/edit.scala.html
                  HASH: 093c213f0e559d128d92b9a7e1f84ba0233b0dc9
                  MATRIX: 767->26|899->48|926->66|954->69|981->88|1019->89|1046->90|1092->111|1105->117|1158->162|1196->163|1226->167|1240->173|1287->199|1316->202|1330->208|1379->236|1408->239|1422->245|1475->277|1504->280|1518->286|1569->316|1598->318|1672->362|1704->364
                  LINES: 27->2|32->2|33->4|35->6|35->6|35->6|36->7|38->9|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|45->16|46->17
                  -- GENERATED --
              */
          