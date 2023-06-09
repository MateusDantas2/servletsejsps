package br.com.softblue.module6.props.servlets;

import br.com.softblue.module6.props.model.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/List")
public class ListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String, String> props = Properties.getProperties();
        request.setAttribute("props", props);

        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }
}
