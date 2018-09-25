<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.nisum.entity.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Form3</title>
	<link rel="stylesheet" type="text/css" href="resources//css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="resources//css/testbootstyle.css">
</head>
<body>

		    <div > 
		     				<h3 class="faded">Add Quantity</h3>
                               <form  action="adminAddQuantity" class="myFlex">
                            
                           <div>
  <%List<Product> products=(List<Product>)request.getAttribute("products"); %>
  <select class="custom-select" id="inputGroupSelect01" name="pid">
    <% for(Product product:products ){ 	String pid=product.getpId();  %>
    <option><%out.print(pid); %></option>
    <% }%>
    
  </select>
  </div>
 							
                             
						
									
								<input class="form-control" type="text"
									placeholder="ProductQuantity" name="P_Quantity" id="P_Quantity">
								
							
									
								
								<button type="submit" value="submit" class="btn btn-primary">Add Quantity</button>
								
                            </form>
                </div>
                            
                             <div > 
		     				<h3 class="faded">Decrease Quantity</h3>
                               <form  action="adminDeleteQuantity" class="myFlex">
                            
                            
                           <div>
 
  <select class="custom-select" id="inputGroupSelect01" name="pid">
    <% for(Product product:products ){ 	String pid=product.getpId();  %>
    <option><%out.print(pid); %></option>
    <% }%>
    
  </select>
  </div>
                             
						
									
								<input class="form-control" type="text"
									placeholder="ProductQuantity" name="P_Quantity" id="P_Quantity">
								
							
									
								
								<button type="submit" value="submit" class="btn btn-primary">Decrease Quantity</button>
								
                            </form>
                            </div>
</body>
</html>