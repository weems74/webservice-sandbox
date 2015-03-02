package net.mckinleyranch;

import java.util.ArrayList;

public class PigLatinService {

	public String englishToPigLatin(String englishSentence) {

		System.out.println("input sentence: " + englishSentence);

		//ArrayList <String> pigLatinSentenceWords = new ArrayList<String>();

		
		String[] englishWords = englishSentence.split(" ");    
		String pigLatinSentence = "";
		
		for ( String word: englishWords){
			System.out.println("Word: " + word + "\r");
		}
		
		
		 for ( String inputWord : englishWords) {

		       System.out.println("English word:" + inputWord);
		       String pigLatinTranslation = PigLatinTranslator.makePigLatin(inputWord);
		       System.out.println("Translation for word is:" + pigLatinTranslation);
		       //pigLatinSentenceWords.add(pigLatinTranslation + " ");
		      // System.out.println("PigLatinSentence: " + pigLatinSentenceWords);
		       pigLatinSentence += pigLatinTranslation + " ";
		  }
		
		return pigLatinSentence;
	 
	}
	
}
