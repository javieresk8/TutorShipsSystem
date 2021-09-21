<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Departments</title>
    <link rel="stylesheet" href="http://localhost:8080/FinalProject_AppWeb/jsp/assets/index.css">
    <link rel="stylesheet" href="http://localhost:8080/FinalProject_AppWeb/jsp/assets/administrator.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <link rel="stylesheet" href="http://localhost:8080/FinalProject_AppWeb/jsp/assets/list-users.css">
    <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
    <script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="http://localhost:8080/FinalProject_AppWeb/jsp/assets/student.css">
</head>

<body class="text-white">
    <nav class="custom-nav">
        <img class="nav__image" alt="epn-logo" src="http://localhost:8080/FinalProject_AppWeb/jsp/assets/epn-logo.png" />
        <p class="fs-3">Student</p>
        <a class="badge badge-primary" href="LogoutController">Logout</a>
    </nav>
    <div class="container">
        <div class="actions-container">
            <div>
                <p class="fs-1">Scheduled tutorship</p>
                <a href="./student.html">Menú principal</a>
            </div>
            <div class="dropdown">
                <a href="RequestTutorshipController">
                    <button class="btn btn-success" type="button" id="dropdownMenuButton">
                        New Tutorship
                    </button>
                </a>
            </div>
        </div>
        <div class="tutorship-container">
            <div class="tutorship-card">
                <p>Teacher: Anderson Cardenas</p>
                <p>Date: Monday/25/09/2021</p>
            </div>
            <div class="tutorship-card">
                <p>Teacher: Anderson Cardenas</p>
                <p>Date: Monday/25/09/2021</p>
            </div>
            <div class="tutorship-card">
                <p>Teacher: Anderson Cardenas</p>
                <p>Date: Monday/25/09/2021</p>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
        crossorigin="anonymous"></script>
</body>

</html>