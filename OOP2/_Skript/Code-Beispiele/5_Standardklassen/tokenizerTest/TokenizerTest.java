package tokenizerTest;

import java.util.StringTokenizer;

public class TokenizerTest {

	public static void main(String[] args) { 
		String text = "Ich weiß nicht, was soll es bedeuten."; 
		StringTokenizer st = new StringTokenizer(text, " ,."); 
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken()); }
	}
}

