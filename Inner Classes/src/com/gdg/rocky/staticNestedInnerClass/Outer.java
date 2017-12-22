package com.gdg.rocky.staticNestedInnerClass;

class Outer
{
	private static void outerMethod()
	{
		System.out.println("inside Outer");
	}
	
	static class Inner {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("inside inner");
			outerMethod();
		}

	}

}


