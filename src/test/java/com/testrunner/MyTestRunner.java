package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "C:\\Users\\HP\\eclipse-workspace\\CucumberPOMFramework\\src\\test\\resources\\com\\features\\Toy.feature" }, 
         glue = { "com.stepdefintions","Hooks" }, 
         plugin = { "pretty",
        		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		)

public class MyTestRunner {

}
