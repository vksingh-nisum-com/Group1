<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.nisum.dao.*"%>
    <jsp:include page="simpleHeader.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Details</title>
</head>
<body>
		<div>
			<div>
				<p>OrderId:<%out.print(request.getParameter("orderId")) ;%></p>
				<p>UserName:<%out.print(request.getParameter("userName")); %></p>
			</div>
		</div>
		<hr>
		<div>
		<h3>Shipping Address</h3><br>
			<%ShippingDetails ship=(ShippingDetails)request.getAttribute("shippingDetails"); %>
			<div><strong>Name:</strong><%=ship.getLastName() %></div>
			<div><strong>Address:</strong><%=ship.getAddress() %></div>
			<div><strong>City:</strong><%=ship.getCity() %></div>
			<div><strong>Country:</strong><%=ship.getCountry() %></div>
			<div><strong>Phone:</strong><%=ship.getPhone() %></div>
		</div>
		<hr>
		
		
		<h3>Products Ordered</h3><br>
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
                					 %>
               						 
               						
                                         <tr>
                                           
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
                                <table>
                                    <tbody> <!-- xxx -->
                                     
                                    
            </tbody>
      </table>
                         
</body>
</html>
<jsp:include page="footer.jsp"></jsp:include>