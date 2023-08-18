package prg5;
import java.util.*;
class market {
	private int fruitNumber;
	private ArrayList<String> fruits ;
	
	public market(int fruitNumber)
	{
		this.fruitNumber = fruitNumber;
		fruits = new ArrayList<> (fruitNumber) ;
		
	}
	public synchronized boolean isfull() 
	{
		return fruits.size() == fruitNumber ;
	}
	
	public synchronized boolean isempty() 
	{
		return fruits.size() == 0 ;
	}
	public synchronized void  farmer(String fruit) 
	{
		if(isfull())
		{
			try {
				wait() ;//farmer waits if the fruit basket is full
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		fruits.add(fruit) ;
		notify() ; //notifying to the consumer to check the basket 
		
	}
	public synchronized String consumer()
	{
		if(isempty())
		{
			try {
				wait() ;//farmer waits if the fruit basket is full
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		String consumerfruit = fruits.remove(0);
		notify();
		return consumerfruit ;
		
	}
	
	
}
public class Main {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		market mar = new  market(5) ;
		
		Thread farmerThread = new Thread(new Runnable()
				{
					public void run() {

						for(int i = 1;i<=20;i++)
						{
								String fruit = "Fruit" + i ;
								mar.farmer(fruit);
								System.out.println("farmer added  :" + fruit );
						}
					}
				}) ;
		Thread cons = new Thread(new Runnable() 
				{
					public void run() 
					{
						for(int i = 1;i<=20;i++)
						{
							String consumerFruit = mar.consumer();
							System.out.println ("consumer consumed : " + consumerFruit );
							
						}
					}
				});
				farmerThread.start() ;
				cons.start() ;
				farmerThread.join() ;
				cons.join() ;
	}

}
