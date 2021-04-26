package support;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)  // @RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"pretty"},
        glue = "definitions",
        features = "src/test/resources/features", // ruta del feature
        tags = "@caso"

        )

 /*E:\Iniciarsesion\src\test\resources\features*/
public class runtest_serenity {



}