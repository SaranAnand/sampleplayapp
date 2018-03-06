
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object userapp_Scope0 {
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

class userapp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[User],play.twirl.api.HtmlFormat.Appendable] {

  /* index Template File */
  def apply/*2.2*/(users: List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.21*/("""

"""),_display_(/*4.2*/layout("All Users")/*4.21*/{_display_(Seq[Any](format.raw/*4.22*/("""
"""),format.raw/*5.1*/("""<h1>All Users</h1>

<a href=""""),_display_(/*7.11*/routes/*7.17*/.UserController.create),format.raw/*7.39*/("""">Click here to Create User</a><br><br>

"""),_display_(/*9.2*/for(user<-users) yield /*9.18*/{_display_(Seq[Any](format.raw/*9.19*/("""

"""),format.raw/*11.1*/("""<a>"""),_display_(/*11.5*/user/*11.9*/.id),format.raw/*11.12*/("""</a>
<p>Name: """),_display_(/*12.11*/user/*12.15*/.name),format.raw/*12.20*/("""</p>
<p>location: """),_display_(/*13.15*/user/*13.19*/.location),format.raw/*13.28*/("""</p> 
<p>Number: """),_display_(/*14.13*/user/*14.17*/.number),format.raw/*14.24*/("""</p>

<a href=""""),_display_(/*16.11*/routes/*16.17*/.UserController.edit(user.id)),format.raw/*16.46*/("""">Edit User</a>

<a href=""""),_display_(/*18.11*/routes/*18.17*/.UserController.destroy(user.id)),format.raw/*18.49*/("""">Delete User</a><br><br>	

""")))}),format.raw/*20.2*/("""
""")))}),format.raw/*21.2*/("""


"""))
      }
    }
  }

  def render(users:List[User]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((List[User]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


}

/* index Template File */
object userapp extends userapp_Scope0.userapp
              /*
                  -- GENERATED --
                  DATE: Tue Mar 06 11:50:56 IST 2018
                  SOURCE: F:/Play Projects/mynewapp/app/views/userapp.scala.html
                  HASH: 6e421d52959c343841c91df70900447e06135a1a
                  MATRIX: 774->27|888->46|916->49|943->68|981->69|1008->70|1064->100|1078->106|1120->128|1187->170|1218->186|1256->187|1285->189|1315->193|1327->197|1351->200|1393->215|1406->219|1432->224|1478->243|1491->247|1521->256|1566->274|1579->278|1607->285|1650->301|1665->307|1715->336|1769->363|1784->369|1837->401|1896->430|1928->432
                  LINES: 27->2|32->2|34->4|34->4|34->4|35->5|37->7|37->7|37->7|39->9|39->9|39->9|41->11|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|46->16|46->16|46->16|48->18|48->18|48->18|50->20|51->21
                  -- GENERATED --
              */
          