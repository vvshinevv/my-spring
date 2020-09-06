package my.spring.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Invoke servletContextListener contextInitialized method.");
        sce.getServletContext().setAttribute("name", "vvshinevv");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Invoke servletContextListener contextDestroyed method.");
    }
}
