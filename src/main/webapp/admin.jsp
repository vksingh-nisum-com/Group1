<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.nisum.dao.*"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

.containerFlex
  {
      display:flex;
      justify-content: space-around;
  }
  body 
  { 
  background-image : url("resources/img/icon/Ap.jpg");
  background-size: cover;
    background-repeat: no-repeat;
  }
  h3
  {
  color : white;
  }
  
  .button{
  border : 0px;
  color : white;
  background-color:#4c0e06;
  }
  h1
  {
  color : white;
  }
</style>

</head>
<body>
<%List<Product> products=(List<Product>)request.getAttribute("products"); request.getAttribute("products"); %>

<h1 align="center">Welcome Admin</h1>
	<section class="containerFlex">
		<div>
			<h3>Add Product</h3>
		 <form class="login_form row" onsubmit="return validate(this)"  method="post" action="adminAddProduct" enctype="multipart/form-data" >
							<div class="col-lg-12 form-group">
								<input class="form-control" type="text" placeholder="ProductID" 
									name="P_ID" id=""P_ID">
									<div id="div1"></div>
							</div>
							<br>
							<div class="col-lg-12 form-group">
								<input class="form-control" type="text"
									placeholder="ProductQuantity" name="P_Quantity" id="P_Quantity">
									<div id="div2"></div>
							</div>
							<br>
							<div class="col-lg-12 form-group">
								<input class="form-control" type="text" placeholder="Name"
									name="Name" id="Name">
									<div id="div3"></div>
							</div>
							<br>
							<div class="col-lg-12 form-group">
								<input class="form-control" type="text" placeholder="Price"
									name="Price" id="Price">
									<div id="div4"></div>
							</div>
							<br>
							<div class="col-lg-12 form-group">
								<input class="form-control" type="text"
									placeholder="Description" name="Descriptiony" id="Descriptiony">
									<div id="div5"></div>
							</div>
							<br>
							<div class="col-lg-12 form-group">
								<input class="form-control" type="text" placeholder="Category"
									name="Category" id="Category">
									<div id="div11"></div>
							</div>
							<br>
							<div class="col-lg-12 form-group">
								<input class="form-control" type="text"
									placeholder="Sub-Category" name="Sub-Category" id="Sub-Category">
									<div id="div12"></div>
							</div>
							<br>
							<div class="col-lg-12 form-group">
								<div class="creat_account">
									<!--   <input type="checkbox" id="f-option" name="selector">
                                        <label for="f-option">Keep me logged in</label> -->
									<div class="check"></div>
								</div>
							</div>
							<br>
							<div class="col-lg-12 form-group">
								<input class="form-control" type="file" placeholder="Image1"
									name="fileImage1" id="Image1">
									<div id="div6"></div>
							</div>
							<br>
							<div class="col-lg-12 form-group">
								<input class="form-control" type="file" placeholder="Image2"
									name="fileImage2" id="Image2">
									<div id="div7"></div>
							</div>
							<br>
							<div class="col-lg-12 form-group">
								<input class="form-control" type="file" placeholder="Image3"
									name="fileImage3" id="Image3">
									<div id="div8"></div>
							</div>
							<br>
							<div class="col-lg-12 form-group">
								<input class="form-control" type="file" placeholder="Image4"
									name="fileImage4" id="Image4">
									<div id="div9"></div>
							</div>
							<br>
							<div class="col-lg-12 form-group">
								<input class="form-control" type="file" placeholder="Image5"
									name="fileImage5" id="Image5">
									<div id="div10"></div>
							</div>
							<br>
							<div class="col-lg-6 form-group">
						<button type="submit" value="submit"
									class="button">Add Product</button>
							</div>
							</form>
		</div>
		
		<div>
		<h3>Delete Product</h3>
		    <div>
		    	<form class="form2" action="adminDeleteProduct">
					   
					   <select>
                               <% for(Product product:products ){ 	String pid=product.getpId();  %>	
       												<option><%out.print(pid); %></option>
                              		<% }%>
									
						</select>	
						<br>
						<br>
									<div class="col-lg-2 form-group">
								<button type="submit" value="submit"
									class="button">Delete Product</button>
							       </div>
                           
                  </form>
		    </div>
		    <hr>						
		    <br>
		    <br>
		    
		     				<div> 
		     				<h3>Add Quality</h3>
                               <form class="form3" action="adminAddQuantity">
                            
                               <select>
                               <% for(Product product:products ){ 	String pid=product.getpId();  %>	
       												<option><%out.print(pid); %></option>
                              		<% }%>
									
						</select>
						<br>
						<br>
									<div class="col-lg-14 form-group">
								<input class="form-control" type="text"
									placeholder="ProductQuantity" name="P_Quantity" id="P_Quantity">
									<div id="div2"></div>
							</div>
							<br>
									<div class="col-lg-7 form-group">

								<button type="submit" value="submit"
									class="button">Add Quantity</button>
							</div>
                            </form>
                            </div>
                            
                           
			<hr>						
		    <br>
		    <br>
		    
                            <div>
                            <h3>Delete Quantity</h3>
                            <form class="form4" action="adminDeleteQuantity">
                            
                               <select>
                               <% for(Product product:products ){ 	String pid=product.getpId();  %>	
       												<option><%out.print(pid); %></option>
                              		<% }%>
									
						</select>
						<br>
						<br>
									
									
									<div class="col-lg-14 form-group">
								<input class="form-control" type="text"
									placeholder="ProductQuantity" name="P_Quantity" id="P_Quantity">
									
									</div>
									<br>
									<div class="col-lg-7 form-group">

								<button type="submit" value="submit"
									class="button">Delete Quantity</button>
							</div>
									
                            </form>
                            </div>
                          
                          
                          <div>
                          	<form action="viewAllOrders">
	
							<input type="submit" value="View all orders">
							</form>
                          </div>
									
		
		</div>
	
	</section>
</body>
</html>