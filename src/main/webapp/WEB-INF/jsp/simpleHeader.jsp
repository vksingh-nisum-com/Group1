<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" import="java.util.*,com.nisum.entity.*" %>
<!DOCTYPE html>
<html lang="en">
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
   
    </head>
    <body>
        
        <!--================Menu Area =================-->
        <header class="shop_header_area carousel_menu_area">
            
            <div class="carousel_menu_inner">
                <div class="container">
                    <nav class="navbar navbar-expand-lg navbar-light bg-light">
                        <a class="navbar-brand" href="index.jsp"><img src="resources/img/logonew.PNG" alt="" style="width: 180px;height: 142px;"></a>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>

                        </button>
                       <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav mr-auto">
                                <li class="nav-item dropdown submenu">
                                    <a class="nav-link dropdown-toggle" href="index.jsp">
                                    Home 
                                    </a>
                                   
                                </li>
                                <li class="nav-item dropdown submenu">
                                    <a class="nav-link dropdown-toggle" href="#" >
                                    Categories <i class="fa fa-angle-down" aria-hidden="true"></i>
                                    </a>
                                    <ul class="dropdown-menu" style="background-color:white">
                                        
                                         <li ><form  action="fashion"  ><button class="btn" type="submit" style="width:250px;background-color:white;">Fashion</button></form></li>
                                       <li ><form  action="electronics"><button class="btn" type="submit" style="width:250px;background-color:white;">Electronics</button></form></li>
                                       <li ><form  action="sports"><button class="btn" type="submit" style="width:250px;background-color:white;">Sports</button></form></li>
                                   
                                    </ul>
                                </li>
                         
                               
                                <li class="nav-item dropdown submenu active">
                                    <a class="nav-link dropdown-toggle" href="#" >
                                    About Us
                                    </a>                               
                                </li>                              
                                <li class="nav-item"><a class="nav-link" href="contact">Contact Us</a></li>
                            </ul>
                            <ul class="navbar-nav justify-content-end">
                                <p> <% if(session.getAttribute("username")!=null){out.print("Hi "+session.getAttribute("username"));} %> </p>
                                <li ><% if(session.getAttribute("username")!=null){%><form action="logout"  class="user_icon"><i class="icon-user icons"></i> <button type="submit" style="background-color:white">logout</button></form><%}else{ %><form action="signin" class="user_icon"><i class="icon-user icons"></i> <button type="submit" style="background-color:white">Sign in</button></form><%}%></li>
                                <li  ><a href="#"><i class="icon-handbag icons"><% if(session.getAttribute("cartItemCount")!=null){out.print("("+session.getAttribute("cartItemCount")+")");}else{out.print("");} %></i></a></li>
                            </ul>
                        </div>
                    </nav>
                </div>
            </div>
        </header>