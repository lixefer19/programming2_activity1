package activity1;

public class containsdigit {
public static void main(String[] args){
		String str = "654387653";
		boolean result = str.matches("[0-9]+");
		System.out.println("Original String : " + str);
		System.out.println("Does string contain only Digits? : " + result);
	}
}

