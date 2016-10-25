/**
 * @author ry6d3
 *
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;
 
@Path("/htosecservice")
public class FtoCService {
	@GET
	@Produces("application/xml")
	public String convertCtoF() {
 
		Double liters;
		Double gallons = 20.0;
		liters = gallons*3.785;
 
		String result = "@Produces(\"application/xml\") Output: \n\nGallons to Liters Converter Output: \n\n" + liters;
		return "<ctofservice>" + "<gallons>" + gallons + "</gallons>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
	
	  @Path("{f}")
	  @GET
	  @Produces("application/json")
	  public Response convertFtoCfromInput(@PathParam("f") float f) throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		float celsius;
		celsius =  (f - 32)*5/9; 
		jsonObject.put("F Value", f); 
		jsonObject.put("C Value", celsius);
 
		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
}