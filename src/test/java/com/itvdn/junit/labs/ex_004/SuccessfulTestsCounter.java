package com.itvdn.junit.labs.ex_004;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class SuccessfulTestsCounter implements TestRule {
    private static int successTests = 0;

    public static int getSuccessTests() {
        return successTests;
    }

    @Override
    public Statement apply(Statement statement, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                try {
                    statement.evaluate();
                    successTests++;
                } catch (Throwable t) {
                    throw t;
                }
            }
        };
    }
}
