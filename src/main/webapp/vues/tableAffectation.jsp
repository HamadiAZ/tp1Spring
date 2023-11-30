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

	<h1>Table des affectations :</h1>
	<a href="<c:url value='/addAffectation'/>">Add new Affectation</a>
	<table class="table">
		<thead>
			<tr>
				<th >matiere</th>
				<th >Enseignant</th>
				<th >Heures affectéés</th>
				<th > action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="affect" items="${affectations}">
				<tr>
					<td>${affect.mat.titre}</td>
					<td>${affect.ens.nom} ${affect.ens.prenom}</td>
					<td>${affect.nbh}</td>
					<td><a href="<c:url value='/DeleteAffect/${affect.id}'/>">Supprimer</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
