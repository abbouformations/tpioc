package ma.formations.ioc;

import ma.formations.ioc.service.IService;
import ma.formations.ioc.service.ServiceImpl;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestService {

    static AnnotationConfigApplicationContext context = null;

    @BeforeAll
    static void init() {
        context = new AnnotationConfigApplicationContext(MainApplication.class);
    }

    @AfterAll
    static void close() {
        context.close();
    }

    @Test
    void test1() {
        IService service = context.getBean(ServiceImpl.class);
        Assertions.assertAll("données erronées",
                () -> Assertions.assertEquals(1L, service.findById(1L).getId(), "First Id article is not correct"),
                () -> Assertions.assertEquals("PC HP I7", service.findById(1L).getDescription(), "First article description is not correct"),
                () -> Assertions.assertEquals(25000d, service.findById(1L).getPrice(), "First article price is not correct"),
                () -> Assertions.assertEquals(5d, service.findById(1L).getQuantity(), "First article quantity is not correct"));
    }
/*
    @Test
    void testDAOEquals() {
        IDao dao1 = context.getBean(DaoImpl1.class);
        IDao dao2 = context.getBean(DaoImpl1.class);
        Assertions.assertSame(dao1, dao2);
    }


    @Test
    void testserviceEqual() {
        IService service1 = context.getBean(ServiceImpl.class);
        IService service2 = context.getBean(ServiceImpl.class);
        Assertions.assertSame(service1, service2);
    }*/

}
