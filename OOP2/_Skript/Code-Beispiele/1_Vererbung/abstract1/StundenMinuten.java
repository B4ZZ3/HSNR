package abstract1;

public class StundenMinuten extends Zeit {
  private long stunden;
  private long minuten;
  
  public StundenMinuten(long stunden, long minuten) {
    this.stunden = stunden;
    this.minuten = minuten;
  }

  public long getMinuten() {
    return stunden * 60 + minuten;
  }
}
