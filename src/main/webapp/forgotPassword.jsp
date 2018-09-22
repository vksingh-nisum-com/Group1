 <jsp:include page="simpleHeader.jsp"></jsp:include>     
     <!--================login Area =================-->
        <section class="login_area p_100">
            <div class="container">
                <div class="login_inner">
                    <div class="row">
                        <div class="col-lg-4">
                            <div class="login_title">
                                <h2>Forgot Password? Change it now!</h2>
                                <h6 style="color:red"> ${ loginMessage } </h6>
                            </div>
               <!-- form_xxx -->  <form class="login_form row" onsubmit="return validate(this)" action="forgotPass" method="get">
                                <div class="col-lg-12 form-group">
                                    <input class="form-control" type="email" placeholder="Email" id="user1" name="loginUsername">
                                </div>
                                <div class="col-lg-12 form-group">
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
        
    