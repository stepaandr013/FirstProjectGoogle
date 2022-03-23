package org.example.template_method;

import java.util.List;

public class TestExecuter {

    public static void runTests(List<? extends Test> tests){
        tests.forEach(Test::run);
    }

}
