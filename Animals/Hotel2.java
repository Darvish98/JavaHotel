package Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel2 {
	public static void  main(String args[]) {
		List<Animal> animal = new ArrayList();		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� ��������� �� 1 �� 3, ��� 1 - ������ 2 - ���, 3 - ����");
		int Number = scanner.nextInt();			
		System.out.println("����� � ���� ���");
		String name = scanner.next();
		System.out.println("�������?");
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
			System.out.println("� ��������� �� �� ���������!:(");
			
								
		
		}
		
	}	
}