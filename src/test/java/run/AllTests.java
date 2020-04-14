package run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/bdd",tags={"@CT000,@CT001,@CT002,@CT003,@CT004,@CT005,@CT006,@CT007,@CT008"},
glue = "classpath:pag",monochrome = true, dryRun = false,
plugin={"html:target/cucumber-html-report","json:target/cucumber.json"})

public class AllTests {}
