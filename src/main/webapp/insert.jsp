<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>


	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	
	
		<body>
		
			<form action="ExecuteInsertServlet" method="post">
				<label for="marcaInputId">MARCA:</label><br>
				<input type="text" name="marcaInput" id="marcaInputId">
				<br>
				<label for="modelloInputId">MODELLO:</label><br>
				<input type="text" name="modelloInput" id="modelloInputId">
				<br><br>
				<label for="prezzoInputId">PREZZO:</label><br>
				<input type="text" name="prezzoInput" id="prezzoInputId">
				<br><br>
				<label for="numeroPolliciInputId">NUMEROPOLLICI:</label><br>
				<input type="text" name="numeroPolliciInput" id="numeroPolliciInputId">
				<br><br>
				<label for="codiceInputId">CODICE:</label><br>
				<input type="text" name="codiceInput" id="codiceInputId">
				<br><br>
				<input type="submit" value="Inserisci">
		</form>
		
		
		</body>
</html>