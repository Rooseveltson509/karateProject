package hook;

import com.intuit.karate.RuntimeHook;
import com.intuit.karate.core.FeatureRuntime;
import report.Report;

public class Hooks implements RuntimeHook {

    private final static Hooks INSTANCE = new Hooks();

    private Report report = Report.getInstance();

    protected Hooks(){ }

    @Override
    public void afterFeature(FeatureRuntime fr) {
        // set scenario filename for cucumberJSON
        report.setJsonFiles(fr.feature.getKarateJsonFileName());
    }

    public static Hooks getInstance(){ return INSTANCE; }
}
