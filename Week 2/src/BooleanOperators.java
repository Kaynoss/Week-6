
public class BooleanOperators {

	public static void main(String[] args) {
		

	/*
	 * Boolean Operators:
	 *  == equality
	 *  * > greater than
	 *  * < less than
	 *  * <= less than or equal 
	 *  
	 *  && AND, if too boolean expression evaluate to true, the whole expression is true	
	 */
	double moneyInPocket = 0.50;	
	double temperature = 108.01;
	boolean isHotOutside = temperature >=100;
	boolean willBuyIceCream = isHotOutside && moneyInPocket > 5;
	
	System.out.println("it is hot outside; " + isHotOutside);
	
	System.out.println("i will buy some ice cream; " + willBuyIceCream);
	
	
	
	
	
	


