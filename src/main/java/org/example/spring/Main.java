package org.example.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Book classicBook = context.getBean(ClassicBook.class);
        classicBook.doSomething();

        Book fantascikBook = context.getBean(FantasticBook.class);
        fantascikBook.doSomething();

        Book realisticBook = context.getBean(RealisticBook.class);
        realisticBook.doSomething();
    }

}
