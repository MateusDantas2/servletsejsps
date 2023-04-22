package br.com.softblue.module6.session.servlet;

import br.com.softblue.module6.session.entity.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Listar")
public class ListarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("produtos", Produto.getProdutos());
        request.getRequestDispatcher("/produtos.jsp").forward(request, response);
    }
}
