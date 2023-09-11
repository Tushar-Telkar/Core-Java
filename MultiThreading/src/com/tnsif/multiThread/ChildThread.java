package com.tnsif.multiThread;

public class ChildThread extends Thread{

	int n;
	String msg;
	
	public ChildThread() {
		super();
		
	}
	public ChildThread(int n,String msg) {
		this.n=n;
		this.msg=msg;
	}
	@Override
	public void run()
	{
		for(int i=1;i<=n;i++)
		{
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.err.println(e.getMessage());
			}
			System.out.println("Message "+msg+" "+i);
		}
	
	}
}
