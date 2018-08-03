package in.co.cg.test;

import java.util.*;

import in.co.cg.collectionbaisc.Car;
import in.co.cg.collectionbaisc.CellPhone;
import in.co.cg.collectionbaisc.Laptop;
import in.co.cg.collectionbaisc.School;
import in.co.cg.collectionbaisc.Television;

public class Test2 {
	public static void main(String[] args) {

		List<Car> carList = new ArrayList<Car>();// Arraylist Set with Car class
		carList.add(new Car("maruti", "hondcacity", 2016, 700000));
		carList.add(new Car("Hyundai", "Santro", 2012, 400000));
		carList.add(new Car("Hyundai", "Santro", 2012, 400000));
		for (Car ca : carList) {
			System.out.println(ca);
		}
		
		System.out.println();
		List<CellPhone> cellList = new ArrayList<CellPhone>();// Arraylist Set with CellPhone class
		cellList.add(new CellPhone("Samsung", "S7", "edge display", "Android", 35000));
		cellList.add(new CellPhone("Apple", "X", "Notch display", "ios", 35000));
		cellList.add(new CellPhone("Samsung", "S7", "edge display", "Android", 35000));
		for (CellPhone cellp : cellList) {
			System.out.println(cellp);
		}
		
		System.out.println();
		List<Laptop> laptopList = new ArrayList<Laptop>(); // Arraylist Set with Laptop class
		laptopList.add(new Laptop("Dell", "Inspiron-15", "windows", "i7"));
		laptopList.add(new Laptop("HP", " UB", "DOS", "i8"));
		laptopList.add(new Laptop("Apple", "macbookAir", "MacOS", "i3"));
		for (Laptop lap : laptopList) {
			System.out.println(lap);
		}
		
		System.out.println();
		List<Television> TVList = new ArrayList<Television>();// Arraylist Set with Television class
		TVList.add(new Television("LG", "LED", true, 150000));
		TVList.add(new Television("Sony", "Plasma", true, 300000));
		TVList.add(new Television("Thomson", "LCD", false, 18000));
		for (Television tv : TVList) {
			System.out.println(tv);
		}
		
		System.out.println();
		List<School> sch = new ArrayList<School>();// Arraylist Set with School class
		sch.add(new School("HMS", "Dadour", "Mandi", 3));
		sch.add(new School("GIPS", "Nerchowk", "Mandi", 2));
		sch.add(new School("MPS", "SNR", "Mandi", 1));
		for (School scho : sch) {
			System.out.println(scho);
		}

	}
}
