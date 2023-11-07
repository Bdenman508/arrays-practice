import methods.ArrayMethods;

/**
 * 
 */

/**
 * @author Bryan Denman
 * @date: Oct 19, 2023
 * 
 */
public class DeclaringArrays {
	
	public static void main(String[] args) {
		//ArrayMethods arrayMethods = new ArrayMethods();
		
		//arrayMethods.multipleArrays();
		
		DeclaringArrays declaringArrays = new DeclaringArrays();
		declaringArrays.callNewway();
		
		callNewway2();
	}
	public void callNewway(){
		String[] arrString = new String[2];
		arrString[1] = "dog";
		arrString[0] = "cat";
		for(int i=0;i<arrString.length;i++){
			System.out.println(arrString[i]);
		}
		
	}
	
	public static void callNewway2(){
		String[] arrString = new String[2];
		arrString[0] = "dogs";
		arrString[1] = "cats";
		for(int i=0;i<arrString.length;i++){
			System.out.println(arrString[i]);
		}
		
	}
}
