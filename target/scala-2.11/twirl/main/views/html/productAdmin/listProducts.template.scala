
package views.html.productAdmin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listProducts_Scope0 {
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

     object listProducts_Scope1 {
import models.products.Category
import models.products.Product
import models.users.User

class listProducts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[play.api.Environment,List[Category],List[Product],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(env: play.api.Environment, categories: List[Category], products: List[Product], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.94*/("""


"""),format.raw/*7.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*8.2*/productAdmin/*8.14*/.main("Products Page", user)/*8.42*/ {_display_(Seq[Any](format.raw/*8.44*/("""


"""),format.raw/*11.1*/("""<div class="row">

  <div class="col-md-3">
      <div class="list-group">
				<!-- Start of For loop - For each c in categories add a link -->
				<a href=""""),_display_(/*16.15*/routes/*16.21*/.AdminProductCtrl.listProducts(0)),format.raw/*16.54*/("""" class="list-group-item">All categories</a>
				"""),_display_(/*17.6*/for(c <- categories) yield /*17.26*/ {_display_(Seq[Any](format.raw/*17.28*/("""
          """),format.raw/*18.11*/("""<a href=""""),_display_(/*18.21*/routes/*18.27*/.AdminProductCtrl.listProducts(c.getId)),format.raw/*18.66*/("""" class="list-group-item">"""),_display_(/*18.93*/c/*18.94*/.getName),format.raw/*18.102*/("""</a>
				""")))}),format.raw/*19.6*/("""
      """),format.raw/*20.7*/("""</div>
  </div>

	<div class="col-md-9">
		"""),_display_(/*24.4*/if(flash.containsKey("success"))/*24.36*/ {_display_(Seq[Any](format.raw/*24.38*/("""
			  """),format.raw/*25.6*/("""<div class="alert alert-success">
			      """),_display_(/*26.11*/flash/*26.16*/.get("success")),format.raw/*26.31*/("""
			  """),format.raw/*27.6*/("""</div>
		""")))}),format.raw/*28.4*/(""" 

		"""),format.raw/*30.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
                <th></th>
				<th>ID</th>
				<th>Name</th>
				<th>Description</th>
				<th>Stock</th>
				<th>Price</th>
			</tr>
			</thead>
			<tbody>
				<!-- Start of For loop - For each p in products add a row -->
				"""),_display_(/*44.6*/for(p <- products) yield /*44.24*/ {_display_(Seq[Any](format.raw/*44.26*/("""
				"""),format.raw/*45.5*/("""<tr>
					<!-- Display each product field value in a column -->
					"""),_display_(/*47.7*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*47.95*/ {_display_(Seq[Any](format.raw/*47.97*/("""
						"""),format.raw/*48.7*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*48.62*/(p.getId)),format.raw/*48.71*/(""".jpg"/></td>
					""")))}/*49.8*/else/*49.13*/{_display_(Seq[Any](format.raw/*49.14*/("""
						"""),format.raw/*50.7*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
					""")))}),format.raw/*51.7*/("""
					"""),format.raw/*52.6*/("""<td>"""),_display_(/*52.11*/p/*52.12*/.getId),format.raw/*52.18*/("""</td>
					<td>"""),_display_(/*53.11*/p/*53.12*/.getName),format.raw/*53.20*/("""</td>
					<td>"""),_display_(/*54.11*/p/*54.12*/.getDescription),format.raw/*54.27*/("""</td>
					<td>"""),_display_(/*55.11*/p/*55.12*/.getStock),format.raw/*55.21*/("""</td>
					<td>&euro; """),_display_(/*56.18*/("%.2f".format(p.getPrice))),format.raw/*56.45*/("""</td>
					<!-- Edit product button -->
					"""),_display_(/*58.7*/if(user != null)/*58.23*/ {_display_(Seq[Any](format.raw/*58.25*/("""
					"""),format.raw/*59.6*/("""<td>
						<a href=""""),_display_(/*60.17*/routes/*60.23*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*60.63*/("""" class="btn-xs btn-danger">
						<span class="glyphicon glyphicon-pencil"></span></a>
					</td>
					<!-- Delete product button -->
					<td>
						<a href=""""),_display_(/*65.17*/routes/*65.23*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*65.63*/("""" class="btn-xs btn-danger"
						onclick="return confirmDel();">
						<span class="glyphicon glyphicon-trash"></span></a>
					</td>
					""")))}),format.raw/*69.7*/("""
				"""),format.raw/*70.5*/("""</tr>
				""")))}),format.raw/*71.6*/("""<!-- End of For loop -->
			</tbody>
		</table>
		"""),_display_(/*74.4*/if(user != null)/*74.20*/ {_display_(Seq[Any](format.raw/*74.22*/("""
		"""),format.raw/*75.3*/("""<div>
			<a href=""""),_display_(/*76.14*/routes/*76.20*/.AdminProductCtrl.addProduct()),format.raw/*76.50*/("""">
				<button class="btn btn-primary">Add a Product</button>
			</a>
		</div>
		""")))}),format.raw/*80.4*/("""
	"""),format.raw/*81.2*/("""</div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*86.24*/("""{"""),format.raw/*86.25*/("""
		"""),format.raw/*87.3*/("""return confirm('Are you sure?');
	"""),format.raw/*88.2*/("""}"""),format.raw/*88.3*/("""
"""),format.raw/*89.1*/("""</script>
""")))}),format.raw/*90.2*/("""

"""))
      }
    }
  }

  def render(env:play.api.Environment,categories:List[Category],products:List[Product],user:User): play.twirl.api.HtmlFormat.Appendable = apply(env,categories,products,user)

  def f:((play.api.Environment,List[Category],List[Product],User) => play.twirl.api.HtmlFormat.Appendable) = (env,categories,products,user) => apply(env,categories,products,user)

  def ref: this.type = this

}


}
}

/**/
object listProducts extends listProducts_Scope0.listProducts_Scope1.listProducts
              /*
                  -- GENERATED --
                  DATE: Sat Feb 11 00:40:01 GMT 2017
                  SOURCE: /home/wdd/webapps/LoanSub/app/views/productAdmin/listProducts.scala.html
                  HASH: 134fae2b5aad4e534636854c07451e124ac3a0ea
                  MATRIX: 943->92|1130->184|1159->187|1230->233|1250->245|1286->273|1325->275|1355->278|1540->436|1555->442|1609->475|1685->525|1721->545|1761->547|1800->558|1837->568|1852->574|1912->613|1966->640|1976->641|2006->649|2046->659|2080->666|2150->710|2191->742|2231->744|2264->750|2335->794|2349->799|2385->814|2418->820|2458->830|2490->835|2852->1171|2886->1189|2926->1191|2958->1196|3054->1266|3151->1354|3191->1356|3225->1363|3307->1418|3337->1427|3374->1447|3387->1452|3426->1453|3460->1460|3570->1540|3603->1546|3635->1551|3645->1552|3672->1558|3715->1574|3725->1575|3754->1583|3797->1599|3807->1600|3843->1615|3886->1631|3896->1632|3926->1641|3976->1664|4024->1691|4096->1737|4121->1753|4161->1755|4194->1761|4242->1782|4257->1788|4318->1828|4506->1989|4521->1995|4582->2035|4753->2176|4785->2181|4826->2192|4903->2243|4928->2259|4968->2261|4998->2264|5044->2283|5059->2289|5110->2319|5222->2401|5251->2403|5400->2524|5429->2525|5459->2528|5520->2562|5548->2563|5576->2564|5617->2575
                  LINES: 32->4|37->4|40->7|41->8|41->8|41->8|41->8|44->11|49->16|49->16|49->16|50->17|50->17|50->17|51->18|51->18|51->18|51->18|51->18|51->18|51->18|52->19|53->20|57->24|57->24|57->24|58->25|59->26|59->26|59->26|60->27|61->28|63->30|77->44|77->44|77->44|78->45|80->47|80->47|80->47|81->48|81->48|81->48|82->49|82->49|82->49|83->50|84->51|85->52|85->52|85->52|85->52|86->53|86->53|86->53|87->54|87->54|87->54|88->55|88->55|88->55|89->56|89->56|91->58|91->58|91->58|92->59|93->60|93->60|93->60|98->65|98->65|98->65|102->69|103->70|104->71|107->74|107->74|107->74|108->75|109->76|109->76|109->76|113->80|114->81|119->86|119->86|120->87|121->88|121->88|122->89|123->90
                  -- GENERATED --
              */
          