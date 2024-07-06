package basics;

public class OsType {
	public static void main(String [] args) {
		String osName = System.getProperty("os.name").toLowerCase();
		if(osName.contains("win")) {
			System.out.println("windows system");
		} else {
			System.out.println("othe system");
		}
		
	}
}
