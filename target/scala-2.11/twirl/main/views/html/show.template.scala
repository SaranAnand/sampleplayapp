
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object show_Scope0 {
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

class show extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /* show Template File */
  def apply/*2.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.14*/("""

"""),format.raw/*4.1*/("""<html>
<head>
<title>"""),_display_(/*6.9*/user/*6.13*/.id),format.raw/*6.16*/("""</title>
</head>

<body>
<h1>User found..!!!!</h1>

<h2>"""),_display_(/*12.6*/user/*12.10*/.name),format.raw/*12.15*/("""</h2>
<p>Location: """),_display_(/*13.15*/user/*13.19*/.location),format.raw/*13.28*/("""</p>
<p>Number: """),_display_(/*14.13*/user/*14.17*/.number),format.raw/*14.24*/("""</p>


</body>

</html>
"""))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/* show Template File */
object show extends show_Scope0.show
              /*
                  -- GENERATED --
                  DATE: Tue Mar 06 11:50:56 IST 2018
                  SOURCE: F:/Play Projects/mynewapp/app/views/show.scala.html
                  HASH: 7c49145b79cf4fb0333fb597427f1d6df20b8b35
                  MATRIX: 761->26|868->38|896->40|943->62|955->66|978->69|1061->126|1074->130|1100->135|1147->155|1160->159|1190->168|1234->185|1247->189|1275->196
                  LINES: 27->2|32->2|34->4|36->6|36->6|36->6|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14
                  -- GENERATED --
              */
          