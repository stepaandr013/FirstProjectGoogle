package org.example.template_method;

public class ServiceTest extends Test{
    @Override
    public void before() {
        System.out.println("In Before UITest");
    }

    @Override
    public void test() {
        System.out.println("In Test UITest");
    }

    @Override
    public void after() {
        System.out.println("In After UITest");
    }
}
