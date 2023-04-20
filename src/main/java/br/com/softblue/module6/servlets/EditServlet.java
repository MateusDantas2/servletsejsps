package br.com.softblue.module6.servlets;

import br.com.softblue.module6.model.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String key = request.getParameter("key");

        if (key != null) {
            String value = Properties.getValue(key);

            request.setAttribute("key", key);
            request.setAttribute("value", value);
        }
        request.getRequestDispatcher("/edit.jsp").forward(request, response);
    }
}
