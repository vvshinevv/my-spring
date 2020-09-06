package my.spring.servlet;

import my.spring.service.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet Method!");

        ApplicationContext applicationContext = (ApplicationContext) getServletContext()
                .getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        MyService myService = applicationContext.getBean("myService", MyService.class);

        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<h1>Hello Servlet</h1>");
        resp.getWriter().println("hi " + myService.getName());
        resp.getWriter().println("</body></html>");
    }
}
