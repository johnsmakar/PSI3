/**
 * @author John Makar
 *
 */
/*
 * The Character class stores all the characters information if they wish to
 * create a new character, although not all the field are not currently being
 * use this allows for the program to be future proof for further updates
 */
public class Character {

	// Fields
	private static String name;
	private static String age;
	private static String gender;
	private static String dateOfBirth;
	private static boolean startGame;
	private static boolean launch;

	// Methods

	// Name
	public static String getName() {
		return name;
	}

	public static void setName(String n) {
		name = n;
	}

	// Age
	public String getAge() {
		return age;

	}

	public static void setAge(String a) {
		age = a;
	}

	// Gender
	public String getGender() {
		return gender;
	}

	public static void setGender(String g) {
		gender = g;
	}

	// DOB
	public String getDOB() {
		return dateOfBirth;
	}

	public static void setDOB(String DOB) {
		dateOfBirth = DOB;
	}

	// Start Game
	public static boolean getStartGame() {
		return startGame;
	}

	public static void setStartGame(boolean sg) {
		startGame = sg;
	}
	// Launch
	public static boolean getLaunch() {
		return launch;
	}

	public static void setLaunch(boolean L) {
		launch = L;
	}

}
