<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Teacher | Schedule</title>
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
        <p class="fs-3">Teacher</p>
        <a class="badge badge-primary" href="LogoutController">Logout</a>
    </nav>
    <div class="container">
        <div class="actions-container">
            <div>
                <p class="fs-1">Your schedule</p>
                <a href="MenuTeacherController">Menu principal</a>
            </div>
        </div>
        <table class="table table-dark table-striped custom-table" id="table">
            <thead>
                <tr>
                    <td >Dia</td>
                    <td >Hora Inicio</td>
                    <td >Hora Fin</td>
                    <td >actions</td>
                    <tr />
            </thead>
             <c:forEach var="horario" items="${horarios}" >
<tr>
	<td>${horario.dia }</td>
	<td>${horario.horaInicio   }</td>
	<td>${ horario.horaFin}</td>
	<td> <a href="UpdateAvailableSchedule?id=${horario.idSchedule}">Actualizar</a> | <a href="DeleteAvailableScheduleController?id=${horario.idSchedule}">Eliminar</a> </td>
</tr>
</c:forEach>
        </table>
        <div style="min-width: 100%; text-align: center; margin: 50px 0;">
            <a href="InsertAvailableSchedule">
                <button class="btn btn-success">Add Schedule</button>
            </a>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
        crossorigin="anonymous"></script>
</body>

</html>