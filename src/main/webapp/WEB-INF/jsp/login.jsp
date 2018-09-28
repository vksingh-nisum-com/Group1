   <jsp:include page="simpleHeader.jsp"></jsp:include>     
        
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
                            <form class="login_form row"  action="loginProcess" method="get">
                                <div class="col-lg-12 form-group">
                                    <input class="form-control" type="email" placeholder="email" id="user1" name="loginUsername">
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
                                    <a href="forgotPassword"><h4>Forgot your password ?</h4></a>
                                </div>
                                <div class="col-lg-12 form-group">
                                    <button type="submit" value="submit" class="btn update_btn form-control">Login</button>
                                </div>
                            </form>
                        </div>
                        <div class="col-lg-8">
                            <div class="login_title">
+                                <h2>create account</h2>
                                <h5 style="color:red"> ${ registeringStatus } </h5>
                                <p>Please fill the Details and remember the password</p>
                            </div>
                            <form class="login_form row" onsubmit="return validate(this)"  action="registerProcess" method="get">
                                <div class="col-lg-12 form-group">
                                    <input class="form-control" type="text" onkeyup="return checkpattern(this)" placeholder="Full Name" id="full" name="R_name">
                               		<div id="div1"></div><br>
                                </div>
                                
                                <div class=" col-lg-12 form-group">
                                    <input class="form-control" type="text" onkeyup="return checkpattern(this)" placeholder="Email" id="email"name="R_email">
                                <div id="div2"></div><br> </div>      
                                                    
                                <div class="col-lg-12 form-group">
                                    <input class="form-control" type="text" onkeyup="return checkpattern(this)" placeholder="User Name" id="user" name="R_username">
                               <div id="div3"></div><br> </div>
                                
                                <div class="col-lg-12  form-group">
                                    <input class="form-control" type="text" onkeyup="return checkpattern(this)" placeholder="Phone" id="phone"name="R_phone">
                                <div id="div4"></div><br></div>
                                
                                <div class=" col-lg-12 form-group">
                                    <input class="form-control" type="password" onkeyup="return checkpattern(this)" placeholder="Password"id="pass" name="R_password">
                               <div id="div5"></div><br> </div>
                                
                                <div class="col-lg-12 form-group">
                                    <input class="form-control" type="password" onkeyup="return checkpattern(this)"placeholder="Re-Password" id="passwor"name="R_repassword">
                                <div id="div6"></div><br></div>
                                
                                <div class="col-lg-12 form-group">
                                    <button type="submit" value="submit" class="btn subs_btn form-control" >Register now</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--================End login Area =================-->
        
        <!--================Footer Area =================-->
   <jsp:include page="footer.jsp"></jsp:include>     