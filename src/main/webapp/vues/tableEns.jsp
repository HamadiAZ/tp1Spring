<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
</head>
<body class="container my-5">

	<div class="container-fluid mb-5">
		<div class="row">
			<div class="col clickable-div">
				<a href="/tp1/enseignants">Gestion enseignant</a>
			</div>
			<div class="col clickable-div">
				<a href="/tp1/matieres">Gestion Matiere</a>
			</div>
			<div class="col clickable-div">
				<a href="/tp1/affectations">Gestion Affectation</a>
			</div>
		</div>
	</div>

	<h1>Table des enseignants :</h1>
	<a href="<c:url value='/addEnseignant'/>">Add new Enseignant</a>
	<table class="table">
		<thead>
			<tr>
				<th >Id</th>
				<th >First Name</th>
				<th >Last Name</th>
				<th >Charge</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="teacher" items="${enseignants}">
				<tr>
					<td>${teacher.id}</td>
					<td>${teacher.nom}</td>
					<td>${teacher.prenom}</td>
					<td>${teacher.charge}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
