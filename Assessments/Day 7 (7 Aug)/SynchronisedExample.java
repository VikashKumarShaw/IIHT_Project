class SynchronisedExample{  
	//prints multiplication table of a given int
	static synchronized void printTable(String n){  
		System.out.println("----------starting of:"+n);
		for(int i=0;i<n.length();i++){  
			System.out.println(n.charAt(i));  
			try{  
				Thread.sleep(500);  
			}catch(Exception e){ System.out.println(e);}  
		}  
		System.out.println("----------ending of:"+n);
	}  
}  
class MyThread1A extends Thread{  
	public void run(){  
		TableA.printTable("hello");  
	}  
}  
class MyThread2A extends Thread{  
	public void run(){  
		TableA.printTable("how");  
	}  }
class MyThread3A extends Thread{  
	public void run(){  
	TableA.printTable("are");  
	} }
class MyThread4A extends Thread{  
	public void run(){  
	TableA.printTable("you");  
	} }
class MyThread5A extends Thread{  
		public void run(){  
		TableA.printTable("doing?");  
		} 
	}   
public class Synchrnizd{  
				public static void main(String t[]) throws InterruptedException{  
					MyThread1A t1=new MyThread1A();  
					MyThread2A t2=new MyThread2A(); 
					MyThread3A t3=new MyThread3A();
					MyThread4A t4=new MyThread4A();
					MyThread5A t5=new MyThread5A();


					t1.start(); 
					t1.join();
					t2.start();  
					t2.join();
					t3.start();
					t3.join();
					t4.start();
					t4.join();
					t5.start();


				}  
			}  