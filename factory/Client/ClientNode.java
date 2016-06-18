package Client;

import WithFactoryPattern.IceCream;
import WithFactoryPattern.IceCreamFactory;

public class ClientNode {

	
	public static void main(String[] args) {
		
		// put value 1 or 2 in 'choice' variable
		// 1 for selecting Vanila Icecream
		// 2 for selecting Strawberry IceCream
		
		
		int choice = 2;
		
		// no need for using new() operator
		
		IceCream iceCream = IceCreamFactory.iceCreamType(choice);
		iceCream.message();
	}

}
