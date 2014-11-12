package getprofiledetails;

import java.util.ArrayList;
import java.util.List;
//import org.lightcouch.CouchDbClient;
//import org.lightcouch.CouchDbProperties;
//import com.google.gson.JsonObject;
import org.json.JSONObject;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import twitter4j.conf.ConfigurationBuilder;
import java.util.List;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
@WebServlet("/getprofiledetails")
public class Getprofiledetails extends HttpServlet {
private static final long serialVersionUID = 1L;

/** client max connections */
final int MAX_CONNECTIONS = 20;
ArrayList<String> keyslist = new
ArrayList<String>();
ArrayList<String> valueslist = new
ArrayList<String>();


//}
public Getprofiledetails() {
super();
}
/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
@SuppressWarnings("unchecked")
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
JSONObject temp = new JSONObject();
PrintWriter out = response.getWriter();

ConfigurationBuilder cb = new ConfigurationBuilder()
.setDebugEnabled(true)
.setOAuthConsumerKey("rzp80uWHTZcyo9Mn8DxWRwcvy")
.setOAuthConsumerSecret("v9EYNQgjlbLJsqvLirO7sGaoiHT5TUHT4JVzdnhuAnE8xhE8Ay")
.setOAuthAccessToken("2478160448-lLHVHjPLHPbhYDq0xFW8pwmdgQtttg7a6UgSTe7")
.setOAuthAccessTokenSecret("TZxAVtQIOrwAQhQNhg0TOV6QIv3RtmWxmqd7aI3TRW6hL");
cb.setJSONStoreEnabled(true);
	Twitter twitter = new TwitterFactory(cb.build()).getInstance();

//String viewname = request.getParameter("viewname");
//String viewname = request.getParameter("anu");
//fetchView(viewname);
//for (int i=0; i< keyslist.size(); i++)
//{
//System.out.print(keyslist.get(i));
//System.out.print(" - ");
//System.out.println(valueslist.get(i));
//}
temp.put("keylist", "123");
temp.put("valuelist", "1");
temp.put("result", "succhelloess");
out.print(temp);
}
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
}
}
