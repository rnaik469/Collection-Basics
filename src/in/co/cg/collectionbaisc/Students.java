package in.co.cg.collectionbaisc;

public class Students implements Comparable<Students> {
	public String name;

	// Constructor with parameter namw
	public Students(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "name=" + name;
	}

	// HashCode Overrided
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Students other = (Students) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Students s) {
		int check = name.compareTo(s.name);
		return check;
	}

}
