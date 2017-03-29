
package views.html.productAdmin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateProduct_Scope0 {
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

class updateProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Long,Form[models.products.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateProductForm: Form[models.products.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models.products._
import helper._

Seq[Any](format.raw/*1.87*/("""
"""),format.raw/*2.1*/("""<!-- Product id and editProductForm parameters defined above
 passed to this view by the controller -->
 """),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!-- a 'helper' will be used to create the form dynamically, 
though a static HTML form would also work -->
"""),format.raw/*9.1*/("""
"""),format.raw/*10.1*/("""<!-- The page will be based on the main template -->
"""),_display_(/*11.2*/productAdmin/*11.14*/.main("Update Product", user)/*11.43*/ {_display_(Seq[Any](format.raw/*11.45*/("""

	"""),format.raw/*13.2*/("""<h3>Update Product</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*16.3*/form(action = routes.AdminProductCtrl.updateProductSubmit(id), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*16.144*/ {_display_(Seq[Any](format.raw/*16.146*/("""
		
		"""),format.raw/*18.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*20.4*/inputText(updateProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*20.84*/("""
		"""),_display_(/*21.4*/inputText(updateProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*21.98*/("""

        """),format.raw/*23.9*/("""<!-- Checkboxes for categories - current categories for this product are checked -->
        <!-- Category.options provides a hashmap of value, name pairs -->
        <!-- If product (id) is in catagory - mark it as checked -->
        <!-- Checkbox name is catSelect[],  selected values will be stored in form object using catSelect defined in Product  -->
        """),_display_(/*27.10*/for((value, name) <- Category.options) yield /*27.48*/ {_display_(Seq[Any](format.raw/*27.50*/("""
            """),format.raw/*28.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*28.63*/value),format.raw/*28.68*/(""""
            """),_display_(/*29.14*/if(Category.inCategory(value.toLong, id))/*29.55*/ {_display_(Seq[Any](format.raw/*29.57*/("""
                """),format.raw/*30.17*/("""checked
            """)))}),format.raw/*31.14*/("""
            """),format.raw/*32.13*/("""/>"""),_display_(/*32.16*/name),format.raw/*32.20*/("""<br>        
        """)))}),format.raw/*33.10*/("""

		"""),_display_(/*35.4*/inputText(updateProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*35.86*/("""
		"""),_display_(/*36.4*/inputText(updateProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*36.86*/("""

		"""),format.raw/*38.3*/("""<!-- Image upload input -->
		<label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>

	<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*47.14*/routes/*47.20*/.AdminProductCtrl.listProducts(0)),format.raw/*47.53*/(""""
				<button class="btn btn-warning" role="button">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*51.3*/(""" """),format.raw/*51.4*/("""<!-- End Form definition -->

""")))}),format.raw/*53.2*/(""" """),format.raw/*53.3*/("""<!-- End of page content -->


"""))
      }
    }
  }

  def render(id:Long,updateProductForm:Form[models.products.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateProductForm,user)

  def f:((Long,Form[models.products.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateProductForm,user) => apply(id,updateProductForm,user)

  def ref: this.type = this

}


}

/**/
object updateProduct extends updateProduct_Scope0.updateProduct
              /*
                  -- GENERATED --
                  DATE: Sat Feb 11 00:40:01 GMT 2017
                  SOURCE: /home/wdd/webapps/LoanSub/app/views/productAdmin/updateProduct.scala.html
                  HASH: c56981347767d5f1807477ecd5c702a96fcb83da
                  MATRIX: 820->1|1040->86|1067->87|1198->218|1225->219|1359->344|1387->345|1467->399|1488->411|1526->440|1566->442|1596->445|1714->537|1865->678|1906->680|1939->686|2060->781|2161->861|2191->865|2306->959|2343->969|2737->1336|2791->1374|2831->1376|2872->1389|2949->1439|2975->1444|3017->1459|3067->1500|3107->1502|3152->1519|3204->1540|3245->1553|3275->1556|3300->1560|3353->1582|3384->1587|3487->1669|3517->1673|3620->1755|3651->1759|3940->2021|3955->2027|4009->2060|4126->2147|4154->2148|4215->2179|4243->2180
                  LINES: 27->1|33->1|34->2|36->5|37->6|39->9|40->10|41->11|41->11|41->11|41->11|43->13|46->16|46->16|46->16|48->18|50->20|50->20|51->21|51->21|53->23|57->27|57->27|57->27|58->28|58->28|58->28|59->29|59->29|59->29|60->30|61->31|62->32|62->32|62->32|63->33|65->35|65->35|66->36|66->36|68->38|77->47|77->47|77->47|81->51|81->51|83->53|83->53
                  -- GENERATED --
              */
          