<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="classes.*,java.util.ArrayList"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
	<%
	String username=request.getParameter("username");
	%>
	<%
	out.print("<form method='get' action="+request.getContextPath()+"/Servlet_1>");
%>
	<p class="textes">Sujet</p>
	<input type="text" name="sujet" required class="Input"><br>
	<p class="textes">Desciption</p>
	<input type="text" name="desciption" required class="Input"><br>
	<input type="submit" value="Publier" class="pseudo-bouton">
</form>
<div class="container">
        <table class="article-table">
            <tr>
                <th>Sujet</th>
                <th>Description</th>
                <th>Nb J'aime</th>
                <th>Nb Deteste</th>
            </tr>
            <% Afficher aff = new Afficher();
               ArrayList<Article> art = aff.listerArticle();
               for (int i = 0; i < art.size(); i++) {
                   Article cc = art.get(i); %>
            <tr>
                <td><%= cc.getSujet() %></td>
                <td><%= cc.getDescription() %></td>
                <td>
                
                	<%= cc.getN_aime() %>
                    <form method="post" action="/Blog/Servlet_1">
                        <input type="text" name="id" value="<%= cc.getSujet() %>" hidden>
                        <input type="submit" value="+" class="like-button">
                    </form>
                </td>
                <td>
                	<%= cc.getN_naime() %>
                    <form method="post" action="/Blog/Fservlet">
                        <input type="text" name="id" value="<%= cc.getSujet() %>" hidden>
                        <input type="submit" value="-" class="dislike-button">
                    </form>
                </td>
            </tr>
            <% } %>
        </table>
    </div></body>
</html>