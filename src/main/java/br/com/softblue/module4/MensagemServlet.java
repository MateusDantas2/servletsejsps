package br.com.softblue.module4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mensagem")
public class MensagemServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.println("Mensagem enviada pelo Servlet!");
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
