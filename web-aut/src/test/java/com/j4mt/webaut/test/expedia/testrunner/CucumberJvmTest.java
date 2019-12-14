package com.j4mt.webaut.test.expedia.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/"})
public class CucumberJvmTest extends AbstractTestNGCucumberTests {

}
