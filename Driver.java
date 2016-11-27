import shapes.Square;
import shapes.Rectangle;
import utils.Math;

	public class Driver {

	    public static void main(String[] args) {

	        Square fS=new Square(100);
	        System.out.println("The area of the square: "+fS.getArea());

	        Rectangle fR = new Rectangle(50,80);
	        System.out.println("The area of the rectangle: "+fR.getArea());


	        double number=15.6;
	        System.out.println("FactorialRecursion: "+Math.factorial( (int)number) );
	        System.out.println("FactorialLoop: "+Math.factorialLoop( (int)number) );

	    }
	}