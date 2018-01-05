package com.wcxu.junitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ StringUtilJUnitTest.class, OtherStringUtilJunitTest.class })
public class TestAll {

}
