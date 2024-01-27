package com.itvdn.junit.labs.ex_004;

import com.itvdn.junit.labs.ex_003.CarShopTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({AnimalRulesTest.class, CarShopTest.class})
public class MySuite {
}
