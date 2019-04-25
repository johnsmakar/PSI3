/*
* @author johns
 *
 */
/*
 * The Assault is a child of the Enemy class, The Assault is meant to do more damage than the Rusher.
 */
public class Assault extends Enemy {

	/*
	 * Inheritance is a used to derive a class from an already existing class where
	 * its then able to "inherit" the Fields and methods of its parent class (also
	 * known as super, or base class). This method is used for efficiency
	 */

	@Override
	public void show() {
		System.out.println("A Assualt has appeared"); // This is Polymorphism
	}

	public Assault(int h, int d) {
		super(h, d);

	}

}