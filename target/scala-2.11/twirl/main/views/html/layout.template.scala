
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object layout_Scope0 {
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

class layout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /* layout Template File */
  def apply/*2.2*/(title: String)(body: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.29*/("""

"""),format.raw/*4.1*/("""<html>
<head>
<title>"""),_display_(/*6.9*/title),format.raw/*6.14*/("""</title>
</head>

<body>

"""),_display_(/*11.2*/body),format.raw/*11.6*/("""


"""),format.raw/*14.1*/("""</body>

</html>
"""))
      }
    }
  }

  def render(title:String,body:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(body)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (body) => apply(title)(body)

  def ref: this.type = this

}


}

/* layout Template File */
object layout extends layout_Scope0.layout
              /*
                  -- GENERATED --
                  DATE: Tue Mar 06 11:50:56 IST 2018
                  SOURCE: F:/Play Projects/mynewapp/app/views/layout.scala.html
                  HASH: 9ed0d29ed5c9ef92a75302bdce9268978579ee3e
                  MATRIX: 774->28|896->55|924->57|971->79|996->84|1049->111|1073->115|1103->118
                  LINES: 27->2|32->2|34->4|36->6|36->6|41->11|41->11|44->14
                  -- GENERATED --
              */
          