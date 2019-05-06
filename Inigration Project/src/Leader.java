/*
 * @author John Makar
 *
 */
/*
 * The Leader is a child of the Enemy class, The Leader is meant to be slower and do more damage
 * than both the Rusher and Assault.
 */
public class Leader extends Enemy {

  /*
   * Inheritance is a used to derive a class from an already existing class where its then able to
   * "inherit" the Fields and methods of its parent class (also known as super, or base class). This
   * method is used for efficiency
   */

  @Override
  public void show() {
    System.out.println("A Leader has appeared"); // This is Polymorphism
  }

  public Leader(int h, int d) {
    super(h, d);

  }

}
