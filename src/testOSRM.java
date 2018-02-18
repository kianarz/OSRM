
import org.json.JSONException;
import org.json.JSONObject;
import static org.junit.Assert.assertEquals; 

import OSRM.Route;

import java.net.URI;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;

public class testOSRM {

	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub
		Route rt = new Route(); 
		JSONObject routingDefault = rt.getFastestRoute("-77.010186,38.879527;-77.017418,38.879141");
		/*try {
			assertEquals("Ok", routingDefault.get("code"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//System.out.println(routingDefault.get("routes").getClass());

	}

}
