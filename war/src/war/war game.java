package war;


public class App {

    public static void main(String[] args) {

      
      
      Deck deck = new Deck();
      System.out.println();
      
      deck.shuffle();
      
      Player playerOne = new Player("Player1", 0);
      playerOne.draw(deck);
      
      Player playerTwo = new Player("Player2", 0);
      playerTwo.draw(deck);
      
      
      
      for (int i =2; i<26; i++) {
        Card playerOneCard = playerOne.flip();
        Card playerTwoCard = playerTwo.flip();
        
        
        
      
          
            System.out.println("====== Start of Round ======= ");
           
            
            
            if (playerOneCard.getValue() > playerTwoCard.getValue()) {
              
              playerOne.describeName(); playerOneCard.describe();
              playerTwo.describeName(); playerTwoCard.describe();
              playerOne.incrementScore();
              System.out.println("Player 1 Wins!");
              playerOne.describe();
              playerTwo.describe();
              
              
            } else if(playerOneCard.getValue() < playerTwoCard.getValue()) {
            //  System.out.println("---new round");

              playerOne.describeName(); playerOneCard.describe(); 
              playerTwo.describeName(); playerTwoCard.describe();
              playerTwo.incrementScore();
              System.out.println("Player 2 Wins!");
              playerOne.describe();
              playerTwo.describe();
             
              
            } else if(playerOneCard.getValue() == playerTwoCard.getValue()) {
             // System.out.print("---new round");
              
              playerOne.describeName(); playerOneCard.describe();
              playerTwo.describeName(); playerTwoCard.describe();
              System.out.println("Tie");
              playerOne.describe();
              playerTwo.describe();
         
            }
            
            System.out.println("====== End of Round ========= \n");
        
           
        }
        
      if(playerOne.getScore()>playerTwo.getScore()) {
        System.out.println("Player One wins the game!");
      } else if(playerTwo.getScore()>playerOne.getScore()){
        System.out.println("Player Two wins the game!! ");
      }else {
        System.out.println("The game was tied.");
      }
        
        
    }
    
    
    
  
    }

  


