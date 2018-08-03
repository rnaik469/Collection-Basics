package in.co.cg.test;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import in.co.cg.collectionbaisc.Car;
import in.co.cg.collectionbaisc.School;
import in.co.cg.collectionbaisc.Students;

public class Test4 {
	public static void main(String[] args) {

		System.out.println("....LinkedHashSet....students"); 
		Set<Students> std = new LinkedHashSet<Students>(); // LinkedHashSet with School class
		std.add(new Students("Rohit"));
		std.add(new Students("Himanshu"));
		std.add(new Students("Aashish"));
		std.add(new Students("Shubham"));
		for (Students sch : std) {
			System.out.println(sch);
		}
		System.out.println("\n....TreeSet....students");
		Set<Students> stds = new TreeSet<Students>(); // TreeSet with School class
		stds.add(new Students("Himanshu"));
		stds.add(new Students("Rohit"));
		stds.add(new Students("Aashish"));
		stds.add(new Students("Shubham"));
		for (Students scho : stds) {
			System.out.println(scho);
		}

	}
}
