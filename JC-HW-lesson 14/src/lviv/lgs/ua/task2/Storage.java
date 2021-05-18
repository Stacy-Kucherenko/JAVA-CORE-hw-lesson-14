package lviv.lgs.ua.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Storage {
	
	ArrayList <Commodity> storage = new ArrayList <Commodity>();
	
	public void addCommodity() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the name of the product:");
		String name = scanner.next();
		
		System.out.println("Enter the length of the product, cm:");
		int length = scanner.nextInt(); 
		
		System.out.println("Enter the width of the product, cm:");
		int width = scanner.nextInt();
		
		System.out.println("Enter the weight of the product, kg:");
		int weight = scanner.nextInt();
		
		
		Commodity commodity = new Commodity(name, width, weight, length);
		
		storage.add(commodity);
		System.out.println("Commodity" + commodity.toString() + "  successfully added to the warehouse");
		
	}
	
	public void removeCommodity() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the name of the product:");
		String name = scanner.next();
		
		System.out.println("Enter the length of the product, cm:");
		int length = scanner.nextInt(); 
		
		System.out.println("Enter the width of the product, cm:");
		int width = scanner.nextInt();
		
		System.out.println("Enter the weight of the product, kg:");
		int weight = scanner.nextInt();
		
		boolean dataCorrect = isCommodityExist(storage, name, length, width, weight);
		
		if (dataCorrect) {
			
			Iterator <Commodity> iterator = storage.iterator();
			
			while (iterator.hasNext()) {
				Commodity nextCommodity = iterator.next();
				
				if (nextCommodity.getName().equalsIgnoreCase(name)&& nextCommodity.getLength() == length
						&& nextCommodity.getWidth() == width && nextCommodity.getWeight() == weight) {
					iterator.remove();
					System.out.println("Commodity" + nextCommodity.toString() + " successfully removed from the stock" );
				}
			}
		} else {
			System.out.println("The entered product is out of stock");
		}
	}
	
	public void replaceCommodity() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the name of the product:");
		String name = scanner.next();
		
		System.out.println("Enter the length of the product, cm:");
		int length = scanner.nextInt(); 
		
		System.out.println("Enter the width of the product, cm:");
		int width = scanner.nextInt();
		
		System.out.println("Enter the weight of the product, kg:");
		int weight = scanner.nextInt();
		
		boolean dataCorrect = isCommodityExist(storage, name, length, width, weight);
		
		if (dataCorrect) {
			for (Commodity commodity : storage) {
			if (commodity.getName().equalsIgnoreCase(name) && commodity.getLength() == length && commodity.getWidth() == width && commodity.getWeight() == weight) {
				System.out.println("Enter the new name of the product:");
				String newName = scanner.next();
				
				System.out.println("Enter the new length of the product, cm:");
				int newLength = scanner.nextInt(); 
				
				System.out.println("Enter the new width of the product, cm:");
				int newWidth = scanner.nextInt();
				
				System.out.println("Enter the new weight of the product, kg:");
				int newWeight = scanner.nextInt();
				
				commodity.setName(newName);
				commodity.setLength(newLength);
				commodity.setWidth(newWidth);
				commodity.setWeight(newWeight);
				
				System.out.println("The entered product has been successfully replaced by " + commodity.toString());
			}
			}
		} else {
			System.out.println("The entered product is out of stock");
		}
	}
	
	public void sortByName () {
		System.out.println("Before sorting: ");
		for (Commodity commodity : storage) {
		System.out.println(commodity);
		}
		
		Collections.sort(storage, new CommodityNameComparator());
		System.out.println("After sorting: ");
		for (Commodity commodity : storage) {
		System.out.println(commodity);
		}
	}
	
	public void sortByLength() {
		System.out.println("Before sorting: ");
		for (Commodity commodity : storage) {
		System.out.println(commodity);
		}
		
		Collections.sort(storage, new CommodityLengthComparator());
		System.out.println("After sorting: ");
		for (Commodity commodity : storage) {
		System.out.println(commodity);
		}

	}
	
	public void sortByWidth () {
		System.out.println("Before sorting: ");
		for (Commodity commodity : storage) {
		System.out.println(commodity);
		}
		
		Collections.sort(storage, new CommodityWidthComparator());
		System.out.println("After sorting: ");
		for (Commodity commodity : storage) {
		System.out.println(commodity);
		}
	}
	
	public void sortByWeight () {
		System.out.println("Before sorting: ");
		for (Commodity commodity : storage) {
		System.out.println(commodity);
		}
		
		Collections.sort(storage, new CommodityWeightComparator());
		System.out.println("After sorting: ");
		for (Commodity commodity : storage) {
		System.out.println(commodity);
		}
	}
	
	public void getCommodity () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the serial number of the item ");
		int i = scanner.nextInt();
		
		if (i < 0 || i > (storage.size() - 1)) {
			System.out.println("The item with this serial number is not on the stock");
		} else {
			System.out.println("The item with this serial number " + i + " is on stock " + storage.get(i).toString());
		}
	}

	private boolean isCommodityExist(ArrayList<Commodity> storage, String name, int length, int width, int weight) {
		boolean flag = false; 
		
		for (Commodity commodity : storage) {
			if (commodity.getName().equals(name) && commodity.getLength() == length && commodity.getWidth() == width && commodity.getWeight() == weight) {
				flag = true;
			}
		}
		return flag;
	}

	

}
