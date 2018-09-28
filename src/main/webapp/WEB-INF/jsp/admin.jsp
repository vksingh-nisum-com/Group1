<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import="java.util.*,com.nisum.entity.*"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<title>Admin Home</title>
	<link rel="stylesheet" type="text/css" href="resources//css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="resources//css/testbootstyle.css">
</head>
<body>




            <h3 class="faded">
             Hi, there Admin. Welcome to nisum Mall administration page.
            </h3>
		<div class="containerfluid">

					<div class="card" style="width: 18rem;" style="display: inline">
			  <img class="card-img-top" src="resources//img/admin21.jpg" class="figure-img img-fluid rounded" alt="win img" height="250px" width="300px" alt="Card image cap">
			  <div class="card-body">
			    <h5 class="card-title">Add Products</h5>
			    <p class="card-text">Make your store bigger.</p>
			    <h5 style="color:red"> ${ adminMessage } </h5>
			    
			    
			    <form action="form1Ctrl">
			    <button type="submit" class="btn btn-primary">Add</button>
			    </form>
			   <!-- <a href="adminForm1" class="btn btn-primary">Add</a>  -->
			  </div>
			</div>


			  <div class="card" style="width: 18rem;" style="display: inline">
			  <img class="card-img-top" src="resources//img/admin2.jpg" class="figure-img img-fluid rounded" alt="win img" height="250px" width="200px" alt="Card image cap">
			  <div class="card-body">
			    <h5 class="card-title">Delete Product</h5>
			    <p class="card-text">Remove product from inventory.</p>
			    <h5 style="color:red"> ${ adminMessage1 } </h5>
			    
			   <form action="form2Ctrl">
			    <button type="submit" class="btn btn-primary">Delete</button>
			    </form>
			  </div>
			</div>
			  <div class="card" style="width: 18rem;" style="display: inline">
			  <img class="card-img-top" src="resources//img/admin3.jpg" class="figure-img img-fluid rounded" alt="win img" height="250px" width="300px" alt="Card image cap">
			  <div class="card-body">
			    <h5 class="card-title">Update Products</h5>
			    <p class="card-text">Update product's quantity</p>
			    
			    <h5 style="color:red"> ${ adminMessage2 } </h5>

			    
			    
			   <form action="form3Ctrl">
			    <button type="submit" class="btn btn-primary">Update</button>
			    </form>
			  </div>
			</div>
			 
		

		<div class="card" style="width: 18rem;">
  <img class="card-img-top" src="resources//img/admin4.jpg" class="figure-img img-fluid rounded" alt="win img" height="250px" width="300px" alt="Card image cap">
  <div class="card-body">
    <h5 class="card-title">View All Orders</h5>
    <p class="card-text">View all orders and deliver easily. </p>
   <form action="viewAllOrders">
			    <button type="submit" class="btn btn-primary">View</button>
	</form>
  </div>
</div>
</div>




	<blockquote class="blockquote text-center">
  <p class="mb-0">"There is only one boss; the customer. And he can fire everybody in the company from the chairman on down, simply by spending his money somewhere else."</p>
  <footer class="blockquote-footer">Sam Walton, Founder of Walmart </footer>
</blockquote>


</body>
</html>