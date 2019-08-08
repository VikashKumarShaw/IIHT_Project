class MySimpleThread2 extends Thread{
	public MySimpleThread2()
	{
		System.out.println("This is MySimpleThread() Constructor");
	}
     static int i = 1;
     int j=5;
    public void run(){
    	while(i*j<= 50){
            try{
            	
                System.out.println("Other Thread: "+i*j);
                i++;
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    }
}
public class ThreadRunnable implements Runnable{
    public int i=4;
    int j=1;

    public void run() {
        while(i*j<= 40){
            try{
            	
                System.out.println("Other Thread: "+i*j);
                j++;
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    }
    class MySimpleThread extends Thread{
    	public MySimpleThread()
    	{
    		System.out.println("This is MySimpleThread() Constructor");
    	}
         int i = 1;
         int j=5;  
        //step 2
        public void run(){//public void run() need to be overridden
        	while(i*j<= 50){
                try{
                	
                    System.out.println("Other Thread: "+i*j);
                    i++;
                    Thread.sleep(100);
                } catch (InterruptedException iex) {
                    System.out.println("Exception in thread: "+iex.getMessage());
                }
            }
        }
    }
    public static void main(String a[]) throws InterruptedException {
    	int i = 3;
    	int j = 1;
    	
        System.out.println("Starting Main Thread...");    
        ThreadRunnableOne mrt = new ThreadRunnableOne();
        while(i*j <= 30){
            try{
            	
                System.out.println("Main Thread: "+i*j);
                j++;
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
        Thread t = new Thread(mrt);
        t.start();
        t.join();
        MySimpleThread2 mst = new MySimpleThread2();
        mst.start();
    }
}