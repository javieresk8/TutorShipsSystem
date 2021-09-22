<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>New Tutorship</title>
    <link rel="stylesheet" href="http://localhost:8080/FinalProject_AppWeb/jsp/assets/administrator.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <link rel="stylesheet" href="http://localhost:8080/FinalProject_AppWeb/jsp/assets/index.css" />
   <script type="text/javascript">
    
    	
    	function changeFunc() {

    		var selectedValue = teacher.options[teacher.selectedIndex].value;
    		var id_teacher = ${horarios.get};
    	
    		if(selectValue==id_teacher)
    			alert(selectedValue);
    		}
    	
    	</script>
</head>

<body class="text-white">
    <nav class="custom-nav">
        <img class="nav__image" alt="epn-logo" src="http://localhost:8080/FinalProject_AppWeb/jsp/assets/epn-logo.png" />
        <p class="fs-3">Student</p>
        <a class="badge badge-primary" href="LogoutController">Logout</a>
    </nav>
    <div class="container">
        <p class="fs-1">Add new tutorship</p>
        <form class="p-2 form" method="POST" action="RequestTutorshipController">
            <div class="card login-form text-white">
                <div style="display: flex; flex-direction: column; justify-content: space-between;">
           
                    <div class="mb-3">
                        <label class="form-label" for="teacher">Select a Teacher</label>
                        <select style="min-width: 100%;" class="form-select custom-input text-white-50" name="teacher" id="teacher" onchange="changeFunc();">
                        <c:forEach var="profesor" items="${arrayProfesores}">
							<option value="${profesor.getIdUsuario()}">${profesor.getNombre()}  ${profesor.getApellido()} </option>
            			</c:forEach>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label class="form-label" for="date">Pick up a Date</label>
    
                        <select style="min-width: 100%;" class="form-select custom-input text-white-50" name="date" id="date">
                        <c:forEach var="horarios" items="${sc}">
                        <option value="${horarios.getIdSchedule()}">${horarios.getDia()}    ${horarios.getHoraInicio()} ${horarios.getHoraFin()}</option>
							
						
                            
            			</c:forEach>
                            
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
            window.location.replace("ListTutorshipController");
        })
    </script>
   
</body>

</html>