package org.example.template_method;

import java.util.Arrays;
import java.util.List;

public class TestLab {
    public static void main(String[] args) {
        Test uiTest = new UITest();
        Test serviceTest = new ServiceTest();

        List<Test> testList = Arrays.asList(uiTest, serviceTest, serviceTest, serviceTest, uiTest);
        TestExecuter.runTests(testList);

    }
}
