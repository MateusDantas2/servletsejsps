package br.com.softblue.module4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HTML")
public class HTMLServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = null;

        try {
            out = response.getWriter();
            response.setContentType("text/html");

            out.print("<html>");
            out.print("<body>");
            out.print("<h1>Título da Página</h1>");
            out.print("<strong>Este é um texto em negrito!</strong>");
            out.print("</body>");
            out.print("</html>");

        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
