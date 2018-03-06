
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object welcome_Scope0 {
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

class welcome extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /* welcome Template File */
  def apply/*2.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.16*/("""

"""),format.raw/*4.1*/("""<html>
<head>Hey this is my new application </head>

<body>
<p> Hey you.. """),_display_(/*8.16*/name),format.raw/*8.20*/("""    """),format.raw/*8.24*/("""Wazupp...!!!!!  </p>
</body>
</html>"""))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


}

/* welcome Template File */
object welcome extends welcome_Scope0.welcome
              /*
                  -- GENERATED --
                  DATE: Tue Mar 06 11:50:56 IST 2018
                  SOURCE: F:/Play Projects/mynewapp/app/views/welcome.scala.html
                  HASH: 54ac1a17e7d1eab0aba36d654f49d1426aa944a2
                  MATRIX: 772->29|881->43|909->45|1010->120|1034->124|1065->128
                  LINES: 27->2|32->2|34->4|38->8|38->8|38->8
                  -- GENERATED --
              */
          