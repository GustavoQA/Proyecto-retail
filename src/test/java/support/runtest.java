package support;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\Iniciarsesion\\src\\test\\resources\\features",
tags = "@casos",
glue = "definitions",
plugin ={"html:target/cucumber-report/reporte_html.html","json:target/cucumber-report/reporte_cucumber.json"})


public class runtest {



}
