package com.eulbyvan.springcoredemo;

import com.eulbyvan.springcoredemo.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {
    @Test
    void createBean() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Assertions.assertNotNull(ctx);
    }

    @Test
    void getBean() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Foo foo1 = ctx.getBean(Foo.class);
        Foo foo2 = ctx.getBean(Foo.class);

        Assertions.assertSame(foo1, foo2);
    }
}
