package war;

public class Card {
  
  private String name;
  private int value;
  
  
  public Card(int rank, String suit) {
    value = rank;
    
    
    switch(rank) {
      case 2: name = "2";
      break;
      case 3: name = "3";
      break;
      case 4: name = "4";
      break;
      case 5: name = "5";
      break;
      case 6: name = "6";
      break;
      case 7: name = "7";
      break;
      case 8: name = "8";
      break;
      case 9: name = "9";
      break;
      case 10: name = "10";
      break;
      case 11: name = "Jack";
      break;
      case 12: name = "Queen";
      break;
      case 13: name = "King";
      break;
      case 14: name = "Ace";
      break;
    }
    
    name+= " of " + suit;
    
  }
  

  
  public int getValue() {
    return value;
  }
  
  public void setValue(int value) {
    this.value=value;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name=name;
  }
  

 
  
  public void describe() {

    System.out.println(this.getName());

  }

  
  
}