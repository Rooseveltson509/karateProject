package examples.getMethod;

import com.intuit.karate.junit5.Karate;
import hook.Hooks;
import runner.BaseRunner;

public class GetDatas extends BaseRunner {
    @Karate.Test
    Karate testUsers() {
        return Karate.run("classpath:examples/getMethod")
                .hook(Hooks.getInstance())
                .reportDir("target/surefire-reports")
                .outputCucumberJson(true)
                .relativeTo(getClass());
    }
}
