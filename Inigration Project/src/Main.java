import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

// John Makar
/*
 * A program integrating skills learned in COP 2006 This program is a text-based RPG game inspired by, Tom Clancy's The Division 2
 * Game Alpha 0.01
 */
public class Main {

  public static void main(String[] args) {
	  
	  //Rusher Stats
	  int maxRusherHealth = 50;
	  int maxRusherDamage = 50;
	  //Leader Stats
	  int maxLeaderHealth = 100;
	  int maxLeaderDamage = 20;
	  //Assault Stats
	  int maxAssaulttHealth = 75;
	  int maxAssaultDamage = 25;
	  
	 //System Objects
	  Scanner in = new Scanner(System.in);
	  Random rand = new Random();
	  Enemy enemy1 = new Rusher(100,rand.nextInt(maxRusherDamage));
	  Enemy enemy2 = new Leader(100,rand.nextInt(maxLeaderDamage));
	  Enemy enemy3 = new Assault(100,rand.nextInt(maxAssaultDamage));
	 
	 //Game Variables
	  // Array
	  Enemy[] enemies = {enemy1, enemy2, enemy3};
	  
	  //Player Variables
	   int health = 100; //Staring health
	   int shield = 75; //Starting shield
	   int healthRegenAmount = 10;
	   int shieldDropChange = 40; //Percentage
	   int damage = 100; 
	   int ammo = 18; //Starting ammo amount
	   
	   /////////////////////////////  Beginning of Game  ////////////////
		  System.out.println("Welcome to The Dividing!!!");
		  System.out.println("------------------------------------------");
		  System.out.println("Do you want to create a character? Y/N");
		  String answer = in.nextLine();
		  switch(answer) {
		  case"Y":
			// I learned how to us JOptionPane from Oracle
			    // Answer to question should be "Yes" or "No"
			    String CustomName = JOptionPane.showInputDialog("What is your name?");
			    Character.setName(CustomName);
			    //Gender Selection, Must select one of two options from drop down
			    String[] acceptableValues = {"Male", "Female"};
			    String input2 = (String) JOptionPane.showInputDialog(null, "Gender", "Dialog Title", 2, null,
			        acceptableValues, acceptableValues[1]);
			    Character.setGender(input2);
			    // DOB format must be, MM/DD/YYYY
			    String dateOfBirth = (String) JOptionPane.showInputDialog(null, "Date of Birth", "Dialog Title",
			        2, null, null, "MM/DD/YYYY");
			    Character.setDOB(dateOfBirth);
			    //Starts Game
			    Character.setStartGame(true);

			  break;
		  case"N":
			  String DefaultName = "Stranger";
			  Character.setName(DefaultName);
			//Starts Game
			    Character.setStartGame(true);
			  break;
			  
			  default:
				  System.out.println("Respond with Y/N");
		  }
	   
	//Greeting to user
    System.out.println("Greatings " + Character.getName());
    while(Character.getStartGame()) {
    	System.out.println("---------------------------------------------------");
    	//Resetting Enemy Health
    	enemy1.setHealth(100);
    	enemy2.setHealth(100);
    	enemy3.setHealth(100);
    	//Enemy Damage Stats
    	//String enemy = enemies[rand.nextInt(enemies.length)];
    	int indexOfRandomEnemy = rand.nextInt(enemies.length);
    	int enemyHealth = 100;
    	System.out.println("\t*An " + enemies[indexOfRandomEnemy].getClass() + " enemy has appeared!*\n");
    	while(enemies[indexOfRandomEnemy].getHealth() >= 0){
    		
    		System.out.println("\tYour HP: " + health);
    		System.out.println("\tSheild: " + shield);
    		System.out.println("\t----------------");
    		System.out.println("\tEnemy's HP:" + enemies[indexOfRandomEnemy].getHealth());
    		System.out.println("\n\tWhat would you like to do?");
    		System.out.println("\t1. Take Cover!");
    		System.out.println("\t2. Fight");
    		System.out.println("\t3. Syringe");
    		
    		String input = in.nextLine();
    		
    		switch(input) {
    		case "1":
    			System.out.println("You are taking cover...\n");
    			System.out.println("---------------------------------------\n");
    			break;
    		case "2":
    			//Fighting Sequence
    			System.out.println("\t---------------------------------");
    			System.out.println("\tSquare Up!\n");
    			//Damage Taken
    			int damageTaken = enemies[indexOfRandomEnemy].getDamage();
    			if(shield > 0) {
    			shield -= damageTaken;	
    			if(shield < 0) {
    				shield = 0;
    			}
    			}
    			else{
    				health -= damageTaken;
    			}
//    			if(shield > 0) {
//    				shield-= damageTaken;
//    			}
//    			else {
//    				shield = 0;
//    				health -= damageTaken;
//    			}
    			
    			//Damage Done
    			int damageDone = rand.nextInt(damage);
    			enemies[indexOfRandomEnemy].setHealth(enemyHealth - damageDone);
    			enemyHealth = enemies[indexOfRandomEnemy].getHealth();
    			break;
    		case "3":
    			System.out.println("\t---------------------------------");
    			System.out.println("Wait a second chief\n*You have used a Syringe*");
    			health += healthRegenAmount;
    			if(health > 100){
    				System.out.println("\t---------------------------------");
    				System.out.println("You are supercharged!");
    			}
    			break;
    		default:
    			System.out.println("Nothing is happening");
    			break;
    		
    		}
    		
    	}
    }
    
   
    

    // The integer is a primitive data-type that is used to hold a numeric values
    double age = -18;
    //casting int age to double
    //Using Math absolute to get positive age value
    int myAge = (int) Math.abs(age);

  
  }

}
