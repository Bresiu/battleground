import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * @author Michal Brewczak
 */
public class Joda {
	public static void main(String[] args) {
		System.out.println("<?xml version=\"1.0\"?><EMAILS><EMAIL VALUE=\"mariusz.szostak@dreamlab.pl\" MAIN=\"T\" /></EMAILS>");
		System.out.println(getIs18Xml(true));
	}

	public static String getIs18Xml(boolean isOver18) {
		DateTime dateTime = DateTime.now();
		DateTimeFormatter fmt = DateTimeFormat.forPattern("YYYY-MM-dd HH:mm:ss");
		String serverDate = dateTime.toString(fmt);
		String value;
		if (isOver18) {
			value = "Y";
		} else {
			value = "N";
		}
		return "<?xml version=\"1.0\"?> <AGREEMENTS> <AGREEM ID=\"" + "1" + "\" DATE=\"" + serverDate + "\" VALUE=\""
				+ value + "\"/> </AGREEMENTS>";
	}
}
