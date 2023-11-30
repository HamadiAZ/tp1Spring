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

	<h1>Add Affectation :</h1>
	<form:form action="addAffectation" modelAttribute="affectation">
	
       <form:select class="form-control mt-4" path="mat.id">
             <form:option value="0" label="Select matiere"/>
             <form:options items="${matieres}" itemValue="id" itemLabel="titre"/>
        </form:select>
        
        <form:select class="form-control mt-4" path="ens.id">
             <form:option value="0" label="Select enseignant"/>
             <form:options items="${enseignants}" itemValue="id" itemLabel="nom"/>
        </form:select>
		
        <p class="mt-2">charge : </p>
        <form:input type="number" path="nbh"/>
       <input class="btn btn-success mt-3 ml-1" type="submit" value="submit"/>
   </form:form>
			

</body>
</html>
