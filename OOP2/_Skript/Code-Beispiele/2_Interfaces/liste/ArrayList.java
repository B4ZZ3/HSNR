package liste;

public class ArrayList implements List {
  private int[] liste = new int[100];
  private int pegel = 0;

  public ArrayList() { }

  public void insertLast(int wert) {
    liste[pegel] = wert;
    pegel++;
  }

  public int getFirst() {
    return liste[0];
  }

  public void deleteFirst() {
    for (int i = 0; i < pegel; i++) {
      liste[i] = liste[i + 1];
      pegel--;
    }
  }

  public boolean isEmpty() {
    if (pegel == 0) {
      return true;
    }
    else {
      return false;
    }
  }

  public boolean search(int val) {
    for (int i = 0; i < pegel; i++) {
      if (val == liste[i]) {
        return true;
      }
    }
    return false;
  }
}
