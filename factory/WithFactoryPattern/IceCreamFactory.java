package WithFactoryPattern;

public class IceCreamFactory {
	
	// the factory method
	
	public static IceCream iceCreamType(int value){
		if(value == 1){
			return new VanilaIceCream();
		}
		else if(value == 2){
			return new StrawberryIceCream();
		}
		else{
			return null;
		}
	}

}
