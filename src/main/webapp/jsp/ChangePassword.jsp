<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Information</title>
    <link rel="stylesheet" href="http://localhost:8080/FinalProject_AppWeb/jsp/assets/administrator.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <link rel="stylesheet" href="http://localhost:8080/FinalProject_AppWeb/jsp/assets/index.css" />
</head>

<body class="text-white">
    <nav class="custom-nav">
        <img class="nav__image" alt="epn-logo" src="http://localhost:8080/FinalProject_AppWeb/jsp/assets/epn-logo.png" />
        <p class="fs-3">Student</p>
        <a class="badge badge-primary" href="LogoutController">Logout</a>
    </nav>
    <div class="container">
        <p class="fs-1">Update Information</p>
        <form class="p-2 form" method="POST" action="ChangePasswordController">
        <div class="card login-form text-white">
                <div class="mb-3" style="min-width: 100%;">
                    <label class="form-label" for="savedPassword">Saved Password</label>
                    <input style="min-width: 100%;" class="form-control custom-input text-white-50" type="password" id="savedPassword"
                        name="savedPassword" value="${clave}"/>
                </div>
                <div class="mb-3" style="min-width: 100%;">
                    <label class="form-label" for="newPassword">New Password</label>
                    <input style="min-width: 100%;" class="form-control custom-input text-white-50" type="password" id="newPassword"
                        name="newPassword" />
                </div>
                <div class="mb-3" style="min-width: 100%;">
                    <label class="form-label" for="repeatNewPassword">Repeat New Password</label>
                    <input style="min-width: 100%;" class="form-control custom-input text-white-50" type="password" id="repeatNewPassword"
                        name="repeatNewPassword" />
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
            window.location.replace("ViewAuthenticationInformationController");
        })
    </script>
</body>

</html>