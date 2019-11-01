package Utils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;

import java.util.ArrayList;



/**
 * Created by obaskirt on 22-Jan-18.
 */
public class TestUtils {

    //Verify the http response status returned. Check Status Code is 200?
    public void checkStatusIs200 (Response res) {
        Assert.assertEquals(res.getStatusCode(),200, "Status Check Failed!");
    }

    //Get Clients
    public ArrayList getClients (JsonPath jp) {
        ArrayList clientList = jp.get();
        return clientList;
    }
}
