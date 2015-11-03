/**
 * @author Michal Brewczak
 */
public class LogicTEst {
	public static void main(String[] args) {
		String propKey = "os.versiod";
		if (!"os.name".equals(propKey) && !"os.version".equals(propKey)) {  // getBasicEnvInfo has got them covered
			System.out.println("dupa");
		}
	}
}
