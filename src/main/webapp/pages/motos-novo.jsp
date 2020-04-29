<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Motos - Cadastro</title>

<spring:url value="/resources/css" var="css" />
<spring:url value="/resources/js" var="js" />

<c:set value="${pageContext.request.contextPath}" var="contextPath" />

<link href="${css}/bootstrap.css" rel="stylesheet">
<link href="${css}/small-business.css" rel="stylesheet">

</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navegation">
		<div class="container">
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="${contextPath}/motos"> Motos </a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="well">
					<h2>Motos</h2>
					
					<form:form modelAttribute="motosModel" action="${contextPath}/motos" method="post">
					
						<spring:hasBindErrors name="motosModel">
							<div class="alert alert-danger" role="alert">
							<form:errors path="*" class="has-error"/>	
							</div>
						</spring:hasBindErrors>
						
						<div class="form-group">
							<label class="control-label" for="nome">Nome:</label>
							<form:input type="text" path="nome" id="nome" class="form-control" maxlength="50" size="50"/>
							<font color="red"><form:errors path="nome"/></font>
							<br/>
						</div>
						
						<div class="form-group">
							<label class="control-label" for="marca">Marca:</label>
							<form:input type="text" path="marca" id="marca" class="form-control" maxlength="30" size="30"/>
							<font color="red"><form:errors path="marca"/></font>
							<br/>
						</div>
						
						<div class="form-group">
							<label class="control-label" for="modelo">Modelo:</label>
							<form:input type="text" path="modelo" id="modelo" class="form-control" maxlength="20" size="20"/>
							<font color="red"><form:errors path="modelo"/></font>
							<br/>
						</div>
						
						<div class="form-group">
							<label class="control-label" for="descricao">Descrição:</label>
							<form:textarea class="form-control" path="descricao" rows="4" cols="100" />
							<font color="red"><form:errors path="descricao"/></font>
							<br/>
						</div>
						
						<div class="form-group">
							<label class="control-label" for="preco">Preço:</label>
							<form:input type="number" path="preco" id="preco" class="form-control" maxlength="30" size="30"/>
							<font color="red"><form:errors path="preco"/></font>
							<br/>
						</div>
						
						<div class="form-group">
							<label class="control-label" for="custoBeneficio">Custo Benefício:</label>
							<form:input type="number" path="custoBeneficio" id="custoBeneficio" class="form-control" maxlength="30" size="30"/>
							<font color="red"><form:errors path="custoBeneficio"/></font>
							<br/>
						</div>
						
						<div class="form-group">
							<label class="control-label" for="valorizacao">Valorização:</label>
							<form:input type="number" path="valorizacao" id="valorizacao" class="form-control" maxlength="30" size="30"/>
							<font color="red"><form:errors path="valorizacao"/></font>
							<br/>
						</div>
						
						<hr>
							<a class="btn btn-default btn-lg" href="${contextPath}/motos"> Cancelar </a>
							<button type="submit" class="btn btn-primary btn-lg"> Gravar </button>
							
							<br>
							<br>
						
					</form:form>
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