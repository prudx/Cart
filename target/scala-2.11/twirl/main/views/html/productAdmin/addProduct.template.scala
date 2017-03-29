
package views.html.productAdmin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
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

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.products.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addProductForm: Form[models.products.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models.products._
import helper._

Seq[Any](format.raw/*1.74*/("""
"""),format.raw/*2.1*/("""<!-- addProductForm defined above is the parameter
 passed to this view by the controller -->
"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!-- a 'helper' will be used to create the form dynamically, 
though a static HTML form would also work -->
"""),format.raw/*9.1*/("""
"""),format.raw/*10.1*/("""<!-- The page will be based on the main template -->
"""),_display_(/*11.2*/productAdmin/*11.14*/.main("New Product", user)/*11.40*/ {_display_(Seq[Any](format.raw/*11.42*/("""

	"""),format.raw/*13.2*/("""<h3>Add a new Product</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*16.3*/form(action = routes.AdminProductCtrl.addProductSubmit(), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*16.139*/ {_display_(Seq[Any](format.raw/*16.141*/("""
		
		"""),format.raw/*18.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*20.4*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*20.81*/("""
		"""),_display_(/*21.4*/inputText(addProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*21.95*/("""

        """),format.raw/*23.9*/("""<!-- Checkboxes for categories - current categories for this product are checked -->
        <!-- Category.options provides a hashmap of value, name pairs -->
        """),_display_(/*25.10*/for((value, name) <- Category.options) yield /*25.48*/ {_display_(Seq[Any](format.raw/*25.50*/("""
            """),format.raw/*26.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*26.63*/value),format.raw/*26.68*/("""" />"""),_display_(/*26.73*/name),format.raw/*26.77*/("""<br>        
        """)))}),format.raw/*27.10*/("""

		"""),_display_(/*29.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*29.83*/("""
		"""),_display_(/*30.4*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*30.83*/("""

		"""),format.raw/*32.3*/("""<!-- Image upload input -->
		<label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>

	<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Add Product" class="btn btn-primary">
			<a href=""""),_display_(/*41.14*/routes/*41.20*/.AdminProductCtrl.listProducts(0)),format.raw/*41.53*/(""""
				<button class="btn btn-warning">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*45.3*/(""" """),format.raw/*45.4*/("""<!-- End Form definition -->

""")))}),format.raw/*47.2*/(""" """),format.raw/*47.3*/("""<!-- End of page content -->


"""))
      }
    }
  }

  def render(addProductForm:Form[models.products.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user)

  def f:((Form[models.products.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user) => apply(addProductForm,user)

  def ref: this.type = this

}


}

/**/
object addProduct extends addProduct_Scope0.addProduct
              /*
                  -- GENERATED --
                  DATE: Sat Feb 11 00:40:01 GMT 2017
                  SOURCE: /home/wdd/webapps/LoanSub/app/views/productAdmin/addProduct.scala.html
                  HASH: c2b7a0c5adfb26d62b28461d3449f645ae2052aa
                  MATRIX: 809->1|1016->73|1043->74|1163->194|1190->195|1324->320|1352->321|1432->375|1453->387|1488->413|1528->415|1558->418|1679->513|1825->649|1866->651|1899->657|2020->752|2118->829|2148->833|2260->924|2297->934|2492->1102|2546->1140|2586->1142|2627->1155|2704->1205|2730->1210|2762->1215|2787->1219|2840->1241|2871->1246|2971->1325|3001->1329|3101->1408|3132->1412|3428->1681|3443->1687|3497->1720|3600->1793|3628->1794|3689->1825|3717->1826
                  LINES: 27->1|33->1|34->2|36->5|37->6|39->9|40->10|41->11|41->11|41->11|41->11|43->13|46->16|46->16|46->16|48->18|50->20|50->20|51->21|51->21|53->23|55->25|55->25|55->25|56->26|56->26|56->26|56->26|56->26|57->27|59->29|59->29|60->30|60->30|62->32|71->41|71->41|71->41|75->45|75->45|77->47|77->47
                  -- GENERATED --
              */
          