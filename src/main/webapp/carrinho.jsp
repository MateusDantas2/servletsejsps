<%@ page import="java.util.Collection" %>
<%@ page import="br.com.softblue.module6.session.entity.Produto" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Carrinho</title>
</head>
<body>

<h1>Carrinho</h1>

<%
    List<Produto> produtos = (List<Produto>) request.getAttribute("produtos");
%>

<table border="1" width="100%">
<tr>
    <td align="center"><strong>Produto</strong></td>
    <td align="center"><strong>Valor</strong></td>
</tr>
<% for (Produto p : produtos) { %>
    <tr>
        <td align="center"><%=p.getNome()%></td>
        <td align="center"><%=p.getValor()%></td>
    </tr>
<% } %>
</table>

</body>
</html>
