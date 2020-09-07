package my.spring.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackages = { "my.spring" }, excludeFilters = @ComponentScan.Filter(Controller.class))
public class AppConfig {
}
