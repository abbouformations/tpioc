package ma.formations.ioc;

import ma.formations.ioc.dao.DaoImpl1;
import ma.formations.ioc.dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ma.formations.ioc")
public class MainApplication {
    // Injection par factory
    @Bean
    @Qualifier("dao1")
    public IDao getDao() {
        return new DaoImpl1();
    }
}