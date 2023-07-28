
// to be implementes in AIML package
package AIML;

public class SEM4 {
	public void welcome()
	{
		System.out.print("welcom to aiml");
	}

}


// this is to be done in rvce package 
package RVCE;

public class AIML_DEPT extends AIML.SEM4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AIML_DEPT de = new AIML_DEPT() ;
		de.welcome();
	}

}
