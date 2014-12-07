
import static org.junit.Assert.assertEquals;

import java.io.*;

import org.junit.Before;
import org.junit.Test;

public class WordCountTest {

	@Test
	public void shouldCountWords(){
		String TEST_CONTENT = "Neque porro quisquam est qui dolorem\n"
	            + " ipsum quia dolor sit amet, consectetur, adipisci velit...";

	    WordCounter wordCounter;
	    wordCounter = new WordCounter();
	 
	    assertEquals(14, wordCounter.getWordCount(new BufferedReader(new StringReader(TEST_CONTENT))));
	}
	
}
