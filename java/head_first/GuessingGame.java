class GuessGame{
	Player p1; // Has three instance variable for 3 Player objects
	Player p2;
	Player p3;
	
	public void startGame(){
		
		/* Create three player objects and assign them to 3 Player instance variable */
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		/* Declare three variables to hold the three guesses the Player make */	
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		/* Declare three variables to hold the true or false based on the player's answer*/
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		/* Make a target number that the players have to guess */
		int targetNumber = (int) (Math.random() * 10);

		while(true){
			System.out.println("Number to guess is " + targetNumber);
			
			/* call each player's guess() method */
			p1.guess();
			p2.guess();
			p3.guess();
			
			/* get each player's guess by accessing the number variable of each player */
			guessp1 = p1.number;
			System.out.println("Player one guesed " + guessp1);

			guessp2 = p2.number;
                        System.out.println("Player two guesed " + guessp2);

			guessp3 = p3.number;
                        System.out.println("Player three guesed " + guessp3);	
			
			/*check each player's guess, if it matches the target number then set that player's variable to be true*/
			if(guessp1 == targetNumber){
				p1isRight = true;
			}
			
			if(guessp2 == targetNumber){
                                p2isRight = true;
                        }

			if(guessp3 == targetNumber){
                                p3isRight = true;
                        }

			if(p1isRight || p2isRight || p3isRight){
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				break;
			} else {
				System.out.println("Players will have to try again.");
			}	
		}
		
	}
}


class Player{
	int number = 0;
	
	public void guess(){
		number = (int) (Math.random() * 10);
		System.out.println("I'm Guessing " + number);
	}
}

class GameLauncher{
	public static void main(String[] args){
		GuessGame game = new GuessGame();
		game.startGame();
	}
}
