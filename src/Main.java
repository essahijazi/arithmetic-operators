
public class Main {

	public static void main(String[] args) {
		
		/*BASIC OPERATORS*/
		
		int intResult = 1 + 2;
		System.out.println(intResult); //will print 3
		
		double doubleResult = 1.0 + 2.0;
		System.out.println(doubleResult); //will print 3.0
		
		intResult = 3 - 2;
		System.out.println(intResult); //will print 1
		
		doubleResult = 3.0 - 2.0;
		System.out.println(doubleResult); //will print 1.0
		
		intResult = 4 * 2;
		System.out.println(intResult); //will print 8
		
		doubleResult = 4.0 * 2.0;
		System.out.println(doubleResult); //will print 8.0
		
		intResult = 13 / 5;
		System.out.println(intResult); //will print 2
		
		doubleResult = 13.0 / 5.0;
		System.out.println(doubleResult); //will print 2.6
		
		intResult = 13 % 5;
		System.out.println(intResult); //will print 3
		
		doubleResult = 13 % 5;
		System.out.println(doubleResult); //will print 3.0
		
		
		/*PREFIX/POSTFIX OPERATORS*/
		
		int myVal = 5;
		System.out.println(++myVal); //will print 6 as it updates the value before printing
		
		System.out.println(myVal++); //will print 6 as it updates the value after printing
		System.out.println(myVal); //will print 7 as the value was updated after the previous print statement
		
		
		/*COMPOUND OPERATORS*/
		
		
		int anotherVal = 10;
		anotherVal -= 7; //anotherVal's value will be 3. the same as anotherVal = anotherVal - 7;
		System.out.println(anotherVal);
		
		int val1 = 20;
		int val2 = 40;
		anotherVal *= val2 / val1; // anotherVal's value will be 6. same as anotherVal = anotherVal * (val2 / val1)
		System.out.println(anotherVal);
	}

}
