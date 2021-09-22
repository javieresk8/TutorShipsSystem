<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>New Schedule</title>
    <link rel="stylesheet" href="http://localhost:8080/FinalProject_AppWeb/jsp/assets/administrator.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <link rel="stylesheet" href="http://localhost:8080/FinalProject_AppWeb/jsp/assets/index.css" />
</head>

<body class="text-white">
    <nav class="custom-nav">
        <img class="nav__image" alt="epn-logo" src="http://localhost:8080/FinalProject_AppWeb/jsp/assets/epn-logo.png" />
        <p class="fs-3">Teacher</p>
        <a class="badge badge-primary" href="LogoutController">Logout</a>
    </nav>
    <div class="container">
        <p class="fs-1">Update schedule</p>
        <form class="p-2 form" method="POST" action="UpdateAvailableSchedule">
            <div class="card login-form text-white">
                <div style="display: flex; flex-direction: column; justify-content: space-between;">
                    <div class="mb-3">
                        <label class="form-label" for="date">Day of week</label>
                        <br/>
                        <input class="data-picker" type="date" id="date" name="date"/>
                    </div>
                    <div class="mb-3">
                        <label class="form-label" for="hour">Hour</label>
                        <select style="min-width: 100%;" class="form-select custom-input text-white-50" name="hour" id="hour">
                            <option value="07h00 - 07h15">07h00 - 07h15</option>
                            <option value="07h15 - 07h30">07h15 - 07h30</option>
                            <option value="07h30 - 07h45">07h30 - 07h45</option>
                            <option value="07h45 - 08h00">07h45 - 08h00</option>
                            <option value="08h00 - 08h15">08h00 - 08h15</option>
                            <option value="08h15 - 08h30">08h15 - 08h30</option>
                            <option value="08h30 - 08h45</">08h30 - 08h45</option>
                            <option value="08h45 - 09h00">08h45 - 09h00</option>
                            <option value="09h00 - 09h15">09h00 - 09h15</option>
                            <option value="09h15 - 09h30">09h15 - 09h30</option>
                            <option value="09h30 - 09h45">09h30 - 09h45</option>
                            <option value="09h45 - 10h00">09h45 - 10h00</option>
                            <option value="10h00 - 10h15">10h00 - 10h15</option>
                            <option value="10h15 - 10h30">10h15 - 10h30</option>
                            <option value="10h30 - 10h45">10h30 - 10h45</option>
                            <option value="10h45 - 11h00">10h45 - 11h00</option>
                            <option value="11h00 - 11h15">11h00 - 11h15</option>
                            <option value="11h15 - 11h30">11h15 - 11h30</option>
                            <option value="11h30 - 11h45">11h30 - 11h45</option>
                            <option value="11h45 - 12h00">11h45 - 12h00</option>
                            <option value="12h00 - 12h15">12h00 - 12h15</option>
                            <option value="12h15 - 12h30">12h15 - 12h30</option>
                            <option value="12h30 - 12h45">12h30 - 12h45</option>
                            <option value="12h45 - 13h00">12h45 - 13h00</option>
                            <option value="13h00 - 13h15">13h00 - 13h15</option>
                            <option value="13h15 - 13h30">13h15 - 13h30</option>
                            <option value="13h30 - 13h45">13h30 - 13h45</option>
                            <option value="13h45 - 14h00">13h45 - 14h00</option>
                            <option value="14h00 - 14h15">14h00 - 14h15</option>
                            <option value="14h15 - 14h30">14h15 - 14h30</option>
                            <option value="14h30 - 14h45">14h30 - 14h45</option>
                            <option value="14h45 - 15h00">14h45 - 15h00</option>
                            <option value="15h00 - 15h15">15h00 - 15h15</option>
                            <option value="15h15 - 15h30">15h15 - 15h30</option>
                            <option value="15h30 - 15h45">15h30 - 15h45</option>
                            <option value="15h45 - 16h00">15h45 - 16h00</option>
                            <option value="16h00 - 16h15">16h00 - 16h15</option>
                            <option value="16h15 - 16h30">16h15 - 16h30</option>
                            <option value="16h30 - 16h45">16h30 - 16h45</option>
                            <option value="16h45 - 17h00">16h45 - 17h00</option>
                        </select>
                    </div>
                </div>
            </div>
            <div class="actions-container" style="margin-top: 50px; display: flex; justify-content: center; gap: 50px;">
                <button class="btn btn-danger" id="cancelButton">Cancel</button>
                <button type="submit" class="btn btn-success">Save</button>
            </div>
        </form>
    </div>
    <script>
        const cancelButton = document.getElementById('cancelButton');
        cancelButton.addEventListener('click', (e) => {
            e.preventDefault();
            window.location.replace("ListTeacherAvailableHoursController");
        })
    </script>
</body>

</html>