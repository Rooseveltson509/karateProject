package examples.users;

import com.intuit.karate.junit5.Karate;
import hook.Hooks;
import runner.BaseRunner;

class UsersRunner extends BaseRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("classpath:examples/users")
                .hook(Hooks.getInstance())
                .reportDir("target/surefire-reports")
                .outputCucumberJson(true)
                .relativeTo(getClass());
    }

}
