import java.util.List;

import static java.util.Arrays.asList;

public class StringExamples {

	public static void main(String[] args) {

		String ex1 = "gilbert";
		String ex2 = "  gooby";
		String ex3 = "scooby  ";
		String ex4 = "Scooblet";

		processString(ex1);
		System.out.println("\n-------------------------\n");
		processString(ex2);
		System.out.println("\n-------------------------\n");
		processString(ex3);
		System.out.println("\n-------------------------\n");
		processString(ex4);

	}

	private static void processString(String ex1) {
		ex1 = ex1.trim().toUpperCase(); //remove whitespace and make all uppercase
		System.out.println(ex1); //print the modified string
		System.out.println(ex1.length()); //print the length

		int amtOfVowels = 0;
		List<Character> vowels = asList('A', 'E', 'I', 'O', 'U', 'Y');
		for (int i = 0; i < ex1.length(); i++) {
			if (vowels.contains(ex1.charAt(i))) {
				amtOfVowels++;
			}
		}

		System.out.println(amtOfVowels); //print the number of vowels
	}
}
