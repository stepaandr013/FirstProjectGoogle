package org.example.template_method;

public interface Hooks {
    default void before(){}
    default void test(){}
    default void after(){}
}
