package prg3b;
	
	interface Animal 
	{
		void eat();
		void sound() ;
	}
	interface TiredAnimal extends Animal
	{
		void sleep () ;
		void travel();
	}
	class Lion implements Animal
	{
		public void eat() 
		{
			System.out.println("lion are carnivorus");
		}
		public void sound()
		{
			System.out.println("the lion roars");
		}
		
	}
	
	class Snake implements Animal,TiredAnimal
	{
		public void eat() 
		{
			System.out.println("snake  are carnivorus ");
		}
		public void sound()
		{
			System.out.println("the snake hisses");
		}
		public void sleep()
		{
			System.out.println("the snake sleep for 10 hrs");
		}
		public void action()
		{
			System.out.println("the snake crawls");
		}
		
	}

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------------------------------------------------------------");
		Lion lion = new Lion() ;
		lion.eat();
		System.out.println("--------------------------------------------------------------------------");
		Snake snake = new Snake();
		snake.eat();
		snake.sleep();
		snake.sound();
		snake.action();

	}

}
