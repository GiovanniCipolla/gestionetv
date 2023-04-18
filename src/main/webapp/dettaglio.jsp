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
	
		<%Televisore televisoreInPagina = (Televisore)request.getAttribute("televisoreDaInviareAPaginaDettaglio"); %>
		
		<p>Marca   <%= televisoreInPagina.getMarca()%> </p>
		
		<p>Modello  <%= televisoreInPagina.getModello() %> </p>
		
		<p>Prezzo    <%= televisoreInPagina.getPrezzo() %> </p>
		
		
		<p>NumeroPollici   <%= televisoreInPagina.getNumeroPollici() %> </p>
		
		<p>Codice  <%= televisoreInPagina.getCodice() %> </p>
		
	<a href="searchForm.jsp">Torna nella home</a>	
		
	</body>
</html>