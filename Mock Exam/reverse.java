 public class ReverseString {
	public static void main(String[] args) {
 
		String name = "Ritesh";
   
			
			String reverse = " ";

			System.out.println("original name " + name);

			for (int i = 0; i <= name.length() - 1; i++) {
				reverse = name.charAt(i) + reverse;

			}
			System.out.println("reversed name" + " " + reverse);

		}
}