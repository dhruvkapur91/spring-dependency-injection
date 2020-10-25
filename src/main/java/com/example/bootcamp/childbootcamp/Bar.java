package com.example.bootcamp.childbootcamp;

import org.springframework.stereotype.Component;

@Component
class Bar {
    private Foo foo;

    public Bar(Foo foo) {
        this.foo = foo;
        System.out.println("created bar");
    }

}
