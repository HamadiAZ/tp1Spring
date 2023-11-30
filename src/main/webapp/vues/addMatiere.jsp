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

	<h1>Add matiere :</h1>
	<form:form action="addMatiere" modelAttribute="matiere">
        <p>Title : </p>
        <form:input  path="titre"/>
        <p class="mt-2">Niveau :</p>
        <form:input  path="niveau"/>
        <p class="mt-2">Number of Hours :</p>
        <form:input  path="nbh"/>
        <br />
        <input class="btn mt-5 ml-1" type="submit" value="submit"/>
   </form:form>
			

</body>
</html>
