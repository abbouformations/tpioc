package ma.formations.ioc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ma.formations.ioc")
public class MainApplication {

/*  // Injecting by using the Factory
    @Bean
    @Qualifier("dao1")
    public IDao getDao() {
        return new DaoImpl1();
    }*/
}
