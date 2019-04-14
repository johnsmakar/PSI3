//John Makar
public class Enemy {

	private int enemyHealth;
	private int enemyDamage;
	
	//Constructor
	//https://drive.google.com/file/d/0BwAJAMyRUcYlQW5PN3dCcDVBQ2c/view
	//Overloading a Method
	public Enemy(int h, int d){
		enemyHealth = h;
		enemyDamage = d;
	}
	
	public void show(){
	      System.out.println("A Enemy has apperaed");   
	   }
	
// Enemy Health	
	//Set Name
	public void setHealth(int myHealth) {
	enemyHealth = myHealth;
}
	//Get Name
	public int getHealth(){
		return enemyHealth;
	}
// Enemy Damage	
		//Set Name
		public void setDamage(int myDamage) {
		enemyDamage = myDamage;
	}
		//Get Name
		public int getDamage(){
			return enemyDamage;
		}
	
	
}
