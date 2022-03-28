package com.java;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

import javax.swing.event.ListSelectionEvent;

class Employee1{

	private int emppID;
	private String empName;
	private String email;
	private String city;
	private String state;

	public Employee1(int emppID, String empName, String email, String city, String state) {
		this.emppID = emppID;
		this.empName = empName;
		this.email = email;
		this.city = city;
		this.state = state;
	}
}
public class FunctionTesting {
  public static void main(String[] args) {
	     System.out.println("Test Speed .....");
		Employee1 emp1= new Employee1(12, "dhiraj1 ", "likedhiraj1", "patna1", "karnatka1");
		Employee1 emp2= new Employee1(12, "dhiraj2 ", "likedhiraj2", "patna2", "karnatka2");
		Employee1 emp3= new Employee1(13, "dhiraj3 ", "likedhiraj3", "patna3", "karnatka3");
		Employee1 emp4= new Employee1(14, "dhiraj4 ", "likedhiraj4", "patna4", "karnatka4");
		Employee1 emp5= new Employee1(12, "dhiraj1 ", "likedhiraj1", "patna1", "karnatka1");
		System.out.println(emp1.equals(emp2));
	
		
		HashSet<Employee1> hs= new HashSet<Employee1>();
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);
		hs.add(emp5);
		Iterator<Employee1> i= hs.iterator();
		while (i.hasNext()) {
			Employee1 employee = (Employee1)i.next();
			// System.out.println(employee.emppID +"  "+employee.empName+"  "+employee.city+" "+employee.state);
		}
}
}


