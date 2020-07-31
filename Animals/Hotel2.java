package Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel2 {
	public static void  main(String args[]) {
		List<Animal> animal = new ArrayList();		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Выберите животного от 1 до 3, где 1 - Собака 2 - Кот, 3 - Змея");
		int Number = scanner.nextInt();			
		System.out.println("Какое у него имя");
		String name = scanner.next();
		System.out.println("Возраст?");
		int age = scanner.nextInt();
		
		
		
		switch(Number) {
	     case 1:if(Number == 1) {
	    	 animal.add(new Dog(name,age));    
        }
			System.out.println("Dog");
			break;
		case 2:if(Number == 2) {
			animal.add(new Cat(name,age));			
		}
			System.out.println("Cat");
			break;
		case 3:if(Number == 3) {
			animal.add(new Snake(name,age));
		}
			System.out.println("Snake");		
			break;
		default:
			System.out.println("К сожелению вы не подходите!:(");
			
								
		
		}
		
	}	
}