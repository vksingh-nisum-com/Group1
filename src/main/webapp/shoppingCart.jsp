<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import= "java.util.*,com.nisum.dao.*"  %>
    
<jsp:include page="simpleHeader.jsp"></jsp:include>

        <!--================Categories Banner Area =================-->
        <section class="solid_banner_area">
            <div class="container">
                <div class="solid_banner_inner">
                    <h3>shopping cart </h3>
                    <ul>
                        <li><a href="#">Home</a></li>
                        <li><a href="#">Shopping cart</a></li>
                    </ul>
                </div>
            </div>
        </section>
        <!--================End Categories Banner Area =================-->
        
        <!--================Shopping Cart Area =================-->
        <section class="shopping_cart_area p_100">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8">
                        <div class="cart_items">
                            <h3>Your Cart Items</h3>
                            <div class="table-responsive-md">
                                <table class="table">
                                    <tbody> <!-- xxx -->
                                     
                                     <%
                                     int sum=0;
                                     List<CartItem> cartItems=(List<CartItem>)request.getAttribute("cartItems"); 
                                     for(CartItem cartItem:cartItems)
                                     {
                                    	 String productImage=cartItem.getItemImage();
                                    	 String productName=cartItem.getItemName();
                                    	 String productQuantity=cartItem.getItemQuantity();
                                    	 String productPrice=cartItem.getItemPrice();
                                    	int q= Integer.parseInt(productQuantity);
                                    	int p= Integer.parseInt(productPrice);
                                    	int r=p*q;
                                    	 String productsNetPrice= String.valueOf(r);
                                    	 System.out.println("*********************************************************************testing*************************************************************************");
                                    	 System.out.println("netprice="+productsNetPrice +"netprice r="+r);
                                    	 
                                    	
               						 %>
               						 
               						 <%System.out.println(productImage+" "+productName+" "+productQuantity+" "+productPrice+productsNetPrice); %>
                                         <tr>
                                            <th scope="row">
                                                <img src="resources/img/icon/close-icon.png" alt="">
                                            </th>
                                            <td>
                                                <div class="media">
                                                    <div class="d-flex">
                                                        <img src="resources/img/product/product-details/<%out.print(productImage); %>" height="123px" width="102px">
                                                    </div>
                                                    <div class="media-body">
                                                        <h4><%out.print(productName); %></h4>
                                                    </div>
                                                </div>
                                            </td>
                                            <td><p><%out.print(productPrice); %></p></td>
                                           
                                            <td><p><%out.print(productQuantity); %></p></td>
                                            <td><p><%out.print(productsNetPrice); %></p></td>
                                        </tr>
                                       <% 
                                       int pnp=Integer.parseInt(productsNetPrice);
                                       sum=sum+pnp;}%>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="cart_totals_area">
                            <h4>Cart Totals</h4>
                            <div class="cart_t_list">
                                <div class="media">
                                    <div class="d-flex">
                                        <h5>Subtotal</h5>
                                    </div>
                                    <div class="media-body">
                                        <h6><%out.print("Rs."+sum); %></h6>
                                    </div>
                                </div>
                                <div class="media"> 
                                    <div class="d-flex">
                                        <h5>Shipping</h5>
                                    </div>
                                    <div class="media-body">
                                        <p>Free Shipping with a minimum order of Rs. 1000 <br></p>
                                       
                                </div>
                                <div class="media">
                                    <div class="d-flex">
                                        
                                    </div>
                                   
                                </div>
                            </div>
                            <div class="total_amount row m0 row_disable">
                                <div class="float-left">
                                    Total
                                </div>
                                <div class="float-right">
                                    <% out.print("Rs."+sum);%>
                                </div>
                            </div>
                        </div>
                   <a class="add_cart_btn" href="proceedToCheckout">proceed to checkout</a>
                    </div>
                </div>
            </div>
        </section>
        <!--================End Shopping Cart Area =================-->  
   <jsp:include page="footer.jsp"></jsp:include>
       