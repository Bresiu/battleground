import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Michal Brewczak
 */
public class TESTIFY {
	public static String replaceGroup(String regex, String source, int groupToReplace, String replacement) {
		return replaceGroup(regex, source, groupToReplace, 1, replacement);
	}

	public static String replaceGroup(String regex, String source, int groupToReplace, int groupOccurrence, String replacement) {
		Matcher m = Pattern.compile(regex).matcher(source);
		for (int i = 0; i < groupOccurrence; i++)
			if (!m.find()) return source; // pattern not met, may also throw an exception here
		return new StringBuilder(source).replace(m.start(groupToReplace), m.end(groupToReplace), replacement).toString();
	}

	public static void main(String[] args) {
		// replace with "%" what was matched by group 1
		// input: aaa123ccc
		// output: %123ccc
		System.out.println(replaceGroup("// CRASH: (.*?) \\(pid (\\d+)\\)", ":Sending Touch (ACTION_UP): 0:(499.3534,386.36838)\n" +
				"// CRASH: pl.sknerus.sknerusapp.devStore (pid 10352)\n" +
				"// Short Msg: java.lang.NullPointerException\n" +
				"// CRASH: pl.sknerus.sknerusapp.devStore (pid 10352)\n", 0, "OUTSIDE PACKAGE CLICK"));

		// replace with "!!!" what was matched the 4th time by the group 2
		// input: a1b2c3d4e5
		// output: a1b2c3d!!!e5
		//System.out.println(replaceGroup("([a-z])(\\d)", "a1b2c3d4e5", 2, 4, "!!!"));

	}
}