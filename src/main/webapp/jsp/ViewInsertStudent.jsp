<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>New Student</title>
    <link rel="stylesheet" href="http://localhost:8080/FinalProject_AppWeb/jsp/assets/administrator.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <link rel="stylesheet" href="http://localhost:8080/FinalProject_AppWeb/jsp/assets/index.css" />
</head>

<body class="text-white">
    <nav class="custom-nav">
        <img class="nav__image" alt="epn-logo" src="http://localhost:8080/FinalProject_AppWeb/jsp/assets/epn-logo.png" />
        <p class="fs-3">Administrator</p>
        <a class="badge badge-primary" href="LogoutController">Logout</a>
    </nav>
    <div class="container">
        <p class="fs-1">Add new student</p>
        <form class="p-2 form" method="POST" action="InsertStudentController">
        <div class="card login-form text-white">
            <div style="display: flex; justify-content: space-between;">
                <div class="mb-3">
                    <label class="form-label" for="identityNumber">Name</label>
                    <input class="form-control custom-input text-white-50" type="text" id="name"
                        name="name" />
                </div>
                <div class="mb-3">
                    <label class="form-label" for="identityNumber">Last name</label>
                    <input class="form-control custom-input text-white-50" type="text" id="lastname"
                        name="lastname"/>
                </div>
            </div>
            <div>
                    <label class="form-label" for="identityNumber">C.I</label>
                    <input style="min-width: 100%;" class="form-control custom-input text-white-50" type="text" id="identityNumber"
                        name="identityNumber" />
            </div>
                <div class="mb-3" style="min-width: 100%; margin-top:20px;">
                    <label class="form-label" for="password">Password</label>
                    <input style="min-width: 100%;" class="form-control custom-input text-white-50" type="password" id="password"
                        name="password" />
                </div>
            </div>
            <div class="actions-container" style="margin-top: 50px; display: flex; justify-content: center; gap: 50px;">
                <a>
                    <button id="cancelButton" class="btn btn-danger">Cancel</button>
                </a>
                <button type="submit" class="btn btn-success">Save</button>
            </div>
        </form>
    </div>
    <script>
        const cancelButton = document.getElementById('cancelButton');
        cancelButton.addEventListener('click', (e) => {
            e.preventDefault();
            window.location.replace("ListUsersController");
        })
    </script>
</body>

</html>