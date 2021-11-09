import java.util.Objects;

public class Car implements IVehicule{
	private final String brand;
	private int value; 
	private int vetuste = 0;
	private Discount discount;
	
	public Car(String brand, int value) {
		if (value >= 0) 
			this.value = value;
		else {
			throw new IllegalArgumentException();
		}
		if (brand != null) 
			this.brand = brand;
		else {
			throw new NullPointerException();
		}
		
		 
	}
	
	public Car(String brand, int value, Discount discount) {
		if (value >= 0) 
			this.value = value;
		else {
			throw new IllegalArgumentException();
		}
		if (brand != null) 
			this.brand = brand;
		else {
			throw new NullPointerException();
		}
		
		if(discount != null )
			this.setDiscount(discount);
	}
	
	public Car(String brand, int value, int vetuste) {
		this(brand, value);
		
		if (vetuste <= 10) //Hypothese
			this.vetuste = vetuste;
		else {
			throw new IllegalArgumentException();
		}
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand) && value == other.value && vetuste == other.vetuste;
	}

	public String getBrand() {
		return brand;
	}

	public int getValue() {
		return this.value - this.vetuste * 1000;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", value=" + value + "]";
	}
	
	@Override
	public void setDiscount(Discount discount) {
			this.value = discount.getValue();
	}
	
}


















