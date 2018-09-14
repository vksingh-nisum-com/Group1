<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
        <link rel="icon" href="resources/img/fav-icon.png" type="image/x-icon" />
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>MiniAmazon</title>
        
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
        <link href="resources/vendors/jquery-ui/jquery-ui.css" rel="stylesheet">
        
        <link href="resources/css/style.css" rel="stylesheet">
        <link href="resources/css/responsive.css" rel="stylesheet">

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="resources/https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="resources/https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
       

        <script>

        function checkpattern(ram){
            var patcheck = new RegExp("^[a-zA-Z]{3,10}$");
                var patcheckmob = new RegExp("^[7-9][0-9]{9}$");
                var pattern1= new RegExp("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$");


           if(ram.id=="full" && ram.value!=0){
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
           else if(ram.id=="email" && ram.value!=0){
               if(!pattern1.test(ram.value))
                   {
                       document.getElementById("div2").innerHTML="Enter a correct emailid";
                       document.getElementById("div2").style.color="Red";
                       
                   }
                    else
                   {
                       document.getElementById("div2").innerHTML="";
                   }

               }
        else if(ram.id=="user" && ram.value!=0){
            if(!patcheck.test(ram.value))
            {
                document.getElementById("div3").innerHTML="* Lastname last name is not correct";
                document.getElementById("div3").style.color="Red";
                
            }
             else
            {
                document.getElementById("div3").innerHTML="";
            }
        }

        else if(ram.id=="phone"){
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
        
        }
        function validate(form){
        if(form.full.value==""){
        document.getElementById("div1").innerHTML="*FullName cant be empty";
                document.getElementById("div1").style.color="Red";
        return false;
        }
        else if(form.email.value==""){
            document.getElementById("div2").innerHTML="*Email cant be empty";
                    document.getElementById("div2").style.color="Red";
            return false;
            }
        else if(form.user.value==""){
        document.getElementById("div3").innerHTML="*Username cant be empty";
                document.getElementById("div3").style.color="Red";
        return false;
        }
        else if(form.phone.value==""){
        document.getElementById("div4").innerHTML="*Mobile cant be empty";
                document.getElementById("div4").style.color="Red";
        return false;
        }

        else{
        return true;
        }
        }

        </script>
    </head>
    <body>
        
        <!--================Menu Area =================-->
        <header class="shop_header_area carousel_menu_area">
            <div class="carousel_top_header row m0">
                <div class="container">
                    <div class="carousel_top_h_inner">
                        <div class="float-md-left">
                            <div class="top_header_left">
                                <div class="selector">
                                    <select class="language_drop" name="countries" id="countries" style="width:300px;">
                                      <option value='yt' data-image="resources/img/icon/flag-1.png" data-imagecss="flag yt" data-title="English">English</option>
                                      <option value='yu' data-image="resources/img/icon/flag-1.png" data-imagecss="flag yu" data-title="Bangladesh">Bangla</option>
                                      <option value='yt' data-image="resources/img/icon/flag-1.png" data-imagecss="flag yt" data-title="English">English</option>
                                      <option value='yu' data-image="resources/img/icon/flag-1.png" data-imagecss="flag yu" data-title="Bangladesh">Bangla</option>
                                    </select>
                                </div>
                                <select class="selectpicker usd_select">
                                    <option>USD</option>
                                    <option>$</option>
                                    <option>$</option>
                                </select>
                            </div>
                        </div>
                        <div class="float-md-right">
                            <div class="top_header_middle">
                                <a href="#"><i class="fa fa-phone"></i> Call Us: <span>+91 8755995854</span></a>
                                <a href="#"><i class="fa fa-envelope"></i> Email: <span>vksingh@nisum.com</span></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="carousel_menu_inner">
                <div class="container">
                    <nav class="navbar navbar-expand-lg navbar-light bg-light">
                        <a class="navbar-brand" href="#"><img src="resources/img/logo.png" alt=""></a>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>

                        </button>

                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                       
                        <ul class="navbar-nav">
                            <li class="nav-item dropdown submenu active">
                                <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Home 
                                </a>
                                
                            </li>
                            <li class="nav-item dropdown submenu">
                                <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Signup
                                </a>
                                
                            </li>
                            <li class="nav-item dropdown submenu">
                                <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Login

                                </a>
                                
                            </li>
                            
                            
                            <li class="nav-item"><a class="nav-link" href="contact.jsp">Contact</a></li>
                        </ul>
                    </div>
                    </nav>
                </div>
            </div>
        </header>
        <!--================End Menu Area =================-->
        
        <!--================Categories Banner Area =================-->
        <section class="solid_banner_area">
            <div class="container">
                <div class="solid_banner_inner">
                    <h3>Login</h3>
                    <ul>
                        <li><a href="#">Home</a></li>
                        <li><a href="resources/track.html">Login</a></li>
                    </ul>
                </div>
            </div>
        </section>
        <!--================End Categories Banner Area =================-->
        
        <!--================login Area =================-->
        <section class="login_area p_100">
            <div class="container">
                <div class="login_inner">
                    <div class="row">
                        <div class="col-lg-4">
                            <div class="login_title">
                                <h2>log in your account</h2>
                                <h6 style="color:red"> ${ loginMessage } </h6>
                            </div>
                            <form class="login_form row" onsubmit="return validate(this)" action="loginProcess" method="get">
                                <div class="col-lg-12 form-group">
                                    <input class="form-control" type="email" placeholder="UserName" id="user1" name="loginUsername">
                                </div>
                                <div class="col-lg-12 form-group">
                                    <input class="form-control" type="password" placeholder="Password" id="Password" name="loginPassword">
                                </div>
                                <div class="col-lg-12 form-group">
                                    <div class="creat_account">
                                        <input type="checkbox" id="f-option" name="selector">
                                        <label for="f-option">Keep me logged in</label>
                                        <div class="check"></div>
                                    </div>
                                    <h4>Forgot your password ?</h4>
                                </div>
                                <div class="col-lg-12 form-group">
                                    <button type="submit" value="submit" class="btn update_btn form-control">Login</button>
                                </div>
                            </form>
                        </div>
                        <div class="col-lg-8">
                            <div class="login_title">
                                <h2>create account</h2>
                                <h5 style="color:red"> ${ registeringStatus } </h5>
                                <p>Please fill the Details and remember the password</p>
                            </div>
                            <form class="login_form row" onsubmit="return validate(this)"  action="registerProcess" method="get">
                                <div class="col-lg-6 form-group">
                                    <input class="form-control" type="text" onkeyup="return checkpattern(this)" placeholder="Full Name" id="full" name="R_name">
                                </div>
                                <div id="div1"></div>
                                <div class=" col-lg-6 form-group">
                                    <input class="form-control" type="text" onkeyup="return checkpattern(this)" placeholder="Email" id="email"name="R_email">
                                </div>      
                                <div id="div2"></div>                    
                                <div class="col-lg-6 form-group">
                                    <input class="form-control" type="text" onkeyup="return checkpattern(this)" placeholder="User Name" id="user" name="R_username">
                                </div>
                                <div id="div3"></div>
                                <div class="col-lg-6  form-group">
                                    <input class="form-control" type="text" onkeyup="return checkpattern(this)" placeholder="Phone" id="phone"name="R_phone">
                                </div>
                                <div id="div4"></div>
                                <div class=" col-lg-6 form-group">
                                    <input class="form-control" type="password" onkeyup="return checkpattern(this)" placeholder="Password"id="pass" name="R_password">
                                </div>
                                <div id="div5"></div>
                                <div class="col-lg-6 form-group">
                                    <input class="form-control" type="password" onkeyup="return checkpattern(this)"placeholder="Re-Password" id="re-pass"name="R_repassword">
                                </div>
                                <div id="div6"></div>
                                <div class="col-lg-6 form-group">
                                    <button type="submit" value="submit" class="btn subs_btn form-control">Register now</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--================End login Area =================-->
        
        <!--================Footer Area =================-->
        <footer class="footer_area">
            <div class="container">
                <div class="footer_widgets">
                    <div class="row">
                        <div class="col-lg-4 col-md-4 col-6">
                            <aside class="f_widget f_about_widget">
                                <img src="resources/img/logo.png" alt="">
                                <p>MiniAmazon is a Premium website . Best choice for your online store. Lets purchase to enjoy now</p>
                                <h6>Social:</h6>
                                <ul>
                                    <li><a href="#"><i class="social_facebook"></i></a></li>
                                    <li><a href="#"><i class="social_twitter"></i></a></li>
                                    <li><a href="#"><i class="social_pinterest"></i></a></li>
                                    <li><a href="#"><i class="social_instagram"></i></a></li>
                                    <li><a href="#"><i class="social_youtube"></i></a></li>
                                </ul>
                            </aside>
                        </div>
                        <div class="col-lg-2 col-md-4 col-6">
                            <aside class="f_widget link_widget f_info_widget">
                                <div class="f_w_title">
                                    <h3>Information</h3>
                                </div>
                                <ul>
                                    <li><a href="#">About us</a></li>
                                    <li><a href="#">Delivery information</a></li>
                                    <li><a href="#">Terms & Conditions</a></li>
                                    <li><a href="#">Help Center</a></li>
                                    <li><a href="#">Returns & Refunds</a></li>
                                </ul>
                            </aside>
                        </div>
                        <div class="col-lg-2 col-md-4 col-6">
                            <aside class="f_widget link_widget f_service_widget">
                                <div class="f_w_title">
                                    <h3>Customer Service</h3>
                                </div>
                                <ul>
                                    <li><a href="#">My account</a></li>
                                    <li><a href="#">Ordr History</a></li>
                                    <li><a href="#">Wish List</a></li>
                                    <li><a href="#">Newsletter</a></li>
                                    <li><a href="#">Contact Us</a></li>
                                </ul>
                            </aside>
                        </div>
                        <div class="col-lg-2 col-md-4 col-6">
                            <aside class="f_widget link_widget f_extra_widget">
                                <div class="f_w_title">
                                    <h3>Extras</h3>
                                </div>
                                <ul>
                                    <li><a href="#">Brands</a></li>
                                    <li><a href="#">Gift Vouchers</a></li>
                                    <li><a href="#">Affiliates</a></li>
                                    <li><a href="#">Specials</a></li>
                                </ul>
                            </aside>
                        </div>
                        <div class="col-lg-2 col-md-4 col-6">
                            <aside class="f_widget link_widget f_account_widget">
                                <div class="f_w_title">
                                    <h3>My Account</h3>
                                </div>
                                <ul>
                                    <li><a href="#">My account</a></li>
                                    <li><a href="#">Ordr History</a></li>
                                    <li><a href="#">Wish List</a></li>
                                    <li><a href="#">Newsletter</a></li>
                                </ul>
                            </aside>
                        </div>
                    </div>
                </div>
                <div class="footer_copyright">
                    <h5>� <script>document.write(new Date().getFullYear());</script> <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="resources/https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
</h5>
                </div>
            </div>
        </footer>
        <!--================End Footer Area =================-->
        
         
        
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="resources/js/jquery-3.2.1.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="resources/js/popper.min.js"></script>
        <script src="resources/js/bootstrap.min.js"></script>
        <!-- Rev slider js -->
        <script src="resources/vendors/revolution/js/jquery.themepunch.tools.min.js"></script>
        <script src="resources/vendors/revolution/js/jquery.themepunch.revolution.min.js"></script>
        <script src="resources/vendors/revolution/js/extensions/revolution.extension.actions.min.js"></script>
        <script src="resources/vendors/revolution/js/extensions/revolution.extension.video.min.js"></script>
        <script src="resources/vendors/revolution/js/extensions/revolution.extension.slideanims.min.js"></script>
        <script src="resources/vendors/revolution/js/extensions/revolution.extension.layeranimation.min.js"></script>
        <script src="resources/vendors/revolution/js/extensions/revolution.extension.navigation.min.js"></script>
        <script src="resources/vendors/revolution/js/extensions/revolution.extension.slideanims.min.js"></script>
        <!-- Extra plugin css -->
        <script src="resources/vendors/counterup/jquery.waypoints.min.js"></script>
        <script src="resources/vendors/counterup/jquery.counterup.min.js"></script>
        <script src="resources/vendors/owl-carousel/owl.carousel.min.js"></script>
        <script src="resources/vendors/bootstrap-selector/js/bootstrap-select.min.js"></script>
        <script src="resources/vendors/image-dropdown/jquery.dd.min.js"></script>
        <script src="resources/js/smoothscroll.js"></script>
        <script src="resources/vendors/isotope/imagesloaded.pkgd.min.js"></script>
        <script src="resources/vendors/isotope/isotope.pkgd.min.js"></script>
        <script src="resources/vendors/magnify-popup/jquery.magnific-popup.min.js"></script>
        <script src="resources/vendors/vertical-slider/js/jQuery.verticalCarousel.js"></script>
        <script src="resources/vendors/jquery-ui/jquery-ui.js"></script>                                 
        <script src="resources/js/theme.js"></script>
    </body>
</html>