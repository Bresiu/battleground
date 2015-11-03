import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Michal Brewczak
 */
public class StringUtils {
	private static String jsonObjectStr = "{\"db051274-1cfd-4e0c-801f-1eda6b7c9733\":{\"logic\":\"points\",\"value\":7}," +
			"\"32e2206d-c723-44ff-a093-80a6690f84ea\":{\"logic\":\"points\",\"value\":12}," +
			"\"c0b9f9d3-0000-4201-bc6e-6d1be1da324e\":{\"logic\":\"points\",\"value\":23}}";

	public static void main(String[] args) {
		String formId = "form ID";
		System.out.println(jsonObjectStr);
		JSONObject jsonObject = new JSONObject(jsonObjectStr);

		JSONArray jsonArray = new JSONArray();
		for (int i = 0; i < jsonObject.names().length(); i++) {
			String key = jsonObject.names().getString(i);
			JSONObject values = jsonObject.getJSONObject(key);
			String logic = values.optString("logic");
			Integer value = values.optInt("value");
			JSONObject jsonForArray = new JSONObject();
			jsonForArray.put("formFieldId", formId);
			jsonForArray.put("UUID", key);
			jsonForArray.put("logic", logic);
			jsonForArray.put("value", value);

			jsonArray.put(jsonForArray);

			System.out.println("key = " + key + "; logic = " + logic + "; value = " + value);
		}
		System.out.println(jsonArray.toString());
	}
}