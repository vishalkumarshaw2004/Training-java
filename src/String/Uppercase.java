package String;

public class Uppercase {
public static void main(String[] args) {


	        String str = "hello my name is vishal";
	        String[] words = str.split(" ");

	        String result = "";

	        for (String word : words) {
	            result += word.substring(0, 1).toUpperCase()
	                    + word.substring(1) + " ";
	        }

	        System.out.println(result.trim());
	    }
	

}

