/**
 * @author ry6d3
 *
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/htosecservices")
public class CtoFService {
	@GET
	@Produces("application/xml")
	public String convertCtoF() {
 
		Double sec;
		Double hrs = 18.0;
		sec = hrs*60*60;
 
		String result = "@Produces(\"application/xml\") Output: \n\nhrs to seconds Converter Output: \n\n" + sec;
		return "<htosecservice>" + "<hrs>" + hrs + "</hrs>" + "<htosecoutput>" + result +  "</htosecoutput>" + "</htosecservice>";
		}
 
	
	
 
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("c") Double c) {
		Double fahrenheit;
		Double celsius = c;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
}