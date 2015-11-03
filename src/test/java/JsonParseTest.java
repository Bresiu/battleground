import org.json.JSONObject;

/**
 * @author Michal Brewczak
 */
public class JsonParseTest {
	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject("{  \n" +
				"   \"38b51519-0dae-49ef-90c5-72d50e0648a8\":{  \n" +
				"      \"logic\":\"points\",\n" +
				"      \"value\":1\n" +
				"   },\n" +
				"   \"faaa22bb-da88-4af7-99ba-50b8aa661154\":{  \n" +
				"      \"logic\":\"points\",\n" +
				"      \"value\":0\n" +
				"   },\n" +
				"   \"fd5e7cc6-7a13-4f4f-b386-068b1b427ec3\":{  \n" +
				"      \"logic\":\"points\",\n" +
				"      \"value\":-1\n" +
				"   }\n" +
				"}");
		for (int i = 0; i < jsonObject.names().length(); i++) {
			System.out.println("key = " + jsonObject.names().getString(i) + " value = " + jsonObject.get(jsonObject.names().getString(i)));
		}
	}
}
