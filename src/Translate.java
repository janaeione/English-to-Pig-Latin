
//	package wordMan;

import java.util.Scanner;

public class Translate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Translate from English to Pig Latin\n");

		System.out.println("Enter a Word to be translate to Piglation.");
		String word = sc.nextLine();
		String con = sc.nextLine();
		String input = sc.nextLine();

		if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o")
				|| word.startsWith("u")) {
			System.out.println(word + "way");
			String lower = input.toLowerCase();

		}
		if (word.startsWith("b") || word.startsWith("c") || word.startsWith("d") || word.startsWith("f")
				|| word.startsWith("g") || word.startsWith("h") || word.startsWith("j") || word.startsWith("k")
				|| word.startsWith("l") || word.startsWith("m") || word.startsWith("n") || word.startsWith("w")
				|| word.startsWith("p") || word.startsWith("q") || word.startsWith("r") || word.startsWith("s")
				|| word.startsWith("t") || word.startsWith("u") || word.startsWith("v") || word.startsWith("x")
				|| word.startsWith("y") || word.startsWith("z"))
			;
		System.out.println(word + "ay");

	}
}
