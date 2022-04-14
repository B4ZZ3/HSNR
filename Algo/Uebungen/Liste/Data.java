package Liste;

public class Data {
    private Data next;
    private int key;
    private String value;
    
    public Data(int key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public Data getNext() {
        return next;
    }

    public void setNext(Data next) {
        this.next = next;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
