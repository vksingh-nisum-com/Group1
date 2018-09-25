<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.nisum.entity.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Form2</title>
	<link rel="stylesheet" type="text/css" href="resources//css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="resources//css/testbootstyle.css">
</head>
<body>


		<h3 class="faded">Delete Product</h3>
		    <div class="myFlex">
		    	<form class="myFlex" action="adminDeleteProduct">
					   
		    			<div class="input-group mb-3">
  <div class="input-group-prepend">
    <label class="input-group-text" for="inputGroupSelect01">Options</label>
  </div>
  
  <div>
  <%List<Product> products=(List<Product>)request.getAttribute("products"); %>
  <select class="custom-select" id="inputGroupSelect01" name="pid">
    <% for(Product product:products ){ 	String pid=product.getpId();  %>
    <option><%out.print(pid); %></option>
    <% }%>
    
  </select>
  </div>
</div>
									<div>
								<button type="submit" value="submit"
									class="btn btn-primary">Delete Product</button>
							       </div>
                           
                  </form>
		    </div>






</body>
</html>