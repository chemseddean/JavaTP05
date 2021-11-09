
public class Discount {
	private int value;
	
	public Discount(int value) {
		if (value < 0) {
			throw new IllegalArgumentException("");
		}
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Discount other = (Discount) obj;
		return value == other.value;
	}
}
