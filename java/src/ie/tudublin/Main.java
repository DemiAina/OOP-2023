package ie.tudublin;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello world");
		
		Dog penny = new Dog();
		penny.setName("Penny");
		penny.speak();

		Cat ginnger = new Cat("Ginger");

		for(int i = 0; i < 9; i++){
			ginnger.kill();
		}
	}
	
}