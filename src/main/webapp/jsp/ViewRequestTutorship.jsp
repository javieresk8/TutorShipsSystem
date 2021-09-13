<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>New Tutorship</title>
    <link rel="stylesheet" href="./assets/administrator.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <link rel="stylesheet" href="assets/index.css" />
</head>

<body class="text-white">
    <nav class="custom-nav">
        <img class="nav__image" alt="epn-logo" src="./assets/epn-logo.png" />
        <p class="fs-3">Student</p>
        <a class="badge badge-primary" href="./login.html">Logout</a>
    </nav>
    <div class="container">
        <p class="fs-1">Add new tutorship</p>
        <form class="p-2 form" method="GET" action="./new-tutorship-date.html">
            <div class="card login-form text-white">
                <div style="display: flex; flex-direction: column; justify-content: space-between;">
                    <div class="mb-3">
                        <label class="form-label" for="teacher">Select a Teacher</label>
                        <select style="min-width: 100%;" class="form-select custom-input text-white-50" name="teacher" id="teacher">
                            <option value="id_1">Teacher 1</option>
                            <option value="id_2">Teacher 2</option>
                            <option value="id_3">Teacher 3</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label class="form-label" for="date">Pick up a Date</label>
                        <select style="min-width: 100%;" class="form-select custom-input text-white-50" name="date" id="date">
                            <option value="id_1">date 1</option>
                            <option value="id_2">date 2</option>
                            <option value="id_3">date 3</option>
                        </select>
                    </div>
                </div>
            </div>
            <div class="actions-container" style="margin-top: 50px; display: flex; justify-content: center; gap: 50px;">
                <a>
                    <button id="cancelButton" class="btn btn-danger">Cancel</button>
                </a>
                <button type="submit" class="btn btn-success">Next</button>
            </div>
        </form>
    </div>
    <script>
        const cancelButton = document.getElementById('cancelButton');
        cancelButton.addEventListener('click', (e) => {
            e.preventDefault();
            window.location.replace("./list-tutorship.html");
        })
    </script>
</body>

</html>