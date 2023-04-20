<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Propriedades</title>
</head>
<body>

<%
    String key = (String) request.getAttribute("key");
    if (key == null) {
        key = "";
    }

    String value = (String) request.getAttribute("value");
    if (value == null) {
        value = "";
    }
%>

<center><h1>Editar</h1></center>

<form action="Save" method="POST">
<table>
<tr>
    <td><strong>Chave:</strong></td>
    <td><input type="text" name="key" value="<%=key%>"></td>
</tr>
<tr>
    <td><strong>Valor:</strong></td>
    <td><input type="text" name="value" value="<%=value%>"></td>
</tr>
<tr>
    <td colspan="2" align="right"><input type="submit" value="Salvar"></td>
</tr>
</table>

</body>
</html>
