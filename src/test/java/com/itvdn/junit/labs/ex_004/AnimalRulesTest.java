package com.itvdn.junit.labs.ex_004;

import com.itvdn.junit.labs.ex_004.entity.Tiger;
import com.itvdn.junit.labs.ex_004.entity.Turtle;
import com.itvdn.junit.labs.ex_004.entity.abstr.Animal;
import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.*;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnimalRulesTest {
    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);
    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Rule
    public TestName testName = new TestName();
    @Rule
    public final ErrorCollector errorCollector = new ErrorCollector();
    @Rule
    public SuccessfulTestsCounter successfulTestsCounter = new SuccessfulTestsCounter();

    @AfterClass
    public static void afterAll() {
        System.out.println("Passed test: " + SuccessfulTestsCounter.getSuccessTests());
    }

    @Test
    public void givenTempFolder_whenNewFile_thenFileIsCreated() throws IOException {
        File testFile = tmpFolder.newFile("file.txt");

        assertTrue("File was created", testFile.isFile());
        assertEquals("Test file and temp folder was matched",
                tmpFolder.getRoot(), testFile.getParentFile());
    }

    @Test
    public void givenIllegalArgument_whenExceptionThrown_thenMessage() {
        thrown.expect(IllegalArgumentException.class);

        throw new IllegalArgumentException("Illegal", new NullPointerException());
    }

    @Test
    @Ignore("ErrorCollector ignored.")
    public void givenMultipleErrors_whenTestIsRunning_thenCollectorReportsErrors() {
        errorCollector.addError(new Throwable("Some thing wrongs"));
        errorCollector.addError(new Throwable("OMG! Some thing wrongs again!"));
        errorCollector.checkThat("Error", not(containsString("Error!")));
    }

    @Test
    public void givenAddition_whenPrintingTestName_thenTestNameIsDisplayed() {
        String expected = "givenAddition_whenPrintingTestName_thenTestNameIsDisplayed";
        System.out.println(testName.getMethodName());
        assertEquals(expected, testName.getMethodName());
    }

    @Test
    public void tigerRun100meters() {
        Animal tiger = new Tiger("Sherkhan", "Orange", 250);
        tiger.run100meters();
    }

    @Test
    @Ignore("Turtle is too slow")
    public void turtleRun100meters() {
        Animal turtle = new Turtle("Leo", "green", 250);
        turtle.run100meters();
    }

    @Test
    public void sayHello() {
        Animal tiger = new Tiger("Sherkhan", "Orange", 250);
        String actual = tiger.sayHello();
        String expected = "'Gr-r-r-r'";

        assertEquals(expected, actual);
    }
}