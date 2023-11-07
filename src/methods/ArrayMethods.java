/**
 * 
 */
package methods;

/**
 * @author Bryan Denman
 * @date: Oct 20, 2023
 * 
 */
public class ArrayMethods {
	
	public ArrayMethods() {
		
	}
	public void multipleArrays(){
		
		int[] nums = {2,7,11,15};
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
		int i=0;
		while (i<nums.length) {
			System.out.println(nums[i]);
			i= i+1;
		}
		int[] nums2 = new int[20];
		for(i=0;i<nums2.length;i++){
			System.out.print(nums2[i]);
		}
		System.out.println();
		String[] arrString = new String[10];
		arrString[0] = "dogs";
		arrString[1] = "cats";
		for(i=0;i<arrString.length;i++){
			System.out.println(arrString[i]);
		}
		String[] arrString2= {"dogs","cat","mouse","cheese"};
		System.out.println();
		for(i=0;i<arrString2.length;i++){
			System.out.println(arrString2[i]);
		}
		String x;
		String y = "CheesexChocolatexCrackers";
		System.out.println();
		System.out.println(y.substring(7,16));
		System.out.println(y.replace("x","s"));
		
		String[] z = new String[y.length()];
		for(i=0;i<y.length();i++) {
			z[i] = Character.toString(y.charAt(i));
			System.out.print(z[i]);
		}
		System.out.println();
		String p = "A;G;E;N;C;I;A";
		String[] q = new String[p.length()];
		System.out.print(p);
		System.out.println();
		q = p.split(";");
		for(i=0;i<q.length;i++){
			System.out.print(q[i]);
		}
	}

}
