package com.itvdn.junit.labs.ex_005;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

/**
 * 1.
 * a) Create a PrimeNumberChecker class and cover it with a parametrized test with method source.
 * b) Create a SafeAdditionUtil class and cover it with parametrized tests (ArgumentSource, MethodSource,
 * FileSource, AnnotationSource).
 * 2.
 * a) Create an IntegrationTest with @Tag("slow") and a couple of simple methods inside.
 * b) Create a ModuleTest with methods, that have @Tag("slow"), @Tag("fast") combinations.
 * c) Make a Suite of above test for this task, including and excluding the different tags.
 * 3.
 * a) Make a Suite of all test cases.
 * b) Launch all test cases using the programmatic approach.
 * c) Create an ExecutionListener for the JUnit tests Launcher.
 */
public class TestRunner {
    public static void main(String[] args) {
        Launcher launcher = LauncherFactory.create();
        ExecutionListener listener = new ExecutionListener();
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder
                .request().selectors(selectClass(TestsGroupByLessons.class)).build();

        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);
    }
}
