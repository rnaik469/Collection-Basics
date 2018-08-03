package in.co.cg.collectionbaisc;

public class Car implements Comparable<Car> {

	String make, model;
	int year;
	double price;

	// Constructor with parameter make,model,year,price
	public Car(String make, String model, int year, double price) {

		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	@Override // HashCode for make and model
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override // equal check for make and model
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "make=" + make + ", model=" + model + ", year=" + year + ", price=" + price;
	}

	@Override
	public int compareTo(Car car) {
		int check = make.compareTo(car.make);
		return check;
	}

}
