<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.nisum.dao.*"%>
<jsp:include page="simpleHeader.jsp"></jsp:include>

        
        <!--================Categories Banner Area =================-->
        <section class="categories_banner_area">
            <div class="container">
                <div class="c_banner_inner">
                    <h3>simple product</h3>
                    <ul>
                        <li><a href="#">Home</a></li>
                        <li><a href="#">Shop</a></li>
                        <li class="current"><a href="#">Simple Product</a></li>
                    </ul>
                </div>
            </div>
        </section>
        <!--================End Categories Banner Area =================-->
        
        <!--================Product Details Area =================-->
        <section class="product_details_area">
        <% Product product=(Product)request.getAttribute("productObj"); 
        System.out.println("##############################################");
        	System.out.println(product.getName());
        	System.out.println(product.getDescrip());
        	System.out.println(product.getImg());
        	System.out.println(product.getImg5());
        	 System.out.println("##############################################");
        	
        	
        
        %>
            <div class="container">
                <div class="row">
                    <div class="col-lg-4">
                        <div class="product_details_slider">
                            <div id="product_slider" class="rev_slider" data-version="5.3.1.6">
                                <ul>	
                                    <li data-index="rs-137221490" data-transition="scaledownfrombottom" data-slotamount="7"  data-easein="Power3.easeInOut" data-easeout="Power3.easeInOut" data-masterspeed="1500"  data-thumb="resources/img/product/product-details/<%out.println(product.getImg());%>"  data-rotate="0"  data-fstransition="fade" data-fsmasterspeed="1500" data-fsslotamount="7" data-saveperformance="off"  data-title="Ishtar X Tussilago" data-param1="25/08/2015" data-description="">
                                        <!-- MAIN IMAGE -->
                                        <img src="resources//img/product/product-details/<%out.println(product.getImg());%>"  alt="" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" data-bgparallax="5" class="rev-slidebg" data-no-retina>
                                        <!-- LAYERS -->
                                        <!-- Result=<% out.println(request.getAttribute("result")); %>
                                         -->
                                         
                                    </li>
                                    <!-- SLIDE  -->
                                    <li data-index="rs-136228343" data-transition="scaledownfrombottom" data-slotamount="7"  data-easein="Power3.easeInOut" data-easeout="Power3.easeInOut" data-masterspeed="1500"  data-thumb="resources/img/product/product-details/<%out.println(product.getImg2());%>"  data-rotate="0"  data-saveperformance="off"  data-title="Los Angeles" data-param1="13/08/2015" data-description="">
                                        <!-- MAIN IMAGE -->
                                        <img src="resources//img/product/product-details/<%out.println(product.getImg2());%>"  alt="" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" data-bgparallax="5" class="rev-slidebg" data-no-retina>
                                        <!-- LAYERS -->
                                    </li>
                                    <!-- SLIDE  -->
                                    <li data-index="rs-135960434" data-transition="scaledownfrombottom" data-slotamount="7"  data-easein="Power3.easeInOut" data-easeout="Power3.easeInOut" data-masterspeed="1500"  data-thumb="resources/img/product/product-details/<%out.println(product.getImg3());%>"  data-rotate="0"  data-saveperformance="off"  data-title="The Colors of Feelings" data-param1="11/08/2015" data-description="">
                                        <!-- MAIN IMAGE -->
                                        <img src="resources/img/product/product-details/<%out.println(product.getImg3());%>"  alt="" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" data-bgparallax="5" class="rev-slidebg" data-no-retina>
                                        <!-- LAYERS -->

                                       
                                    </li>
                                    <!-- SLIDE  -->
                                    <li data-index="rs-134008155" data-transition="scaledownfrombottom" data-slotamount="7"  data-easein="Power3.easeInOut" data-easeout="Power3.easeInOut" data-masterspeed="1500"  data-thumb="resources/img/product/product-details/<%out.println(product.getImg4());%>"  data-rotate="0"  data-saveperformance="off"  data-title="Powerful Iceland" data-param1="20/07/2015" data-description="">
                                        <!-- MAIN IMAGE -->
                                       <img src="resources/img/product/product-details/<%out.println(product.getImg4());%>"  alt="" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" data-bgparallax="5" class="rev-slidebg" data-no-retina>
                                        <!-- LAYERS -->

                                    </li>
                                    <!-- SLIDE  -->
                                    <li data-index="rs-134774977" data-transition="scaledownfrombottom" data-slotamount="7"  data-easein="Power3.easeInOut" data-easeout="Power3.easeInOut" data-masterspeed="1500"  data-thumb="resources/img/product/product-details/<%out.println(product.getImg5());%>"   data-rotate="0"  data-saveperformance="off"  data-title="Paris Poetry" data-param1="28/07/2015" data-description="">
                                        <!-- MAIN IMAGE -->
                                        <img src="resources/img/product/product-details/<%out.println(product.getImg5());%>"  alt="" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" data-bgparallax="5" class="rev-slidebg" data-no-retina>
                                        <!-- LAYERS -->

                                    </li>
                                    <!-- SLIDE  -->
                                    <li data-index="rs-134208766" data-transition="scaledownfrombottom" data-slotamount="7"  data-easein="Power3.easeInOut" data-easeout="Power3.easeInOut" data-masterspeed="1500"  data-thumb="resources/img/product/product-details/<%out.println(product.getImg());%>"  data-rotate="0"  data-saveperformance="off"  data-title="Creativity Room - New Fubiz 2015" data-param1="22/07/2015" data-description="">
                                        <!-- MAIN IMAGE -->
                                        <img src="resources/img/product/product-details/<%out.println(product.getImg());%>"  alt="" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" data-bgparallax="5" class="rev-slidebg" data-no-retina>
                                        <!-- LAYERS -->

                                    </li>
                                    <!-- SLIDE  -->
                                    <li data-index="rs-132884121" data-transition="scaledownfrombottom" data-slotamount="7"  data-easein="Power3.easeInOut" data-easeout="Power3.easeInOut" data-masterspeed="1500"  data-thumb="resources/img/product/product-details/<%out.println(product.getImg2());%>"  data-rotate="0"  data-saveperformance="off"  data-title="Animated GIFS - New Fubiz 2015" data-param1="07/07/2015" data-description="">
                                        <!-- MAIN IMAGE -->
                                        <img src="resources/img/product/product-details/<%out.println(product.getImg2());%>"  alt="" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" data-bgparallax="5" class="rev-slidebg" data-no-retina>
                                        <!-- LAYERS -->

                                    </li>
                                    <!-- SLIDE  -->
                                    <li data-index="rs-130740141" data-transition="scaledownfrombottom" data-slotamount="7"  data-easein="Power3.easeInOut" data-easeout="Power3.easeInOut" data-masterspeed="1500"  data-thumb="resources/img/product/product-details/<%out.println(product.getImg3());%>"  data-rotate="0"  data-saveperformance="off"  data-title="Naive New Beaters - Run Away" data-param1="15/06/2015" data-description="">
                                        <!-- MAIN IMAGE -->
                                        <img src="resources/img/product/product-details/<%out.println(product.getImg3());%>"  alt="" data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat" data-bgparallax="5" class="rev-slidebg" data-no-retina>
                                        <!-- LAYERS -->

                                    </li>
                                    <!-- SLIDE  -->
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-8">
                        <div class="product_details_text">
                   
                   <h3> <% out.println(product.getDescrip()); %></h3>
                         <% if(Integer.parseInt(product.getQuantity())>0) {%> 
                            <h6>Available In <span>Stock</span></h6> <% }else{ %>
                            <h6> <span>Out of Stock</span></h6> <%} %>
             
                            <h4> Rs.<%out.println(product.getPrice()); %></h4>
                            <p> <%out.println(product.getName()); %></p>
                             
     <!-- Form_xxx -->                
      					<form action="addtocart" method="get">    
                            <div class="p_color">
                                <h4 class="p_d_title">size <span>*</span></h4>
                                <select class="selectpicker" name="size">
                                    <option>S</option>
                                    <option>M</option>
                                       <option>L</option>
                                </select>
                            </div>
                            <div class="quantity">
                                <div class="custom">
                                    <button onclick="var result = document.getElementById('sst'); var sst = result.value; if( !isNaN( sst ) &amp;&amp; sst > 0 ) result.value--;return false;" class="reduced items-count" type="button"><i class="icon_minus-06"></i></button>
                                    <input type="text" name="qty" id="sst" maxlength="12" value="01" title="Quantity:" class="input-text qty">
                                    <button onclick="var result = document.getElementById('sst'); var sst = result.value; if( !isNaN( sst )) result.value++;return false;" class="increase items-count" type="button"><i class="icon_plus"></i></button>
                                </div>
                               <input type="hidden" name="pid" value="<% out.print(product.getpId());%>">  
                                <button type="submit" class="add_cart_btn">add to cart</button>
                                
                                <!-- <a class="add_cart_btn" href="addtocart">add to cart</a> -->
                            </div>
                            <input type="hidden" name="price" value=<%out.print(product.getPrice()); %>>
                            <input type="hidden" name="img" value=<%out.print(product.getImg()); %>>
                            <input type="hidden" name="productName" value=<%out.print(product.getDescrip()); %>>
                            <%System.out.println("***********************************"); 
                            
                            //  System.out.println(request.getAttribute("productName"));
                            
                            %>
                            </form> 
                           
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--================End Product Details Area =================-->
        
        <!--================Product Description Area =================-->
        <section class="product_description_area">
            <div class="container">
                <nav class="tab_menu">
                    <div class="nav nav-tabs" id="nav-tab" role="tablist">
                        <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab" aria-controls="nav-home" aria-selected="true">Product Description</a>
                        <a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile" role="tab" aria-controls="nav-profile" aria-selected="false">Reviews (1)</a>
                        <a class="nav-item nav-link" id="nav-contact-tab" data-toggle="tab" href="#nav-contact" role="tab" aria-controls="nav-contact" aria-selected="false">Tags</a>
                        <a class="nav-item nav-link" id="nav-info-tab" data-toggle="tab" href="#nav-info" role="tab" aria-controls="nav-info" aria-selected="false">additional information</a>
                        <a class="nav-item nav-link" id="nav-gur-tab" data-toggle="tab" href="#nav-gur" role="tab" aria-controls="nav-gur" aria-selected="false">gurantees</a>
                    </div>
                </nav>
                <div class="tab-content" id="nav-tabContent">
                    <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
                        <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.  Emo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur.</p>
                    </div>
                    <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">
                        <h4>Rocky Ahmed</h4>
                        <ul>
                            <li><a href="#"><i class="fa fa-star"></i></a></li>
                            <li><a href="#"><i class="fa fa-star"></i></a></li>
                            <li><a href="#"><i class="fa fa-star"></i></a></li>
                            <li><a href="#"><i class="fa fa-star"></i></a></li>
                            <li><a href="#"><i class="fa fa-star"></i></a></li>
                        </ul>
                    </div>
                    <div class="tab-pane fade" id="nav-contact" role="tabpanel" aria-labelledby="nav-contact-tab">
                        <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.  Emo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur.</p>
                    </div>
                    <div class="tab-pane fade" id="nav-info" role="tabpanel" aria-labelledby="nav-info-tab">
                        <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.  Emo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur.</p>
                    </div>
                    <div class="tab-pane fade" id="nav-gur" role="tabpanel" aria-labelledby="nav-gur-tab">
                        <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.  Emo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur.</p>
                    </div>
                </div>
            </div>
        </section>
        <!--================End Product Details Area =================-->
        
       
        
<jsp:include page="footer.jsp"></jsp:include>
       