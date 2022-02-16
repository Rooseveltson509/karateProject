package report;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Report {
    /***
     */
    private final static Report INSTANCE = new Report();
    /***
     */
    private List<String> jsonFiles = new ArrayList<>();
    /***
     */
    private File target = new File("target");

    private Report(){ }

    public void setJsonFiles(String file){
        jsonFiles.add(target.toPath().normalize().resolve("surefire-reports/"+file.replace(".karate-json.txt",".json")).toString());
    }

    public void build(){
        Configuration configuration = new Configuration(target, "demo karate");
        new ReportBuilder(jsonFiles, configuration).generateReports();
    }
    /***
     * @return Report
     */
    public static Report getInstance(){ return INSTANCE; }
}