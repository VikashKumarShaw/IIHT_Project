package com.abcde;
import com.abcdef.*;
public class TDemo2{
	
	public TDemo2()
	{
		System.out.println("TDemo2() constructor");
	}
	
	public void met2() throws Exception,NullPointerException
	{

		TDemo1 td = new TDemo1();
		System.out.println("in met2(), b4 met1()");
		td.met1();
	}
}



package com.abcdef;
public class TDemo1{
	public TDemo1()
	{
		System.out.println("TDemo1() constructor");
	}
	
	public void met1() throws Exception
	{
		int x = 1;
		if(x==1)
		{
			throw new Exception("Some Exception");
		}
	}
}


package com.abcdefg;
import com.abcde.*;

public class ThrowsDemo {
	public static void main(String args[]) //throws Exception
	{
		try{
		TDemo2 td2 = new TDemo2();
		System.out.println("in main, b4 met2()");
		td2.met2();		
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception occurred"+e.getMessage());
			//prints(TO CONSOLE DIRECTLY) line number, class name, file name 
			//where the exception has occurred
			//and the methods thru which exception has been propogated, until caught
		}
	}
}





//---------------    OUTPUT  ----------------------


TDemo2() constructor
in main, b4 met2()
TDemo1() constructor
in met2(), b4 met1()
java.lang.Exception: Some Exception
	at com.abcdef.TDemo1.met1(TDemo1.java:13)
	at com.abcde.TDemo2.met2(TDemo2.java:15)
	at com.abcdefg.ThrowsDemo.main(ThrowsDemo.java:10)
Exception occurredSome Exception
