package com.gdg.rocky.anonymous;

class Demo
{
	void show()
	{
		System.out.println("Let me show you how anonymous class work");
	}
}
class Anonymous1Demo 
{
	static Demo d = new Demo()
	{
		void show()
		{
			super.show();
			System.out.println("i am Anonymous class");
		}
	};
	public static void main(String[] args)
	{
		d.show();
	}
}
