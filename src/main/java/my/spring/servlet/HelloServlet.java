package my.spring.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet Method!");
        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<h1>Hello Servlet</h1>");
        resp.getWriter().println("hi " + getServletContext().getAttribute("name"));
        resp.getWriter().println("</body></html>");
    }
}
