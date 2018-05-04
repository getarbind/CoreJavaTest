
public class MyThread implements Runnable{
//extends Thread{
	
	@Override
	public void run(){
		System.out.println("Doing Thread processing - START " +Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            //Get database connection, delete unused data from DB
            doDBProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Doing Thread processing - END "+Thread.currentThread().getName());
	}

	private void doDBProcessing() {
		try {
			System.out.println("Inside DB Processing");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args){
		Thread t1 = new Thread(new MyThread());
		t1.start();
	}
	

}
