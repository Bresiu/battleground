import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Michal Brewczak
 */
public class StringMatcher {
	public static void main(String[] args) {
		String packageId = "pl.sknerus.sknerusapp.devStore";

		String mydata = ":Sending Touch (ACTION_UP): 0:(499.3534,386.36838)\n" +
				"// NOT RESPONDING _package_ (pid 0)\n" +
				"// Short Msg: java.lang.NullPointerException\n" +
				"// CRASH: pl.sknerus.sknerusapp.devStore (pid 10352)\n";

		Matcher matcher = Pattern.compile("// (CRASH|NOT RESPONDING): (.*?) \\(pid (\\d+)\\)").matcher(mydata);
		if (matcher.find()) {
			String reason = matcher.group(1);
			System.out.println("0 " + matcher.group(0));
			System.out.println("1 " + matcher.group(1));
			System.out.println("2 " + matcher.group(2));
			System.out.println("3 " + matcher.group(3));

			if ("CRASH".equals(reason)) {
				if (!matcher.group(2).equals(packageId)) {
					String line = matcher.group();
					line = line.replaceFirst("CRASH", "OUTSIDE PACKAGE CLICK, IGNORING ERROR");
					mydata = mydata.replaceFirst(matcher.group(), line);
				} else {
					//result = MonkeyResult.Crash;
				}
			} else if ("NOT RESPONDING".equals(reason)) {
				//result = MonkeyResult.AppNotResponding;
			}
		}
		System.out.println(mydata);

	}
}
