<jsp:include page="./Menu.jsp"></jsp:include>
<div class="container">
        <!-- edit form column -->
        <div class="col-lg-12 text-lg-center">
            <h2 style="color:white;">Edit Profile</h2>
            <br>
            <br>
        </div>
        <div class="col-lg-8 push-lg-4 personal-info">
             <form role="form">
                <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label" style="color:white;">Name</label>
                    <div class="col-lg-9">
                        <input class="form-control" type="text" value="" />
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label" style="color:white;">UserName</label>
                    <div class="col-lg-9">
                        <input class="form-control" type="text" value="" />
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label" style="color:white;">Password</label>
                    <div class="col-lg-9">
                        <input class="form-control" type="password" value="" />
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label" style="color:white;">Confirm password</label>
                    <div class="col-lg-9">
                        <input class="form-control" type="password" value="" />
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-lg-3 col-form-label form-control-label"></label>
                    <div class="col-lg-9">
                        <input type="reset" class="btn btn-secondary" style="color:white;" formaction="./Profile.jsp" value="Cancel" />
                        <input type="button" class="btn btn-primary" style="color:white;" formaction="./loginServ" value="Save Changes" />
                    </div>
                </div>
            </form>
        </div>
       
</div>
<hr />