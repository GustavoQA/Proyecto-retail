package support;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  // @RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/login.feature", // ruta del feature
        tags = "@caso",
        glue = "definitions",
        plugin ={"html:target/cucumber-report/reporte_html.html","json:target/cucumber-report/reporte_cucumber.json"})




public class runtestcucumber {



}
