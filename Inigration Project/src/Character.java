
public class Character {

	//Fields
	private static String name;
	private static String age;
	private static String gender;
	private static String DateOfBirth;
	private static boolean StartGame;
	
	//Methods
	
	//Name
	public static String getName() {
		return name;
	}
	public static void setName(String n) {
		name = n;
	}
	
	//Age
	public String getAge() {
		return age;
		
	}
	public void setAge(String a) {
		age = a;
	}
	
	//Gender
	public String getGender() {
		return gender;
	}
	public static void setGender(String g) {
		gender = g;
	}
	
	//DOB
	public String getDOB() {
		return DateOfBirth;
	}
	public static void setDOB(String DOB) {
		DateOfBirth = DOB;
	}
	
	//Start Game
	public static boolean getStartGame() {
		return StartGame;
	}
	public static void setStartGame(boolean startGame) {
		StartGame = startGame;
	}
	
	
}
