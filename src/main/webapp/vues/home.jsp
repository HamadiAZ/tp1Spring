<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" />
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

	<h1>Liste des matieres :</h1>
	<a href="<c:url value='/addMatiere'/>">Ajouter matiere</a>
	<table class="table">
		<thead>
			<tr>
				<th >Id</th>
				<th >Title</th>
				<th >Niveau</th>
				<th >Number of Hours</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="subject" items="${subjects}">
				<tr>
					<td>${subject.id}</td>
					<td>${subject.titre}</td>
					<td>${subject.niveau}</td>
					<td>${subject.nbh}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
