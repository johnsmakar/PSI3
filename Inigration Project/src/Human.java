//John Makar
public class Human extends Character {

	private int humanAge;
	private String humanRace;
	
	public Human(String n, String s, String p, int a, String r) {
		super(n, s, p);
		humanAge = a;
		humanRace = r;
	}
	
// Human age	
	//Set Age
	public void setAge(int myAge) {
	humanAge = myAge;
	}
	//Get Age
	public int getAge(){
	return humanAge;
	}

// Human race	
	//Set Race
	public void setRace(String myRace) {
	humanRace = myRace;
	}
	//Get Race
	public String getRace(){
	return humanRace;
	}

}
