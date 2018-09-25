<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.nisum.entity.*"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
	<title>Form1</title>
	<link rel="stylesheet" type="text/css" href="resources//css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="resources//css/testbootstyle.css">
</head>
<body>
<h3 class="faded">
             Add New products
            </h3>
<div class="myFlex">

	<form onsubmit="return validate(this)"  method="post" action="adminAddProduct" enctype="multipart/form-data" >
  <div class="col-lg-12 form-group">
    <label for="P_ID">Product's Id</label>
								<input class="form-control" type="text" placeholder="Enter PId" 
									name="P_ID" id="P_ID">
    <small id="emailHelp" class="form-text text-muted">Please follow proper Pid conventions</small>
  </div>
 

  <div class="col-lg-12 form-group">
    <label for="P_Quantity">Product's Quantity</label>
    <input class="form-control" type="text"
									placeholder="Enter Quantity" name="P_Quantity" id="P_Quantity">
  </div>
  <div class="col-lg-12 form-group">
  	<label for="Name">Product's Name</label>
   <input class="form-control" type="text" placeholder="Enter Name"
									name="Name" id="Name">
  </div>
 
 <div class="col-lg-12 form-group">
 	<label for="Price">Product's Price</label>
	<input class="form-control" type="text" placeholder="Enter Price" name="Price" id="Price">
</div>

<div class="col-lg-12 form-group">
	<label for="Descriptiony">Product's Decription</label>
								<input class="form-control" type="text"
									placeholder="Description" name="Descriptiony" id="Descriptiony">
</div>
<div class="col-lg-12 form-group">
 <label for="Category">Category</label>
								<input class="form-control" type="text" placeholder="Enter Category"
									name="Category" id="Category">
									
							</div>


<div class="col-lg-12 form-group">
	<label for="Category">Sub-Category</label>
								<input class="form-control" type="text"
									placeholder="Sub-Category" name="Sub-Category" id="Sub-Category">
									
							</div>



							
							<div class="col-lg-12 form-group">
								<label for="Image1">Upload Image1</label>
								<input class="form-control" type="file" placeholder="Image1"
									name="fileImage1" id="Image1">
									<div id="div6"></div>
							</div>
							
							<div class="col-lg-12 form-group">
								<label for="Image2">Upload Image2</label>
								<input class="form-control" type="file" placeholder="Image2"
									name="fileImage2" id="Image2">
									<div id="div7"></div>
							</div>
							
							<div class="col-lg-12 form-group">
								<label for="Image3">Upload Image3</label>
								<input class="form-control" type="file" placeholder="Image3"
									name="fileImage3" id="Image3">
									
							</div>
							
							<div class="col-lg-12 form-group">
								<label for="Image4">Upload Image4</label>
								<input class="form-control" type="file" placeholder="Image4"
									name="fileImage4" id="Image4">
									<div id="div9"></div>
							</div>
							<br>
							<div class="col-lg-12 form-group">
								<label for="Image5">Upload Image5</label>
								<input class="form-control" type="file" placeholder="Image5"
									name="fileImage5" id="Image5">
									
							</div>


  <button type="submit" class="btn btn-primary">Submit</button>

</div>
</form>
</body>
</html>>