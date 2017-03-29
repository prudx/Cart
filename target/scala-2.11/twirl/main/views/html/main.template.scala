
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Product Catalogue - """),_display_(/*14.33*/title),format.raw/*14.38*/("""</title>
    
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" 
    integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" 
    integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
    
    <!-- Custom CSS -->
    <link href=""""),_display_(/*25.18*/routes/*25.24*/.Assets.versioned("stylesheets/shop-homepage.css")),format.raw/*25.74*/("""" rel="stylesheet"> 

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
    <!-- Site header and navigation -->
    <header class="top" role="header">
        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*50.52*/routes/*50.58*/.ProductCtrl.listProducts(0)),format.raw/*50.86*/("""">Products Catalogue</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li>
                            <a href="#">About</a>
                        </li>
                        <li>
                            <a href="#">Services</a>
                        </li>
                        <li>
                            <a href="#">Contact</a>
                        </li>
                                            <!-- Login/ logout Link - check if user logged in -->
                        <li>
                            """),_display_(/*66.30*/if(user != null)/*66.46*/ {_display_(Seq[Any](format.raw/*66.48*/("""
                                """),format.raw/*67.33*/("""<a href=""""),_display_(/*67.43*/controllers/*67.54*/.security.routes.LoginCtrl.logout()),format.raw/*67.89*/("""">Logout """),_display_(/*67.99*/user/*67.103*/.getName()),format.raw/*67.113*/("""</a>
                            """)))}/*68.31*/else/*68.36*/{_display_(Seq[Any](format.raw/*68.37*/("""
                                """),format.raw/*69.33*/("""<a href=""""),_display_(/*69.43*/controllers/*69.54*/.security.routes.LoginCtrl.login()),format.raw/*69.88*/("""">Login</a>
                            """)))}),format.raw/*70.30*/("""
                        """),format.raw/*71.25*/("""</li>
                        <li>
                            <a href=""""),_display_(/*73.39*/routes/*73.45*/.ShoppingCtrl.showBasket()),format.raw/*73.71*/(""""><span class="glyphicon glyphicon-shopping-cart"></span></a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->
        </nav>
    </header>

    <!-- Page Content -->
    <div class="middle">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <p class="lead">"""),_display_(/*88.38*/title),format.raw/*88.43*/("""</p>
                <div>
            </div>

            <!-- Start Content -->
            """),_display_(/*93.14*/content),format.raw/*93.21*/("""
            """),format.raw/*94.13*/("""<!-- End Content -->

        </div>
        <!-- /.container -->
    </div>

    <!-- Footer -->
    <div class="bottom">
        <div class="container">
            <hr>
            <footer>
                <div class="row">
                    <div class="col-lg-12">
                        <p>Products Catalogue Footer</p>
                    </div>
                </div>
            </footer>
        </div>
    <!-- /.container -->
    </div>

    <!-- jQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

</body>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sat Feb 11 00:40:01 GMT 2017
                  SOURCE: /home/wdd/webapps/LoanSub/app/views/main.scala.html
                  HASH: dc2cef24fdc543ea96892c729be72d1039df5365
                  MATRIX: 766->1|916->56|944->58|1281->368|1307->373|1911->950|1926->956|1997->1006|3244->2226|3259->2232|3308->2260|4094->3019|4119->3035|4159->3037|4220->3070|4257->3080|4277->3091|4333->3126|4370->3136|4384->3140|4416->3150|4469->3185|4482->3190|4521->3191|4582->3224|4619->3234|4639->3245|4694->3279|4766->3320|4819->3345|4919->3418|4934->3424|4981->3450|5464->3906|5490->3911|5612->4006|5640->4013|5681->4026
                  LINES: 27->1|32->1|34->3|45->14|45->14|56->25|56->25|56->25|81->50|81->50|81->50|97->66|97->66|97->66|98->67|98->67|98->67|98->67|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|100->69|101->70|102->71|104->73|104->73|104->73|119->88|119->88|124->93|124->93|125->94
                  -- GENERATED --
              */
          