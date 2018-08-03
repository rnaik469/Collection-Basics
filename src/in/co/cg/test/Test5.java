package in.co.cg.test;

import java.util.Set;
import java.util.TreeSet;

import in.co.cg.collectionbaisc.Car;

public class Test5 {

	public static void main(String[] args) {

		System.out.println("\n....TreeSet....Car");
		Set<Car> carSet = new TreeSet<Car>();// LinkedHashSet with Car class
		carSet.add(new Car("maruti", "hondcacity", 2016, 700000));
		carSet.add(new Car("Hyundai", "Santro", 2012, 400000));
		carSet.add(new Car("Hyundai", "Santro", 2018, 500000));
		carSet.add(new Car("Cheverlet", "camaro", 2018, 5000000));
		for (Car ca : carSet) {
			System.out.println(ca);
		}

	}

}
