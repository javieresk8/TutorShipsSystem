<html>
<header>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <link rel="stylesheet" href="assets/index.css" />
</header>

<body>
    <div class="container page-container">
        <div class="row">
            <div class="col image-col">
                <img class="epn-logo" alt="logo" src="assets/epn-logo.png" />
            </div>
            <div class="col-8">
                <div class="card login-form text-white">
                    <form class="p-2 form" method="GET" action="./administrator.html">
                        <div class="mb-3">
                            <label class="form-label" for="userType">User Type</label>
                            <select class="form-select custom-input text-white-50" name="userType" id="userType">
                                <option value="Administrative">Administrative</option>
                                <option value="Student">Student</option>
                                <option value="pumpernickel">Teacher</option>
                            </select>
                        </div>
                        <div class="mb-3">
                            <label class="form-label" for="identityNumber">Identity Number</label>
                            <input class="form-control custom-input text-white-50" type="text" id="identityNumber" name="identityNumber" />
                        </div>
                        <div class="mb-3">
                            <label class="form-label " for="password">Password</label>
                            <input class="form-control custom-input text-white-50" type="password" id="password" name="password" />
                        </div>
                        <div class="actions-container">
                            <button type="submit" class="btn btn-primary button">Sign In</button>
                        </div>
                        <div class="mb-3 form-check text-white-50 remember-container">
                            <input type="checkbox" class="form-check-input bg-dark" id="rememberMe">
                            <label class="form-check-label" for="rememberMe">Remember me</label>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
        crossorigin="anonymous"></script>
</body>

</html>