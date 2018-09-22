 <jsp:include page="simpleHeader.jsp"></jsp:include>     
     <!--================login Area =================-->
        <section class="login_area p_100">
            <div class="container">
                <div class="login_inner">
                    <div class="row">
                        <div class="col-lg-4">
                            <div class="login_title">
                                <h2>Forgot Password? Change it now!</h2>
                                <h6 style="color:red"> ${ resetMessage } </h6>
                               
                            </div>
              <!-- xxx -->  <form class="login_form row" onsubmit="return validate(this)" action="passwordreset" method="get">
                                        
                                <div class="col-lg-12 form-group">
                                    <input class="form-control" type="password" placeholder="New Password" id="Password" name="loginPassword">
                                </div> 
                                
                                <div class="col-lg-12 form-group">
                                    <input class="form-control" type="password" placeholder="Confirm Password" id="confirmPassword" name="confirmloginPassword">
                                </div> 
                                <div class="col-lg-12 form-group">
                                    <button type="submit" value="submit" class="btn update_btn form-control">Change Password</button>
                                </div>
                            </form><br>
                        </div><br><br>
                        </div>
                        </div>
                        </div>
                        </section>
                     
        <!--================End login Area =================-->
<jsp:include page="footer.jsp"></jsp:include>       
        
    