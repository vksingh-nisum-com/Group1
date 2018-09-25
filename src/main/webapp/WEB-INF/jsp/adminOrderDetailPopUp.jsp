<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.nisum.entity.*"%>

<!DOCTYPE html>
<html>
<head>
<head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
        <link rel="icon" href="resources/img/fav-icon.png" type="image/x-icon" />
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>Persuit</title>

        <!-- Icon css link -->
        <link href="resources/css/font-awesome.min.css" rel="stylesheet">
        <link href="resources/vendors/line-icon/css/simple-line-icons.css" rel="stylesheet">
        <link href="resources/vendors/elegant-icon/style.css" rel="stylesheet">
        <!-- Bootstrap -->
        <link href="resources/css/bootstrap.min.css" rel="stylesheet">
        
        <!-- Rev slider css -->
        <link href="resources/vendors/revolution/css/settings.css" rel="stylesheet">
        <link href="resources/vendors/revolution/css/layers.css" rel="stylesheet">
        <link href="resources/vendors/revolution/css/navigation.css" rel="stylesheet">
        
        <!-- Extra plugin css -->
        <link href="resources/vendors/owl-carousel/owl.carousel.min.css" rel="stylesheet">
        <link href="resources/vendors/bootstrap-selector/css/bootstrap-select.min.css" rel="stylesheet">
        
        <link href="resources/css/style.css" rel="stylesheet">
        <link href="resources/css/responsive.css" rel="stylesheet">

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="resources/https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="resources/https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>

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
