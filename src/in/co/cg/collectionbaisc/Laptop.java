package in.co.cg.collectionbaisc;

public class Laptop {
	String company, model, os, processor;

	// Constructor with parameters company,model,os,processor
	public Laptop(String company, String model, String os, String processor) {
		this.company = company;
		this.model = model;
		this.os = os;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "company=" + company + ", model=" + model + ", os=" + os + ", processor=" + processor;
	}

	// HashCode Overrided
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		Laptop other = (Laptop) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

}
