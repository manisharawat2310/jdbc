package debuggingDemo;

import java.util.Arrays;

public class Demo2 {

	int sum=0;
	
	public static void main(String[] args) {
		Demo2 d= new Demo2();
		int firstInt = 7;
		int secondInt=8;
		int[] a= {1,2,3,4};		
		
		d.sum= add(firstInt, secondInt);
		
		System.out.println(Arrays.toString(a));
		System.out.println("The sum is: "+d.sum);
		
		for(int i=0; i<5;i++) {
			System.out.println(add(5,6));
			
		}
	
	}

	public static int add(int num1, int num2) {
		int sum= num1+num2;
		return sum;
	}
}
