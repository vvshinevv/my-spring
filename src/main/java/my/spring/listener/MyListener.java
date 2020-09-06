package my.spring.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context 가 초기화 되었습니다.");
        sce.getServletContext().setAttribute("name", "vvshinevv");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context 가 파기되었습니다.");
    }
}
