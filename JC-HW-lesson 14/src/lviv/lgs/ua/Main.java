package lviv.lgs.ua;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("�������� � ��������� �������");
		
		Set <Employee> emp = new HashSet <Employee>(); 
		emp.add(new Employee ("Alexadro", 24));
		emp.add(new Employee ("Mario", 64));
		emp.add(new Employee ("Lizzy", 21));
		emp.add(new Employee ("Alex", 25));
		emp.add(new Employee ("Fulvio", 44));
		
		for (Employee employee : emp) {
		System.out.println(employee);
		}
		
		
		System.out.println();
		System.out.println("�������� � ������� �� ����������");
		
		Set <Employee> emp1 = new LinkedHashSet <Employee>(); 
		emp1.add(new Employee ("Alexadro", 24));
		emp1.add(new Employee ("Mario", 64));
		emp1.add(new Employee ("Lizzy", 21));
		emp1.add(new Employee ("Alex", 25));
		emp1.add(new Employee ("Fulvio", 44));
		
		for (Employee employee : emp1) {
		System.out.println(employee);
		}
		
		System.out.println();
		System.out.println("�������� � �������, ���������������� � Comparable");
		
		Set <Employee> emp2 = new TreeSet <Employee>(); 
		emp2.add(new Employee ("Alexadro", 24));
		emp2.add(new Employee ("Mario", 64));
		emp2.add(new Employee ("Lizzy", 21));
		emp2.add(new Employee ("Alex", 25));
		emp2.add(new Employee ("Fulvio", 44));
		
		for (Employee employee : emp2) {
		System.out.println(employee);
		}
		
		System.out.println();
		System.out.println("�������� � �������, ���������������� � Comparator");
		
		Set <Employee> emp3 = new TreeSet <Employee>(new EmployeeIntegerComparator()); 
		emp3.add(new Employee ("Alexadro", 24));
		emp3.add(new Employee ("Mario", 64));
		emp3.add(new Employee ("Lizzy", 21));
		emp3.add(new Employee ("Alex", 25));
		emp3.add(new Employee ("Fulvio", 44));
		
		for (Employee employee : emp3) {
		System.out.println(employee);
		}
	}

}
