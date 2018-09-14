<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<style type="text/css">

.form-heading { color:#fff; font-size:23px;}
.panel h2{ color:#444444; font-size:18px; margin:0 0 8px 0;}
.panel p { color:#777777; font-size:14px; margin-bottom:30px; line-height:24px;}
.login-form .form-control {
  background: #f7f7f7 none repeat scroll 0 0;
  border: 1px solid #d4d4d4;
  border-radius: 4px;
  font-size: 14px;
  height: 50px;
  line-height: 50px;
}
.main-div {
  background: #ffffff none repeat scroll 0 0;
  border-radius: 2px;
  margin: 10px auto 30px;
  max-width: 38%;
  padding: 50px 70px 70px 71px;
}
#login_failed{
	color :red;
}
.login-form .form-group {
  margin-bottom:10px;
}
.login-form{ 
	text-align:center;
	margin-top: 100px;
}
.forgot a {
  color: #777777;
  font-size: 14px;
  text-decoration: underline;
}
.login-form  .btn.btn-primary {
  background: #f0ad4e none repeat scroll 0 0;
  border-color: #f0ad4e;
  color: #ffffff;
  font-size: 14px;
  width: 100%;
  height: 50px;
  line-height: 50px;
  padding: 0;
}
.forgot {
  text-align: left; margin-bottom:30px;
}
.botto-text {
  color: #ffffff;
  font-size: 14px;
  margin: auto;
}
.login-form .btn.btn-primary.reset {
  background: #ff9900 none repeat scroll 0 0;
}
.back { text-align: left; margin-top:10px;}
.back a {color: #444444; font-size: 13px;text-decoration: none;}

</style>
<script>

function checkpattern(ram){
    var patcheck = new RegExp("^[a-zA-Z]{3,10}$");
        var patcheckmob = new RegExp("^[7-9][0-9]{9}$");
        var pattern1= new RegExp("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$");


   if(ram.id=="fname" && ram.value!=0){
    if(!patcheck.test(ram.value))
    {
        document.getElementById("div1").innerHTML="* firstname is not correct";
        document.getElementById("div1").style.color="Red";
        return false;
    }
     else
    {
        document.getElementById("div1").innerHTML="";
        return true;
    }
}
else if(ram.id=="lname" && ram.value!=0){
    if(!patcheck.test(ram.value))
    {
        document.getElementById("div2").innerHTML="* Lastname last name is not correct";
        document.getElementById("div2").style.color="Red";
        
    }
     else
    {
        document.getElementById("div2").innerHTML="";
    }
}
  else if(ram.id=="mname" && ram.value!=0){
    if(!patcheck.test(ram.value))
    {
        document.getElementById("div3").innerHTML="*Enter a correct Middlename";
        document.getElementById("div3").style.color="Red";
        
    }
     else
    {
        document.getElementById("div3").innerHTML="";
    }
}

else if(ram.id=="mobno"){
if(!patcheckmob.test(ram.value)&&ram.value!=0)
    {
        document.getElementById("div4").innerHTML="Enter a correct mobileno";
        document.getElementById("div4").style.color="Red";
        
    }
     else
    {
        document.getElementById("div4").innerHTML="";
    }

}
else if(ram.id=="emailid" && ram.value!=0){
if(!pattern1.test(ram.value))
    {
        document.getElementById("div5").innerHTML="Enter a correct emailid";
        document.getElementById("div5").style.color="Red";
        
    }
     else
    {
        document.getElementById("div5").innerHTML="";
    }

}
}
function validate(form){
if(form.f_name.value==""){
document.getElementById("div1").innerHTML="*Firstname cant be empty";
        document.getElementById("div1").style.color="Red";
return false;
}
else if(form.l_name.value==""){
document.getElementById("div2").innerHTML="*Lastname cant be empty";
        document.getElementById("div2").style.color="Red";
return false;
}
else if(form.m_name.value==""){
document.getElementById("div3").innerHTML="*Middlename cant be empty";
        document.getElementById("div3").style.color="Red";
return false;
}
else if(form.m_no.value==""){
document.getElementById("div4").innerHTML="*Mobile nocant be empty";
        document.getElementById("div4").style.color="Red";
return false;
}
else if(form.email.value==""){
document.getElementById("div5").innerHTML="*Email cant be empty";
        document.getElementById("div5").style.color="Red";
return false;
}
else if(form.add.value==""){
document.getElementById("div6").innerHTML="*address cant be empty";
        document.getElementById("div6").style.color="Red";
return false;
}
else{
return true;
}
}

</script>
</head>
  
<body id="LoginForm">
<div class="container">

<div class="login-form">
<div class="main-div">
    <div class="panel">
   <h2>Registration Page</h2>
   <p>Please enter your Details</p>
   </div>
    <form id="Login" action="regi" method="post" name="form" onsubmit="return validate(this)">

        <div class="form-group">
       
<input type="text" name="f_name" id="fname"   onkeyup="return checkpattern(this)" placeholder="Enter FirstName" class="form-control">
        </div>
		<div id="div1"></div>
        <div class="form-group">
        
<input type="text" name="l_name" id="lname" onkeyup="checkpattern(this)" placeholder="Enter LastName" class="form-control">
        </div>
        	<div id="div2"></div>
        	
        	
        		<div class="form-group">
<input type="tel"  name="m_no" id="mobno" onkeyup="checkpattern(this)" placeholder="Enter Mobileno" class="form-control">
        </div>
        	<div id="div4"></div>
        		<div class="form-group">
<input type="email" name="email" id="emailid"  onkeyup="checkpattern(this)" placeholder="Enter Emailid" class="form-control">
        </div>
        	<div id="div5"></div>
        	
        <div class="form-group">
<input type="textarea" name="add" placeholder="Enter Address" class="form-control">
        </div>
        	<div id="div6"></div>
        	<div class="form-group">
<select name="country" class="form-control">
				<option value="india">India</option>
				<option value="pakistan">Pakistan</option>
				<option value="malasiya">Malasiya</option>

			</select>
        </div>
        	<div class="form-group">
<input type="radio" value="Male" name="gender" checked >Male
			<input type="radio" value="female" name="gender">Female
        </div>
  
        <input type="submit" class="btn btn-primary" value="Register Here">
      
 
    </form>
    </div>
</div></div>


</body>
</html>
    