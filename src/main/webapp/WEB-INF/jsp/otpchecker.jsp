 <jsp:include page="simpleHeader.jsp"></jsp:include>     
     <!--================login Area =================-->
        <section class="login_area p_100">
            <div class="container">
                <div class="login_inner">
                    <div class="row">
                        <div class="col-lg-4">
                            <div class="login_title">
                                <h2>Forgot Password? Change it now! </h2>
                                <h6 style="color:red"> ${ otpMessage } </h6>
                            </div>
              <!-- xxx -->  <form class="login_form row" onsubmit="return validate(this)" action="otpmatch" method="get">
                                <div class="col-lg-12 form-group">
                                    <input class="form-control" type="text" placeholder="Enter 6 digit otp" id="user1" name="userOTP">
                                </div>          
                              <div>
                                    <button type="submit" value="submit" class="btn update_btn form-control">click here</button>
                                </div>
                            </form><br>
                        </div><br><br>
                        </div>
                        </div>
                        </div>
                        </section>
                     
        <!--================End login Area =================-->
<jsp:include page="footer.jsp"></jsp:include>       
        
    