package org.example.template_method;

public abstract class Test implements Hooks {

    void run(){
        before();
        test();
        after();
    }

}
