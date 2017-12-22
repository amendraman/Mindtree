package com.gdg.rocky.nestedInnerClass;

class Outer
{
	class Inner
	{
		public void show()
		{
			System.out.println("Inner Class Method");
		}
		// we can’t have static method in a nested inner class because an inner class is implicitly 
		//associated with an object of its outer class so it cannot define any static method for itself. 
		//For example the following program doesn’t compile.
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner obj = new Outer().new Inner();
		obj.show();

	}

}
