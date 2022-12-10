package war;

import java.util.ArrayList;
import java.util.stream.Collectors;

@SuppressWarnings("serial")
public class Hand extends ArrayList<Card> {
  @Override
  public String toString() {
    
    String lf = System.lineSeparator();
    return this.stream().map(Card::toString).collect(Collectors.joining(lf));
    
  
  }

}
