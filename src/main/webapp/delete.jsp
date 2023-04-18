<%@page import="it.gestionetv.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<p> abitante da eliminare : </p>
	
	<%Televisore televisoreInPagina = (Televisore)request.getAttribute("abitanteDaInviareAPaginaRimozione"); %>
	
	<p>Marca : <%= televisoreInPagina.getMarca() %> </p>
	<p>Modello :  <%= televisoreInPagina.getModello() %> </p>
	<p>Prezzo :  <%= televisoreInPagina.getPrezzo() %> </p>
	<p>Numero pollici :  <%= televisoreInPagina.getNumeroPollici() %> </p>
	<p>Codice : <%= televisoreInPagina.getCodice() %> </p>
	
	<br>
	<br>
	<br>
	
	<form action="ExecuteDeleteAbitanteServlet" method="post">
		<input type="hidden" name="idDaRimuovere" value="<%= televisoreInPagina.getIdTelevisore() %>">
		<input type="submit" value="voglio eliminare">
	</form>
	
</body>
</html>