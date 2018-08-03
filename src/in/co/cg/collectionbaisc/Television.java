package in.co.cg.collectionbaisc;

public class Television {
	// HashCode Overrided
	String Company, type;
	boolean ThreedEn;
	int price;

	// Constructor with company stupe threeEn,price
	public Television(String company, String type, boolean threedEn, int price) {
		super();
		Company = company;
		this.type = type;
		ThreedEn = threedEn;
		this.price = price;
	}

	// HashCode Overrided
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Company == null) ? 0 : Company.hashCode());
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	// equals Overrided
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Television other = (Television) obj;
		if (Company == null) {
			if (other.Company != null)
				return false;
		} else if (!Company.equals(other.Company))
			return false;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Company=" + Company + ", type=" + type + ", ThreedEn=" + ThreedEn + ", price=" + price;
	}

}
