package in.co.cg.collectionbaisc;

public class School {
	String name, city, schDis;
	int greatSchoolRanking;

	// constructor with parameters name,city,schDist,greatSchoolRanking
	public School(String name, String city, String schDis, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schDis = schDis;
		this.greatSchoolRanking = greatSchoolRanking;
	}

// HashCode Overrided
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((schDis == null) ? 0 : schDis.hashCode());
		return result;
	}

//equals Overrided
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schDis == null) {
			if (other.schDis != null)
				return false;
		} else if (!schDis.equals(other.schDis))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "name=" + name + ", city=" + city + ", schDis=" + schDis + ", greatSchoolRanking=" + greatSchoolRanking;
	}

}
