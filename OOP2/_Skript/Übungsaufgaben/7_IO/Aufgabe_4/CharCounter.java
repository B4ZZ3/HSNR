public class CharCounter {
    public static void main(String[] args) {
		String filePath = "file.txt";
        BufferedReader reader = null;
		
		int charCount = 0;
		int wordCount = 0;
		
		try {
			reader = new BufferedReader(new FileReader(filePath));
			
			String currentLine = reader.readLine();
			
			while (currentLine != null)
			{
				String[] words = currentLine.split(" ");

				wordCount = wordCount + words.length;

				for (String word : words) {
					charCount = charCount + word.length();
				}
				currentLine = reader.readLine();
			}
			
			System.out.println("Anzahl Zeichen: " + charCount);
			System.out.println("Anzahl Woerter: " + wordCount);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	
}
