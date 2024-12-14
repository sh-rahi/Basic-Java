package Day_2;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 30;
		//int c = a + b;
		
		//Arithmetic operator
		System.out.println("Sum of a and b is: "+(a+b));
		System.out.println("Multiplication of a and b is: "+(a*b));
		System.out.println("Subtraction of a and b is: "+(a-b));
		System.out.println("Division of a and b is: "+(b/a));
		System.out.println("Reminder of a and b is: "+(36%b));
		
		//Relational operator
		System.out.println(a < b); //true
		System.out.println(a > b); //false
		System.out.println(a <= b); //true
		System.out.println(a >= b); //false
		System.out.println(a == b); //false
		System.out.println(a != b); //true
		
		
		//logical operator
		boolean x = true;
		boolean y = false;
		
		System.out.println(x && y); //false
		System.out.println(x || y); //true
		System.out.println(!x); //false
		System.out.println(!y); //true
		
		//Increment/decrement operator
		a++;
		System.out.println(a);
		a = 15;
		a--;
		System.out.println(a);

	}

}
