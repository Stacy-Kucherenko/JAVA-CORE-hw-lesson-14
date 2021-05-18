package lviv.lgs.ua.task2;

import java.util.Scanner;

public class Main {
	
	static void menu () {
		System.out.println();
		System.out.println("Enter 1 to add a product to the warehouse ");
		System.out.println("Enter 2 to remove a product to the warehouse ");
		System.out.println("Enter 3 to replace the item on the  warehouse ");
		System.out.println("Enter 4 to sort the products by their name");
		System.out.println("Enter 5 to sort the products by their length");
		System.out.println("Enter 6 to sort the products by their width");
		System.out.println("Enter 7 to sort the products by their weight");
		System.out.println("Enter 8 to get the product by the serial nuber ");
		System.out.println("Enter 9 to exit ");
		
	}
	
	public static void main(String[] args) {
		
		Storage storage = new Storage(); 
		Scanner scanner = new Scanner (System.in);
		
		while (true) {
			menu (); 
			
			switch (scanner.nextInt()) {
			case 1: {
				storage.addCommodity();
				break;
			}

			case 2: {
				storage.removeCommodity();
				break;
			}

			case 3: {
				storage.replaceCommodity();
				break;
			}

			case 4: {
				storage.sortByName();
				break;
			}

			case 5: {
				storage.sortByLength();
				break;
			}

			case 6: {
				storage.sortByWidth();
				break;
			}

			case 7: {
				storage.sortByWeight();
				break;
			}

			case 8: {
				storage.getCommodity();
				break;
			}

			case 9: {
				System.exit(0);
				break;
			}

			default: {
				System.out.println("Please enter a number from 1 to 9");
				break;
			}
			}
		}
	}

}
