<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IBLOG</title>
<link rel="stylesheet" href="style.css">
<script type="text/javascript" src="script.js"></script>
</head>
<body>
<%
	out.print("<form method='get' action="+request.getContextPath()+"/Servlet>");
%>
	<p class="textes">Username</p>
	<input type="text" name="username" required class="Input"><br>
	<p class="textes">Password</p>
	<input type="password" name="password" required class="Input"><br>
	Don't have an account ? Create one <a href="create_acccount.html" class="lien">here</a>
	<input type="submit" value="send" class="pseudo-bouton">
</form>
</body>
</html>