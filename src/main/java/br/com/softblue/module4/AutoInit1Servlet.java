package br.com.softblue.module4;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class AutoInit1Servlet extends HttpServlet {
    private String adminEmail;

    @Override
    public void init(ServletConfig config) throws ServletException {

       String email = config.getInitParameter("adminEmail");
       this.adminEmail = email;

        System.out.println("Servlet carregado! adminEmail = " + email);
    }
}
