<%@page import="it.gestionetv.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modifica</title>
</head>
<body>

	<div align="center">
		<% if(request.getAttribute("messaggioDiErrore") != null){ %>
		<p style="color: red;"><%=request.getAttribute("messaggioDiErrore") %></p>
		<%  }else{ %>
		<h1>Modifica televisore</h1>
		<%}    %>
		<% Televisore televisoreInPagina = (Televisore)request.getAttribute("televisoreDaModificare"); %>
		<form action="ExecuteUpdateServlet" method="post">
			<label for="marcaEditInputId">Marca:</label> <input type="text"
				name="marcaEditInput" id="marcaNuovoInputId"
				value="<%=televisoreInPagina.getMarca() %>"> <br> <br>
			<label for="modelloEditInputId">Modello:</label> <input type="text"
				name="modelloEditInput" id="modelloEditInputId"
				value="<%=televisoreInPagina.getModello() %>"> <br> <br>
			<label for="prezzoEditInputId">Prezzo:</label> <input type="text"
				name="prezzoEditInput" id="prezzoEditInputId"
				value="<%=televisoreInPagina.getPrezzo() %>"> <br> <br>
			<label for="numeroPolliciEditInputId">Numero Pollici:</label> <input
				type="text" name="numeroPolliciEditInput"
				id="numeroPolliciEditInputId"
				value="<%=televisoreInPagina.getNumeroPollici() %>"> <br>
			<br> <label for="codiceEditInputId">Codice:</label> <input
				type="text" name="codiceEditInput" id="codiceEditInputId"
				value="<%=televisoreInPagina.getCodice() %>"> <br> <br>
			<br> <a href="PrepareListAllTelevisoreServlet">Back</a> <br>
			<br> <input type="hidden" name="idEditInput"
				value="<%=televisoreInPagina.getIdTelevisore()%>"> <input
				type="submit" value=" Modifica">
		</form>
	</div>


</body>
</html>