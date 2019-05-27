package runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Minh\\workspace\\VZWCucumberHybrid\\features", //path of feature files 
		glue= {"test"},								//the path of the step definition files
		format= {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}
//		tags = {"@Test1, @Test2, @Test3"}
//		dryRun = false									//to check mapping between feature file and step def file
		)  



public class TestRunner2Test { }
