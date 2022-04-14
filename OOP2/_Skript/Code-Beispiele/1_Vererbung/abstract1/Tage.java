package abstract1;

public class Tage extends Zeit {
  private long tage;

  public Tage(long tage) {
    this.tage = tage;
  }

  public long getMinuten() {
    return tage * 24 * 60;
  }
}
