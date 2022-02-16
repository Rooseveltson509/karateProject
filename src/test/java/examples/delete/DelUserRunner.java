package examples.delete;

import com.intuit.karate.junit5.Karate;
import hook.Hooks;
import runner.BaseRunner;

public class DelUserRunner extends BaseRunner {
    @Karate.Test
    Karate testUsers() {
        return Karate.run("classpath:examples/delete")
                .hook(Hooks.getInstance())
                .reportDir("target/surefire-reports")
                .outputCucumberJson(true)
                .relativeTo(getClass());
    }
}
