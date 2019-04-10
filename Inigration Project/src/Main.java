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

	 //System Objects
	  Scanner in = new Scanner(System.in);
	  Random rand = new Random();
	  //Enemy enemy0 = new Enemy(100,25);
	  Enemy enemy1 = new Rusher(100,50);
	  Enemy enemy2 = new Leader(100,30);
	  Enemy enemy3 = new Assault(100,30);
	 
	 //Game Variables
	  // Array
	  Enemy[] enemies = {enemy1, enemy2, enemy3};
	  
	 
	  
	  
		 //Rusher Stats
	  //Integer is a primitive data-type
	  int maxRusherHealth = 50;
	  int maxRusherDamage = 50;
	  //Leader Stats
	  int maxLeaderHealth = 100;
	  int maxLeaderDamage = 20;
	  //Assault Stats
	  int maxAssaulttHealth = 75;
	  int maxAssaultDamage = 25;
	  
	  //Player Variables
	   int health = 100; //Staring health
	   int shield = 75; //Starting shield
	   int shieldRegenAmount = 30;
	   int shieldDropChange = 40; //Percentage
	   int damage = 100; 
	   int ammo = 18; //Starting ammo amount
	   
	   boolean running = true;
	   
	//Greeting to user
	// The String Class is a sequence of letters
    System.out.println("Welcome to The Dividing!!!");
    while(running ) {
    	System.out.println("---------------------------------------------------");
    	//Generating Enemy Stats
    	//int rusherHealth = rand.nextInt(maxRusherHealth);
    	//int leaderHealth = rand.nextInt(maxLeaderHealth);
    	//int assaultHealth = rand.nextInt(maxAssaultDamage);
    	
    	//Enemy Damage Stats
    	//String enemy = enemies[rand.nextInt(enemies.length)];
    	int indexOfRandomEnemy = rand.nextInt(enemies.length);
    	int enemyHealth = 100;
    	System.out.println("\t*An " + enemies[indexOfRandomEnemy].getClass() + " enemy has appeared!*\n");
    	while(enemies[indexOfRandomEnemy].getHealth() >= 0) {
    		
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
    			else {
    				health -= damageTaken;
    			}
    			//Damage Done
    			int damageDone = rand.nextInt(damage);
    			enemies[indexOfRandomEnemy].setHealth(enemyHealth - damageDone);
    			enemyHealth = enemies[indexOfRandomEnemy].getHealth();
    			break;
    		case "3":
    			System.out.println("Wait a second chief");
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
    

    
    //String myName;
    //myName.getName
    // Double value set as Final Variable and cannot be reassigned.
    final double GPA = 3.5;
    //boolean holds true, or false Values
    boolean systemValidation = true;
    
    
   
    // Randomly generates test cases
	Random test = new Random();
	int n1 = test.nextInt(), n2 = test.nextInt(), maximum;
    // dot operator is used to call method from another class
   maximum =  characterSelection.max(n1,n2); 
    //Value stored in variable
    System.out.println("Test Case: " + maximum);
    
    /* A Variable in java is a piece of memory that can contain a data value. 
     * 
     * A Scope in java is an instance of a variable or refers to the section of code where a
     * variable can be accessed.
     */

    // I learned how to us JOptionPane from Oracle
    // Answer to question should be "Yes" or "No"
    String humanVerification = JOptionPane.showInputDialog("Are you a human?");
    // DOB format must be, MM/DD/YYYY
    String dateOfBirth = (String) JOptionPane.showInputDialog(null, "Date of Birth", "Dialog Title",
        2, null, null, "MM/DD/YYYY");
    // Must select one of two options from drop down
    String[] acceptableValues = {"Male", "Female"};
    String input2 = (String) JOptionPane.showInputDialog(null, "Gender", "Dialog Title", 2, null,
        acceptableValues, acceptableValues[1]);
    
    
    //Character myCharacter = new Character();
    
    

  
    // String concatenation
    //System.out.println("My name is " + myName);
    System.out.print("Age: ");
   /* This makes it so that you may or may not get the age you were assigned on line 21
      Value is directly being called from characterSelection class*/
  //  System.out.println(characterSelection.max(rand_int1, myAge));
    System.out.println("My GPA is " + GPA);
    System.out.print("Are you a human?: ");
    System.out.println(humanVerification);
    System.out.println("DOB: " + dateOfBirth);
    System.out.println(input2);
    // Escape sequence pushes systemValidation to new line 
    System.out.println("Statement returns: \n" + systemValidation);
    

  }

}
