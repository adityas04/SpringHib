<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
    <script>
        document.write("Press the submit button to search");
    </script>
    <form action="search.jsp" method="post">
    <input type="submit" value="search"> 
    </form>
    <%
        String search = request.getParameter("search");
        session.setAttribute("search",search);
     %>
</body>
</html>