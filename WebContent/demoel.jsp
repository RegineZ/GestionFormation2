<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Démonstration JSTL/EL</title>
</head>
<body>
	<h1>Démonstration JSTL/EL</h1>
	
	<ul>
		<li>Nom : <c:out value="${nom}"/></li>
		<li>Prénom : <c:out value="${prenom }"/></li>
		<li>Email : <c:out value="${email}"/></li>
		<li>Login : <c:out value="${login}"/></li>
		<li>Mot de Passe : <c:out value="${mdp}"/></li>
	</ul>
	
	<a href="<c:out value="${pageContext.request.requestURI}"/>">Bienvenue dans le réseau Objis!</a>
<p>
<img src="logo-objis.png">
</body>
</html>