package Animals;

public class Dog extends Animal{
	public Dog(String name, int age) {
		super(name, age);
	
	}

	public void InfoDog() {
		 System.out.println("Как зовут вашего друга?");
	  	 System.out.println(age);
	  	 
	}
	public void Game() {
		System.out.println("Поиграть с косточкой"); 
	}
}

