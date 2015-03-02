package net.mckinleyranch;

public class PigLatinTranslator {

	public static boolean isVowel(char c) {
		    switch (Character.toLowerCase(c)) {
		    case 'a':
		    case 'e':
		    case 'i':
		    case 'o':
		    case 'u':
		    case 'y':
		      return true;
		    }
		    return false;
		  }

		  public static String makePigLatin(String word) {
		    char firstLetter = word.charAt(0);
		    String everythingElse = word.substring(1);

		    String n = everythingElse + firstLetter;

		    if (isVowel(firstLetter)) {
		      return n + "way";
		    }
		    return n + "ay";
		  }


}
