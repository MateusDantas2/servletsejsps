package br.com.softblue.module6.session.servlet;

import br.com.softblue.module6.session.entity.Carrinho;
import br.com.softblue.module6.session.entity.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/Carrinho")
public class CarrinhoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        Carrinho carrinho = (Carrinho) session.getAttribute("carrinho");

        List<Produto> produtos = carrinho.getProdutos();

        request.setAttribute("produtos", produtos);
        request.getRequestDispatcher("/carrinho.jsp").forward(request, response);
    }
}
