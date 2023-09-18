import java.util.Scanner;

class address 
{
	String sto ;
	String city,state,country ;
	
	address(String sto, String city, String state, String country)
	{
	        this.sto = sto ;
	        this.city = city;
	        this.state = state;
	        this.country = country;
	 }
	 
        public String  getsto()
        {
        	return sto ;
        }
        public String getcity()
        {
        	return city ;
        }
        
}

class student 
{
	 String usn, name;
	    address address;

	    student(String usn, String name, address address)
	    {
	        this.usn = usn;
	        this.name = name;
	        this.address = address;
	    }
	    
	    public void printadress() 
	    {
       	
	    	System.out.println("street no "+ address.getsto() );
	    	System.out.print("city "+ address.getcity());
       	
       }
}


public class Main 
{

	public static void main(String[] args) 
	{
		Scanner scan  = new Scanner(System.in);
		int c ;
		int s=0;
		String sno,city,state,country ;
		
		System.out.print("enter the choice");
		c = scan.nextInt() ;
		
		System.out.print("enter the size of array");
		s = scan.nextInt() ;
		switch (c )
		{
		case 1: 
			student S [] = new student [s];
			String usn,name;
			
			for(int i =0;i<s;i++)
			{
				System.out.print("enter the usn");
				usn = scan.next() ;
				
				System.out.print("enter the name ");
				name  = scan.next() ;
				scan.skip("\\R?");
				
				System.out.println("enter the student address ");
				sno  = scan.next() ;
				scan.skip("\\R?");
				
				System.out.print("enter the city");
				city = scan.next() ;
				scan.skip("\\R?");
				
				System.out.print("enter the state");
				state = scan.next() ;
				
				System.out.print("enter the country");
				country = scan.next() ;
				
				address ar = new address(sno ,city ,state,country);
				
				S[i] = new student(usn,name,ar);
				System.out.print("usn "+ usn);
				System.out.print("student  "+ name );
				S[i].printadress() ;
			}
			break ;
	}

}}
