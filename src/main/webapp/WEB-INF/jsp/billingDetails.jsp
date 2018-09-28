<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import= "java.util.*,com.nisum.entity.*"%>
        <jsp:include page="simpleHeader.jsp"></jsp:include>
        <!--================Categories Banner Area =================-->
        <section class="solid_banner_area">
            <div class="container">
                <div class="solid_banner_inner">
                    <h3>checkout register</h3>
                    <ul>
                        <li><a href="#">Home</a></li>
                        <li><a href="#">Checkout Register</a></li>
                    </ul>
                </div>
            </div>
        </section>
        <!--================End Categories Banner Area =================-->
        
        <!--================Register Area =================-->
        <section class="register_area p_100">
            <div class="container">
                <div class="register_inner">
                
                
                    <div class="row">
                        <div class="col-lg-7">
                            <div class="billing_details">
                                <h2 class="reg_title">Shipping Details</h2>
                                 <form action="placeOrder" onsubmit="return validate(this)" method="get">    
                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <label for="last">Name <span>*</span></label>
                                            <input type="text" placeholder="name" onkeyup="return checkpattern(this)" class="form-control"name="last" id="last" aria-describedby="last">
                                        </div>
                                        <div id="div2"></div>
                                    </div>
                                 
                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <label for="address">Address <span>*</span></label>
                                            <input type="text" class="form-control"name="address" id="address" aria-describedby="address">
                                        </div>
                                        
                                    </div>
                                     <div class="col-lg-12">
                                        <div class="form-group">
                                            <label for="email">City <span>*</span></label>
                                            <input type="text"   name="town" class="form-control" id="email" aria-describedby="town">
                                        </div>
                                        
                                    </div>
                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <label for="email">Country <span>*</span></label>
                                            <input type="text"   name="country" class="form-control" id="email" aria-describedby="country">
                                        </div>                                     
                                    </div>
                                    
                                    
                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <label for="email">Email <span>*</span></label>
                                            <input type="text"  onkeyup="return checkpattern(this)" name="email" class="form-control" id="email" aria-describedby="email">
                                            <div id="div3"></div>
                                        </div>
                                        <div id="div3"></div>
                                    </div>
                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <label for="phone">Phone <span>*</span></label>
                                            <input type="text"  onkeyup="return checkpattern(this)"name="phone" class="form-control" id="phone" aria-describedby="phone">
                                            <div id="div4"></div>
                                        </div>
                                        
                                    </div>  
                                   <button type="submit" class="add_cart_btn" value="submit" style="width: 462px;margin-left: 707px;">place order</button>                                                                           
                                                    
                                </form>
                            </div>
                        </div>
                        <div class="col-lg-5">
                            <div class="order_box_price">
                                <h2 class="reg_title">Your Order</h2>
                                <div class="payment_list">
                                    <div class="price_single_cost">
                                           
                                     <%
                                     int sum=0;
                                     List<CartItem> cartItems=(List<CartItem>)request.getAttribute("cartItems"); 
                                     for(CartItem cartItem:cartItems)
                                     {
                                    	
                                    	 String productName=cartItem.getItemName();
                                    	 String productQuantity=cartItem.getItemQuantity();
                                    	 String productPrice=cartItem.getItemPrice();
                                    	int q= Integer.parseInt(productQuantity);
                                    	int p= Integer.parseInt(productPrice);
                                    	int r=p*q;
                                    	 String productsNetPrice= String.valueOf(r);
                                    	 
                                    	
                                    	 
                                    	
               						 %>
               						 
                                        <h5><%out.print(productName); %><span><% out.print(productsNetPrice);%></span></h5>
                                       

                                      <%  sum=sum+r;} %>  
                                        <h4>Cart Subtotal <span>Rs <%out.print(sum); %></span></h4>
                                        <h3><span class="normal_text">Order Totals</span> <span>Rs<%out.print(sum); %></</span></h3>
                                    </div>
                                    <div id="accordion" role="tablist" class="price_method">
                                        <div class="card">
                                            <div class="card-header" role="tab" id="headingOne">
                                                <h5 class="mb-0">
                                                    <a data-toggle="collapse" href="#collapseOne" role="button" aria-expanded="true" aria-controls="collapseOne">
                                                    direct bank transfer
                                                    </a>
                                                </h5>
                                            </div>

                                            <div id="collapseOne" class="collapse show" role="tabpanel" aria-labelledby="headingOne" data-parent="#accordion">
                                                <div class="card-body">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="card">
                                            <div class="card-header" role="tab" id="headingTwo">
                                                <h5 class="mb-0">
                                                    <a class="collapsed" data-toggle="collapse" href="#collapseTwo" role="button" aria-expanded="false" aria-controls="collapseTwo">
                                                    cheque payment
                                                    </a>
                                                </h5>
                                            </div>
                                            <div id="collapseTwo" class="collapse" role="tabpanel" aria-labelledby="headingTwo" data-parent="#accordion">
                                                <div class="card-body">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="card">
                                            <div class="card-header" role="tab" id="headingThree">
                                                <h5 class="mb-0">
                                                    <a class="collapsed" data-toggle="collapse" href="#collapseThree" role="button" aria-expanded="false" aria-controls="collapseThree">
                                                    cash on delivery
                                                    </a>
                                                </h5>
                                            </div>
                                            <div id="collapseThree" class="collapse" role="tabpanel" aria-labelledby="headingThree" data-parent="#accordion">
                                                <div class="card-body">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="card">
                                            <div class="card-header" role="tab" id="headingfour">
                                                <h5 class="mb-0">
                                                    <a class="collapsed" data-toggle="collapse" href="#collapsefour" role="button" aria-expanded="false" aria-controls="collapsefour">
                                                    paypal
                                                    </a>
                                                </h5>
                                            </div>
                                            <div id="collapsefour" class="collapse" role="tabpanel" aria-labelledby="headingfour" data-parent="#accordion">
                                                <div class="card-body">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                   
                </div>
            </div>
        </section>
       <!--================End Register Area =================-->
 <jsp:include page="footer.jsp"></jsp:include>
        
      
