
public class Rusher extends Enemy {

	/*Inheritance is a used to derive a class from an already 
	 * existing class where its then able to "inherit" the
	 *  Fields and methods of its parent class (also known as
	 *   super, or base class). This method is used for efficiency */
	
	@Override
	public void show(){
	      System.out.println("A Rusher has appeared"); //This is Polymorphism   
	   }
	
	public Rusher(int h, int d) {
		super(h, d);
		

		
	}

}



