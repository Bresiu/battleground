import java.util.ArrayList;
import java.util.List;

/**
 * @author Michal Brewczak
 */
public class Array {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list);
		list.add(0, "0");
		System.out.println(list);
	}
}
