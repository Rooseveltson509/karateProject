package examples;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import hook.Hooks;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import report.Report;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RunAllTest {


    @Test
    void testParallel() {
        Results results = Runner.path("classpath:examples/")
                .hook(Hooks.getInstance())
                .reportDir("target/surefire-reports")
                .outputCucumberJson(true)
                //.reportDir("target/surefire-reports")
                .parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }
    /*Generate cucumber reporting*/
    @AfterAll
    public static void makeReporting(){
        Report.getInstance().build();
    }

}
