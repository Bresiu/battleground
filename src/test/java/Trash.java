/**
 * @author Michal Brewczak
 */
public class Trash {
	public static void main(String[] args) {
		// .*[a-zA-Z]+.*
		// .*\d+.*
		String password = "v09*!@#$%^&*()?><:|{}][]";
		// check for minimum 6 characters length
		if (password.length() < 6) {
			System.out.println("1");
		}
		// check for maximum 32 characters length
		if (password.length() > 32) {
			System.out.println("2");
		}
		// check for digit
		if (!password.matches(".*\\d+.*")) {
			System.out.println("3");
		}
		// check for letters
		if (!password.matches(".*[a-zA-Z]+.*")) {
			System.out.println("4");
		}
		// check for illegal characters
		if (!password.matches("^[!-~]+$")) {
			System.out.println("5");
		}
	}
}
