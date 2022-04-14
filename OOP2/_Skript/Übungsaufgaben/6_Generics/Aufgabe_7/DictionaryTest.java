
public class DictionaryTest {

    public static void main(String[] args) {
        WortBuch<String, String> dict = new WortBuch<>();

        dict.add("Hallo", "Hello");
        dict.add("Neu", "New");
        dict.add("Banane", "Banana");

        dict.print();

        dict.translateDE("Hallo");

        dict.sort();
    }

}
