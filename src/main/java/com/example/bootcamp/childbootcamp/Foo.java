package com.example.bootcamp.childbootcamp;

import org.springframework.stereotype.Component;

@Component
class Foo {
    public Foo() {
        System.out.println("created Foo");
    }

    public void somePublicMethod() {
        System.out.println("Method called!");
    }

}
