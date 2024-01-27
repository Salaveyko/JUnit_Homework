package com.itvdn.junit.labs.ex_005;


import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({PrimeNumberCheckerTest.class
        , SafeAdditionUtilTest.class
        , CategoryTest.class})
public class TestsGroupByLessons {
}
