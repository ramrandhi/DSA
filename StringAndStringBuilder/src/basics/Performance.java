package basics;

public class Performance {

	public static void main(String[] args) {
		StringBuilder series = new StringBuilder(); 
		// Insted of using string here we can use StringBuilder as it is mutable and did not create new object when data is manipulated
		for (int i = 0; i < 26; i++) {
			char ch = (char)('a'+i); 
			//adding integer to  a character in java results in integer and (char) will cast and again convert to integer
			series = series.append(ch).append(" ");
			
		}
		System.out.println(series);
	}

}
