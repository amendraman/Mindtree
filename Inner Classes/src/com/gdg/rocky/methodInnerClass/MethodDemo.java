package com.gdg.rocky.methodInnerClass;

class Outer
{
	void outerMethod()
	{
		System.out.println("Inside outer method");
		class Inner
		{
			void innerMethod()
			{
				System.out.println("Inside Inner Method");
			}
		}
		Inner y = new Inner();
		y.innerMethod();
	}
}

/*
 Method Local inner classes can’t use local variable of outer method until that local variable is not declared as final.
  For example, the following code generates compiler error (Note that x is not final in outerMethod() and innerMethod() tries to access it)
 */

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		o.outerMethod();
	}

}
