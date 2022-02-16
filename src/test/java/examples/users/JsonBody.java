package examples.users;

import net.minidev.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonBody {
    public static JSONObject writeNotepad(String createdAt, String name, String id, String jobName){
        //Creating a JSONObject object
        JSONObject jsonObject = new JSONObject();
        //Inserting key-value pairs into the json object
        jsonObject.put("createdAt", createdAt);
        jsonObject.put("name", name);
        jsonObject.put("id", id);
        jsonObject.put("job", jobName);
        try {
            FileWriter file = new FileWriter("src/test/java/examples/users/output.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);
        System.out.println("=========================================");
        System.out.println(name + " - " + jobName);
        return jsonObject;
    }

}
