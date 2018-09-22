<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import= "java.util.*,com.nisum.dao.*"  %>
<jsp:include page="simpleHeader.jsp"></jsp:include>

        <!--================Categories Banner Area =================-->
        <section class="categories_banner_area">
            <div class="container">
                <div class="c_banner_inner">
                    <h3>shop grid with left sidebar</h3>
                    <ul>
                        <li><a href="#">Home</a></li>
                        <li><a href="#">Shop</a></li>
                        <li class="current"><a href="#">Shop Grid with Left Sidebar</a></li>
                    </ul>
                </div>
            </div>
        </section>
        <!--================End Categories Banner Area =================-->
        
        <!--================Categories Product Area =================-->
        <section class="no_sidebar_2column_area">
            <div class="container">
                <div class="showing_fillter">
                    <div class="row m0">
                        <div class="first_fillter">
                          <h4>Showing 4 of 4 total</h4>
                        </div>
                        <div class="secand_fillter">
                          
                        </div>
                        <div class="third_fillter">
                          
                        </div>
                        <div class="four_fillter">
                           
                        </div>
                    </div>
                </div> -->
                <div class="two_column_product">
                    <div class="row">
                      <% List<Product> productItems=(List<Product>)request.getAttribute("productItems"); 
                      for(Product product:productItems)
                      { %>
                        <div class="col-sm-6">
                         <form action="viewCtrl">
                             <input type="hidden" name="pid" value="<%out.print(product.getpId()); %>" >
                            <div class="l_product_item">
                                <div class="l_p_img">
                                    <img src="resources/img/product/two-column/<%out.print(product.getImg()); %>" alt="">
                                    <h5 class="sale">Sale</h5>
                                </div>
                                <div class="l_p_text">
                                   <ul>
                                        <li class="p_icon"><a href="#"><i class="icon_piechart"></i></a></li>
                                        <button type="submit" class="add_cart_btn">VIEW</button>
                                        <li class="p_icon"><a href="#"><i class="icon_heart_alt"></i></a></li>
                                    </ul>
                                    
                                    <h4><%out.print(product.getName()); %></h4>
                                    <h5> Rs <%out.print(product.getPrice()); %></h5>
                                </div>
                            </div>
                            </form>
                        </div>
                        <% } 
                     
                        %>
                        
                       
                    </div>
                   
                </div>
            </div>
        </section>
        <!--================End Categories Product Area =================-->
        
 <jsp:include page="footer.jsp"></jsp:include>
   