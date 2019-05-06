import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * @author John Makar
 *
 */

/*
 * A program integrating skills learned in COP 2006 This program is a text-based RPG game inspired
 * by,Tom Clancy'sThe Division 2 Game Alpha 0.01
 */

// A variable is a container which holds the value while the java program is
// executed. A variable is assigned with a datatype.
// The scope refers to the section of code where a variable can be accessed.

// Boolean - Boolean data type is used for logical values such as true or false.
// Boolean is the type required by the conditional expressions used in control
// statements.
// Byte - An 8-bit signed two's complement integer. It has a minimum value of
// -128 and a maximum value of 127 (inclusive).
// Char - a single two-byte (16-bit) Unicode character. Short - An 16-bit signed
// two's complement integer. It has a minimum value of -32,768 and a maximum
// value of 32,767 (inclusive).
// Int - A 16-bit signed two's complement integer.
// Long - a 64-bit two's complement integer. The signed long has a minimum value
// of -263 and a maximum value of 263-1.
// Float - a single-precision 32-bit IEEE 754 floating point.
// Double - A double-precision 64-bit IEEE 754 floating point.

public class Main {


  /**
   * Main Method.
   * 
   * @throws IllegalArgumentException when num is negative.
   */
  public static void main(String[] args) {

    // Rusher Stats
    // int maxRusherHealth = 100;
    int maxRusherDamage = 50;
    // Leader Stats
    // int maxLeaderHealth = 100;
    int maxLeaderDamage = 20;
    // Assault Stats
    // int maxAssaulttHealth = 100;
    int maxAssaultDamage = 25;

    // System Objects
    Scanner in = new Scanner(System.in, "UTF-8");
    Random rand = new Random();
    Enemy enemy1 = new Rusher(100, rand.nextInt(maxRusherDamage));
    Enemy enemy2 = new Leader(100, rand.nextInt(maxLeaderDamage));
    Enemy enemy3 = new Assault(100, rand.nextInt(maxAssaultDamage));

    // Game Variables
    // Array
    Enemy[] enemies = {enemy1, enemy2, enemy3}; // 1D Array

    // Player Variables
    int health = 100; // Staring health
    int shield = 75; // Starting shield
    int healthRegenAmount = 10;
    // double shieldDropChange = 40.0; // Double used as a percentage
    final int DM = 75; // final variable cannot be reassigned a value
    // int ammo = 18; // Starting ammo amount

    ///////////////////////////// Beginning of Game ////////////////
    System.out.println("Welcome to The Dividing!!!");
    System.out.println("------------------------------------------");
    System.out.println("Do you want to create a character? Y/N");
    System.out.println("...or type \"/launch\"");
    String answer = in.nextLine();
    /*
     * @param answer input
     * 
     * @return executes code in case that was selected
     */
    switch (answer) {
      case "Y":
      case "y":
        // I learned how to us JOptionPane from Oracle
        // Answer to question should be "Yes" or "No"
        String customName = JOptionPane.showInputDialog("What is your name?");
        Character.setName(customName);
        // Gender Selection, Must select one of two options from drop
        // down
        String[] acceptableValues = {"Male", "Female"};
        String input2 = (String) JOptionPane.showInputDialog(null, "Gender", "Dialog Title", 2,
            null, acceptableValues, acceptableValues[1]);
        Character.setGender(input2);
        // DOB format must be, MM/DD/YYYY
        String dateOfBirth = (String) JOptionPane.showInputDialog(null, "Date of Birth",
            "Dialog Title", 2, null, null, "MM/DD/YYYY");
        Character.setDB(dateOfBirth);
        // Starts Game
        Character.setStartGame(true);

        break;
      case "N":
      case "n":
        String defaultName = "Stranger";
        Character.setName(defaultName);
        // Starts Game
        Character.setStartGame(true);
        break;

      case "/launch":
        Character.setLaunch(true);
        Character.setName("Commandor");
        break;
      default:
        System.out.println("Respond with Y/N");
        Character.setName("Rebel");
        Character.setStartGame(true);

    }
    // Greeting to user
    System.out.println("\n\tGreatings " + Character.getName() + "!");
    // Creates Kill Counter as ArrayList
    ArrayList<Integer> killCounter = new ArrayList<Integer>(); // creates
    // ArrayList
    /*
     * @param Character.getStartGame
     * 
     * @return boolean
     */
    while (Character.getStartGame()) { // Header & Parameter
      // Kill Counter
      // Sum of an Array
      final int n = 1;
      int total = 0;
      for (int i = 0; i < killCounter.size(); i++) {
        total = total + killCounter.get(i);
      }
      System.out.println("Kills: " + total);

      System.out.println("---------------------------------------------------");
      // Resetting Enemy Health
      enemy1.setHealth(100);
      enemy2.setHealth(100);
      enemy3.setHealth(100);
      // Enemy Damage Stats
      // String enemy = enemies[rand.nextInt(enemies.length)];
      int indexOfRandomEnemy = rand.nextInt(enemies.length);
      int enemyHealth = 100;
      System.out
          .println("\t*An " + enemies[indexOfRandomEnemy].getClass() + " enemy has appeared!*\n");
      while (enemies[indexOfRandomEnemy].getHealth() >= 0) {
        System.out.println("\tYour HP: " + health);
        if (health < 30) {
          System.out.println("*Your health is low, use \"3\" to heal*");
        }
        System.out.println("\tSheild: " + shield);
        System.out.println("\t----------------");
        System.out.println("\tEnemy's HP:" + enemies[indexOfRandomEnemy].getHealth());
        System.out.println("\n\tWhat would you like to do?");
        System.out.println("\t1. Take Cover!");
        System.out.println("\t2. Fight");
        System.out.println("\t3. Syringe");

        String input = in.nextLine();

        switch (input) {
          case "1":
            System.out.println("\t---------------------------------");
            System.out.println("\t*You are taking Cover*\n");
            break;
          case "2":
            // Fighting Sequence
            System.out.println("\t---------------------------------");
            System.out.println("\tSquare Up!\n");
            // Damage Taken
            int damageTaken = enemies[indexOfRandomEnemy].getDamage();
            /*
             * @param shield value more than zero
             * 
             * @return new value of shield assigned after damageTaken
             */
            if (shield > 0) {
              shield -= damageTaken;
              /*
               * @param shield value less than zero
               * 
               * @return make shield value zero
               */
              if (shield < 0) {
                shield = 0;
                continue; // if and when the shield has reached
                // 0, the damage will continue and
                // go to
                // affect the health
              }
            } else {
              health -= damageTaken;
            }
            // Damage Done
            int damageDone = rand.nextInt(DM);
            enemies[indexOfRandomEnemy].setHealth(enemyHealth - damageDone);
            enemyHealth = enemies[indexOfRandomEnemy].getHealth();
            break;
          case "3":
            System.out.println("\t---------------------------------");
            System.out.println("Wait a second chief\n*You have used a Syringe*");
            health += healthRegenAmount;
            if (health > 100) {
              System.out.println("\t---------------------------------");
              System.out.println("You are supercharged!");
            }
            break;
          case "/quit":
            Character.setStartGame(false);
            break;
          default:
            System.out.println("Nothing is happening");
            break;
        }
      }
      killCounter.add(n); // adds kill
    }
    /*
     * @param Character.getLaunch
     */
    while (Character.getLaunch()) {
      System.out.println("1. Lowest value in Array");
      System.out.println("2. Enhanced For loop");
      System.out.println("3. Searching a 2D Array");
      System.out.println("4. Searching a 1D Array");
      System.out.println("5. Exeption Handeling with user input");
      System.out.println("6. Exact Sum using Math");
      String scan = in.nextLine();
      /*
       * @param scan input
       */
      switch (scan) {
        case "1":
          int n = 0;
          int[] anArray = {10, 30, 50}; // smallest number
          int lowest = anArray[n];
          for (int i = 0; i < anArray[n]; i++) {
            if (anArray[n] < lowest) {
              lowest = anArray[n];
            }
          }
          System.out.println("Smallest Value: " + lowest + "\n");
          break;
        case "2":
          char[] letters = {'a', 'l', 'i', 'e', 'n'};
          for (char text : letters) { // enhanced for loop
            System.out.printf("\t" + text + "\n");
          }
          break;
        case "3":
          // 2D Array
          int[][] grid = {{1, 2, 3}, {4, 5, 6}};
          // Searching a 2D Array
          int target = 4; // the element to be searched
          for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
              if (grid[i][i] == target) {
                System.out.println("Element found at index " + i + "\n");
                if (grid[i][j] == target) { // the == operator
                  // checks if the
                  // integer[][] is
                  // equal to the
                  // integer(target)
                  System.out.println("Element found at index " + j + "\n");
                  break;
                }
              }
            }
          }

          System.out.println(target);
          break;
        case "4":
          // Searching a 1D Array
          System.out.println("Type a Value between 1 and 5");
          int target1 = 3; // the element to be searched
          int[] single = {1, 2, 3, 4, 5};
          for (int i = 0; i < single.length; i++) {
            if (single[i] == target1) {
              System.out.println("Element found at index " + i + "\n");
            }
          }
          break;
        case "5":
          try {
            Scanner text = new Scanner(System.in, "UTF-8");
            String[] message = {"It happened at the High Sierra"};
            System.out.println("Enter code...");
            String code = message[text.nextInt()];
            System.out.println(code);
            text.close();
          } catch (Exception ex) {
            System.out.println("Incorrect Code...\n\n");
          }
          break;
        case "6":
          System.out.println("2 + 2= ...");
          int num1 = 2;
          int num2;
          num2 = (num1 == 2) ? 20 : 30;
          int sum;
          sum = Math.addExact(num1, num2);
          System.out.println(sum);
          break;
        default:
          // Encoded Message
          // Text > SHA-1
          // https://v2.cryptii.com/text/sha1
          System.out.println("122df751892ef4217f7eb88d61c401f70e2f1b9a\n");
          break;
      }
    }
    in.close();
  }
}
