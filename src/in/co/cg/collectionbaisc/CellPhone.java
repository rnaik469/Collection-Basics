package in.co.cg.collectionbaisc;

public class CellPhone {

	// Instance members
	String company, model, desc, os;
	double price;

	// Constructor with parameters company,model,desc,os,price
	public CellPhone(String company, String model, String desc, String os, double price) {

		this.company = company;
		this.model = model;
		this.desc = desc;
		this.os = os;
		this.price = price;
	}

	// HashCode Overrided
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((os == null) ? 0 : os.hashCode());
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
		CellPhone other = (CellPhone) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "company=" + company + ", model=" + model + ", desc=" + desc + ", os=" + os + ", price=" + price;
	}
}
