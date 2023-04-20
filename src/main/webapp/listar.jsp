<%@ page import="java.io.InputStream" %>
<%@ page import="java.util.Properties" %>
<%@ page import="java.util.Set" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listagem do arquivo props.txt</title>
</head>
<body>

<%!
    Properties props = new Properties();
%>

<%
    InputStream is = application.getResourceAsStream("/WEB-INF/props.txt");
    props.load(is);
    is.close();

    Set<Object> keys = props.keySet();
%>

<table border="1" width="100%">
    <tr>
        <td><strong>Nome</strong></td>
        <td><strong>Valor</strong></td>
    </tr>
    <% for (Object k : keys) { %>
    <tr>
        <td><%=k%></td>
        <td><%=props.getProperty((String) k)%></td>
    </tr>
    <% } %>
</table>

</body>
</html>
