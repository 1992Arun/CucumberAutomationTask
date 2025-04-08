package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utility.Utility;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", glue="org.step", monochrome =true,  dryRun=false, tags="@registercheckout", plugin= {"pretty","json:\\src\\test\\resources\\Report\\Report.json"})

public class TestRunner {
	 
	@AfterClass
	public static void JVMReport() {
		
		Utility.jvmReport("\\src\\test\\resources\\Report\\Report.json");
		
	}

}
