package operators_Demo;

import javax.swing.plaf.synth.SynthSeparatorUI;

import Arithmetic.Arithmetic_demo;
import Bitwise.Bitwise_demo;
import Conditional.Conditional_demo;
import Logical.Logical_demo;
import Relational.Relational_demo;

public class Main {

	public static void main(String[] args)
	{
		int a = 5;
		int b = 10;
		Arithmetic_demo d1 = new Arithmetic_demo();
		System.out.println("Arithmetic Operators:");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
		System.out.println("A + B = " + d1.add(a, b) );
		System.out.println("A - B = " + d1.subt(a, b));
		System.out.println("A * B = " + d1.mult(a, b));
		System.out.println("A / B = " + d1.div(a, b));
		System.out.println("A % B = " + d1.mod(a, b));
		System.out.println("A-- = " + d1.decrement(a));
		System.out.println("A++ = " + d1.increment(a));
		
		
		Bitwise_demo d2 = new Bitwise_demo();
		System.out.println("\nBitwise Operators:");
		System.out.println("A & B = " + d2.and(a, b));
		System.out.println("A | B = " + d2.or(a, b));
		System.out.println("A ^ B = " + d2.xor(a, b));
		System.out.println("~A = " + d2.compliment(a));
		System.out.println("A << B = " + d2.leftShift(a, b));
		System.out.println("A >> B = " + d2.rightShift(a, b));
		
		
		Logical_demo d3 = new Logical_demo();
		boolean c = true;
		boolean d = false;
		System.out.println("\nLogical Operators:");
		System.out.println("C = " + c);
		System.out.println("D = " + d);
		System.out.println("C && D = " + d3.and(c, d));
		System.out.println("C || D = " + d3.or(c, d));
		System.out.println("!C = " + d3.not(c));

		
		Relational_demo d4 = new Relational_demo();
		
		System.out.println("\nRelational Operators:");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println(" A = B :" + d4.equal(a,b));
		System.out.println("A != B :" + d4.notEqual(a, b));
		System.out.println("A > B : " + d4.greater(a,b));
		System.out.println("A < B : " + d4.less(a, b));
		System.out.println("A >= B :  " + d4.gtEqual(a, b));
		System.out.println("A <= B : " + d4.ltEqual(a, b));
		
		
		
		Conditional_demo d5 = new Conditional_demo();
		
		System.out.println("\nConditional Operator:");
		System.out.println("Is 5 > 1? " + d5.Cond(5 >1));
		
		
		
		
		
		
		
	}
	
}
