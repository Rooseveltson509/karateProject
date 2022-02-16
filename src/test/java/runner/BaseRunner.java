package runner;

import org.junit.jupiter.api.AfterAll;
import report.Report;

public class BaseRunner {
    /*Generate cucumber reporting*/
    @AfterAll
    public static void makeReporting(){
        Report.getInstance().build();
    }
}
