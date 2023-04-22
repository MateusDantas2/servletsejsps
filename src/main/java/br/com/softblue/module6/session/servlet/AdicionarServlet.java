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

@WebServlet("/Adicionar")
public class AdicionarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Produto p = Produto.getProdutoById(id);

        HttpSession session = request.getSession();

        Carrinho carrinho = (Carrinho) session.getAttribute("carrinho");

        if (carrinho == null) {
            carrinho = new Carrinho();
            session.setAttribute("carrinho", carrinho);
        }

        carrinho.add(p);

        request.getRequestDispatcher("/Listar").forward(request, response);
    }
}
