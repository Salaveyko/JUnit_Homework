package com.itvdn.junit.labs.ex_005;

import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;

public class ExecutionListener implements TestExecutionListener {
    private int testCount = 0;
    private int failureCount = 0;

    @Override
    public void testPlanExecutionStarted(TestPlan testPlan) {
        System.out.println("Testing...");
    }

    @Override
    public void testPlanExecutionFinished(TestPlan testPlan) {
        System.out.println("\nNumber of tests executed: " + testPlan.countTestIdentifiers((TestIdentifier::isTest)));
        System.err.println("Number of tests with failed execution: " + failureCount);
    }

    @Override
    public void executionStarted(TestIdentifier identifier) {
        if (identifier.isTest()) {
            System.out.println("\nStarting execution of test case: " + identifier.getDisplayName());
        }
    }

    @Override
    public void executionFinished(TestIdentifier identifier, TestExecutionResult result) {
        if (identifier.isTest()) {
            System.out.println("Finished execution of test case: " + identifier.getDisplayName());
            testCount++;
        }
        if (result.getStatus() == TestExecutionResult.Status.FAILED) {
            failureCount++;
        }
    }
}
