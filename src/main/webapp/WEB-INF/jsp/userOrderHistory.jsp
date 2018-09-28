<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.nisum.entity.*"%>
        <jsp:include page="simpleHeader.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
                                           <form action="userViewOrderDetailCtrl">
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

<jsp:include page="footer.jsp"></jsp:include>