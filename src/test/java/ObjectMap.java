import java.util.ArrayList;

/**
 * @author Michal Brewczak
 */
public class ObjectMap {

	public static void main(String[] args) {
		ArrayList<Object> objectList = new ArrayList<>();
		objectList.add("test");

		ArrayList<String> anotherList = new ArrayList<>();
		anotherList.add("test1");
		anotherList.add("test2");
		objectList.add(anotherList);

		System.out.println(objectList);

		((ArrayList) objectList.get(1)).add("test3");

		System.out.println(objectList);
	}
}
