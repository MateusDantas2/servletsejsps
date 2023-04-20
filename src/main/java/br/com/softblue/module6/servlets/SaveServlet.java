package br.com.softblue.module6.servlets;

import br.com.softblue.module6.model.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SaveServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String key = request.getParameter("key");
        String value = request.getParameter("value");

        Properties.save(key, value);

        response.sendRedirect("/servlets/List");
    }
}
