<%@ page import="java.util.Collection" %>
<%@ page import="br.com.softblue.module6.session.entity.Produto" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Produtos</title>
</head>
<body>

<h1>Lista de Produtos</h1>

<%
    Collection<Produto> produtos = (Collection<Produto>) request.getAttribute("produtos");
%>

<table border="1" width="100%">
<tr>
    <td align="center"><strong>Produto</strong></td>
    <td align="center"><strong>Valor</strong></td>
    <td align="center"></td>
</tr>
<% for (Produto p : produtos) { %>
    <tr>
        <td align="center"><%=p.getNome()%></td>
        <td align="center"><%=p.getValor()%></td>
        <td align="center"><a href="Adicionar?id=<%=p.getId()%>">Adicionar</a></td>
    </tr>
<% } %>
</table>

</body>
</html>
