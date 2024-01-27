package com.itvdn.junit.labs.ex_005;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeTags("fast")
//@ExcludeTags("slow")
@SelectClasses({IntegrationTest.class, ModuleTest.class})
public class CategoryTest {
}
