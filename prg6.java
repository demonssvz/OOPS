package prg6;
import java.util.*;


public class Main
{
		public ArrayList<String> colors = new ArrayList<>() ;




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main op = new Main () ;
		Scanner scan = new Scanner(System.in);
		
		for(;;)
		{
			System.out.println("====choice list====");
			System.out.println("1.insert 2. copyaRRAY LIST/n 3. REVERSE ARRAY LIST");
			System.out.println("====================");
			
			
			int choice = scan.nextInt();
			
			switch(choice)
			{
			case 1 :
				op.colors.add("VOILET");
				op.colors.add("BLUE");
				op.colors.add("INDIGO");
				op.colors.add("GREEN");
				op.colors.add("YELLOW");
				op.colors.add("ORANGE");
				op.colors.add("RED");
				
				for(String color : op.colors)
				{
					System.out.println(color);
				}
				break ;
				
			case 2 :
				//reverse 
				Collections.reverse(op.colors);
				System.out.println("THE REVERSED LIST IS ");
				for(String color : op.colors)
				{
					System.out.println(color);
				}
				break ;
				
			case 3 :
				String [] colorArray = new String[op.colors.size()];
				op.colors.toArray(colorArray);
				System.out.println("THE COPIED  LIST IS ");
				for(String color : op.colors)
				{
					System.out.println(color);
				}
				break ;
			case 4 :
				
				ArrayList<String> sublist = new ArrayList<>(op.colors.subList(2, 4)) ;
				System.out.println("SUBLIST \n ");
				for(String colour : sublist)
				{
					System.out.println(colour);
				}
				break ;
			case 5 :
				Collections.sort(op.colors);
				System.out.println("SUBLIST \n ");
				for(String color : op.colors)
				{
					System.out.println(color);
				}
				break ;
				
			case 6 :
				
				ArrayList<String> clone =  (ArrayList<String>) op.colors.clone();
				System.out.println("CLONELIST \n ");
				for(String color : clone)
				{
					System.out.println(color );
				}
				break ;
			case 7 :
				break ;
			}
		}
		
	}


	
}
