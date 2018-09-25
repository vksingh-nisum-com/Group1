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
        <title>nisum Mall</title>

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
        <style>
   .btn{
   background-color:white;
   
   }
   </style>
    </head>
</head>
<body>
	 <div class="container">
                <div class="row">
                    <div class="col-lg-8">
                        <div class="cart_items">
                            <h3 align="center">All Orders</h3>
                            <div class="table-responsive-md">
                                <table class="table">
                                    <tbody> <!-- xxx -->
                                     <tr>
                                           
                                            
                                            <td><h4>OrderId</h4></td>
                                            <td><h4>user Name</h4></td>
                                            <td><h4>Amount</h4></td>
                                            <td><h4>Date</h4></td>
                                            <td><h4>Order Detail</h4></td>
                                            
                                        </tr>
                                     <%
                                     int sum=0;
                                     List<Order1> orders=(List<Order1>)request.getAttribute("orders"); 
                                     for(Order1 order:orders)
                                     {
                                    	String orderId=String.valueOf(order.getOrderId());
                                    	String userName=order.getUserName();
                                    	String amount=order.getAmount();
                                    	String date=order.getDate();
                                    	String orderDetail=order.getOrderDetail();
               						 %>
               						 
               						 
                                         <tr>
                                           <form action="adminViewOrderDetailCtrl">
                                            <input type="hidden" name="orderId" value="<%out.print(orderId); %>">
                                            <input type="hidden" name="userName" value="<%out.print(userName); %>">
                                            <input type="hidden" name="orderDetail" value="<%out.print(orderDetail); %>">
                                            
                                          
                                            
                                            <td><p><%out.print(orderId); %></p></td>
                                           	<td><p><%out.print(userName); %></p></td>
                                            <td><p>Rs.<%out.print(amount); %></p></td>
                                            <td><p><%out.print(date); %></p></td>
                                            <td><p><%out.print(orderDetail); %></p></td>
                                            <td><input type="submit" value="View Details"></td>
                                            <input type="hidden" name="view" value="admin">
                                            </form>
                                        </tr>
                                       <% }%> 
                                     
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    
</body>
</html>

