import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Michal Brewczak
 */
public class LogCleaner {
	private static final String pathToSources = "/Users/Bresiu/Desktop/";
	private static final String filename = "white_screen_good_path.txt";

	public static void main(String[] args) throws IOException {
		String wholePath = pathToSources + filename;
		System.out.println(wholePath);
		try (BufferedReader br = new BufferedReader(new FileReader(wholePath))) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine().substring(65);
				System.out.println(line);
			}
			//String everything = sb.toString();
		}
	}
}
