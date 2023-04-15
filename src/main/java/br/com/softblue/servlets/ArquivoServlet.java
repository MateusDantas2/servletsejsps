package br.com.softblue.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/Arquivo")
public class ArquivoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        OutputStream out = null;
        FileInputStream file = null;

        try {
            out = response.getOutputStream();

            response.addHeader("Content-Disposition", "attachment; filename=arquivo.zip");

            response.setContentType("application/zip");

            file = new FileInputStream(
            "/media/mateusdev/Disco Local/Projects/Java Web com Servlets e JSPs/arquivo.zip"
            );

            byte[] buffer = new byte[1024];
            int b;

            while ((b = file.read(buffer)) > -1) {
                out.write(buffer, 0, b);
            }

        } finally {
            if (file != null) {
                file.close();
            } if (out != null) {
                out.close();
            }
        }
    }
}
