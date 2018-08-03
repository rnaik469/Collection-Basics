package in.co.cg.test;

import java.util.*;

import in.co.cg.collectionbaisc.Car;
import in.co.cg.collectionbaisc.CellPhone;
import in.co.cg.collectionbaisc.Laptop;
import in.co.cg.collectionbaisc.School;
import in.co.cg.collectionbaisc.Television;

public class Test3 {
	public static void main(String[] args) {

		Set<Car> carSet = new LinkedHashSet<Car>(); // LinkedHashSet with Car class
		carSet.add(new Car("maruti", "hondcacity", 2016, 700000));
		carSet.add(new Car("maruti", "hondcacity", 2016, 700000));
		carSet.add(new Car("Hyundai", "Santro", 2012, 400000));
		carSet.add(new Car("Hyundai", "Santro", 2012, 400000));
		for (Car ca : carSet) {
			System.out.println(ca);
		}
		
		System.out.println();
		Set<CellPhone> cellSet = new LinkedHashSet<CellPhone>(); // LinkedHashSet with CellPhone class
		cellSet.add(new CellPhone("Samsung", "S7", "edge display", "Android", 35000));
		cellSet.add(new CellPhone("Apple", "X", "Notch display", "ios", 35000));
		cellSet.add(new CellPhone("Samsung", "S7", "edge display", "Android", 35000));
		cellSet.add(new CellPhone("Apple", "X", "Notch display", "ios", 35000));
		cellSet.add(new CellPhone("Samsung", "S7", "edge display", "Android", 35000));
		for (CellPhone cellp : cellSet) {
			System.out.println(cellp);
		}
		
		System.out.println();
		Set<Laptop> laptopSet = new LinkedHashSet<Laptop>(); // LinkedHashSet with Laptop class
		laptopSet.add(new Laptop("Dell", "Inspiron-15", "windows", "i7"));
		laptopSet.add(new Laptop("HP", " UB", "DOS", "i8"));
		laptopSet.add(new Laptop("HP", " UB", "DOS", "i8"));
		laptopSet.add(new Laptop("Apple", "macbookAir", "MacOS", "i3"));
		laptopSet.add(new Laptop("Apple", "macbookAir", "MacOS", "i3"));
		for (Laptop lap : laptopSet) {
			System.out.println(lap);
		}
		
		System.out.println();
		Set<Television> TVSet = new LinkedHashSet<Television>();// LinkedHashSet with Television class
		TVSet.add(new Television("LG", "LED", true, 150000));
		TVSet.add(new Television("Sony", "Plasma", true, 300000));
		TVSet.add(new Television("Thomson", "LCD", false, 18000));
		TVSet.add(new Television("Sony", "Plasma", true, 300000));
		TVSet.add(new Television("Thomson", "LCD", false, 18000));
		for (Television tv : TVSet) {
			System.out.println(tv);
		}
		
		System.out.println();
		Set<School> sch = new LinkedHashSet<School>();// LinkedHashSet with School class
		sch.add(new School("HMS", "Dadour", "Mandi", 3));
		sch.add(new School("GIPS", "Nerchowk", "Mandi", 2));
		sch.add(new School("MPS", "SNR", "Mandi", 1));
		sch.add(new School("HMS", "Dadour", "Mandi", 1));
		sch.add(new School("GIPS", "Nerchowk", "Mandi", 2));
		for (School scho : sch) {
			System.out.println(scho);
		}

	}
}
