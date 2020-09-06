package Cucumber.frame.api.generic;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Extract_json 
{
	public static JSONObject extract_single_json(String path) 
	{
		JSONParser js = new JSONParser();
		Object jp = null;
		try {
			jp = js.parse(new FileReader(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		JSONObject a1 = (JSONObject)jp;
		return a1;
	}
	
	public static JSONArray nest_json(String path)
	{
		JSONParser js = new JSONParser();
		Object jp = null;
		try {
			jp = js.parse(new FileReader(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		JSONObject a1 = (JSONObject)jp;
		JSONArray a2 = (JSONArray)a1.get("testData");
		return a2;
	}
}
