package net.mckinleyranch;

import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Test;

public class PigLatinServiceTest {

	@Test
	public void testEnglishToPigLatin() {
		
		PigLatinService testService = new PigLatinService();
		
		String testPhrase = testService.englishToPigLatin("this web service rocks");
		
		System.out.println("Test Phrase translation = " + testPhrase);
		
		assertTrue("FAIL: Translator not working correctly", testPhrase.contains("histay ebway ervicesay ocksray"));
		
	}

}
