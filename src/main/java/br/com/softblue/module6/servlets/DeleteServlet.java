package br.com.softblue.module6.servlets;

import br.com.softblue.module6.model.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String key = request.getParameter("key");
        Properties.delete(key);

        response.sendRedirect("/servlets/List");

    }
}
