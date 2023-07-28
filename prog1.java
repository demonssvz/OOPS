
package first;

class com {

	int real;
	int img;

	com(int a,int b)
	{
		this.real = a;
		this.img = b;
	}
	
	
	public static  com Add(com n1 , com n2)
	{
		com t = new com(0,0);
		t.real = n1.real - n2.real ;
		t.img = n1.img - n2.img ;
		return t ;
		
	}
	
	



	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		com n1 = new com(5,3);
		com n2 = new com(3,-7);
		com add =  Add(n1,n2);
		System.out.printf("the sum is %d + %d i", add.real,add.img);
		
	}


}
