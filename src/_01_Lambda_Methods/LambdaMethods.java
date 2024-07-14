package _01_Lambda_Methods;

import java.util.ArrayList;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.ElasticCharAppender;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)-> {
			StringBuilder bob = new StringBuilder();
			bob.append(s);
			System.out.println(bob.reverse().toString());
			
			
		}, "noah");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		
		
		
		printCustomMessage((noah)-> {
			
			StringBuilder bob = new StringBuilder(noah);
			for(int i = 0; i < bob.toString().length(); i+=2) {

				bob.setCharAt(i, Character.toUpperCase(bob.charAt(i)));
				
				
			}
			System.out.println(bob.toString());
			
			
		}, "bingus");
		
		
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((noah)-> {
			
			
			char[] letters = noah.toCharArray() ;
			
			String finalThing = "";
			
			for(int i = 0; i < letters.length; i++) {
				finalThing = finalThing + letters[i];
				finalThing = finalThing + ".";
				
				
			}
			
			StringBuilder bob = new StringBuilder(finalThing);
			
			//bob.delete(finalThing.length()-1, finalThing.length());
			//looks better with the period at the end
			
			System.out.println(bob.toString());
			
		}, "Once Upon a Noah");
		
		
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	printCustomMessage((noh)-> {
		
		StringBuilder bob = new StringBuilder(noh);
		
		
		for(int i = bob.length()-1; i >= 0 ; i--) {
			
			if(bob.charAt(i) == 'a' || bob.charAt(i) == 'e' ||bob.charAt(i) == 'i' ||bob.charAt(i) == 'o' ||bob.charAt(i) == 'u') {
				bob.deleteCharAt(i);
				
				
				
			}
		}
		System.out.println(bob.toString());
		
		
		
		
	}, "armani");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
