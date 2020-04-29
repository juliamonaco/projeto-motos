<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Motos - Detalhes</title>

<spring:url value="/resources/css" var="css" />
<spring:url value="/resources/js" var="js" />

<c:set value="${pageContext.request.contextPath}" var="contextPath" />

<link href="${css}/bootstrap.css" rel="stylesheet">
<link href="${css}/small-business.css" rel="stylesheet">

</head>
<body>

	<nav class="navbar navbar-inverse navbar-fixed-top" role="navegation">
		<div class="container">
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li>
						<a href="${contextPath}/motos"> Motos </a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="well">
					<h2>Motos</h2>
						<div class="form-group">
							<label class="control-label" for="name">Nome:</label>
							<b>${motos.nome}</b>
						</div>
						
						<div class="form-group">
							<label class="control-label" for="marca"> Marca:</label>
							<label class="label label-default">${motos.marca}</label>
						</div>
						
						<div class="form-group">
							<label class="control-label" for="modelo"> Modelo:</label>
							<label class="label label-default">${motos.modelo}</label>
						</div>
						
						<div class="form-group">
							<label class="control-label" for="marca"> Descrição:</label>
							<label class="label label-default">${motos.descricao}</label>
						</div>
						
						<div class="form-group">
							<label class="control-label" for="marca"> Preço:</label>
							<label class="label label-default">${motos.preco}</label>
						</div>
						
						<div class="form-group">
							<label class="control-label" for="marca"> Custo Benefício:</label>
							<label class="label label-default">${motos.custoBeneficio}</label>
						</div>
						
						<div class="form-group">
							<label class="control-label" for="marca"> Valorização:</label>
							<label class="label label-default">${motos.valorizacao}</label>
						</div>
						
						<hr>
							<a class="btn btn-default btn-lg" href="${contextPath}/motos">Voltar</a>
							<br>
							<br>
							
				</div>
			</div>
		</div>
	</div>
	
	<!-- jQuery -->
	<script src="${js}/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="${js}/bootstrap.min.js"></script>
	
</body>
</html>