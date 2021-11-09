import java.util.Objects;

public class Bike implements IVehicule{
	private String marque;
	private int valeur = 100;
	private Discount discount; 
	@Override
	public Object getBrand() {
		// TODO Auto-generated method stub
		return marque;
	}
	public Bike(String marque) {
		this.marque = marque;
	}
	public Bike(String marque, Discount discount) {
		super();
		this.marque = marque;
		if(discount != null )
			this.setDiscount(discount);
	}
	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return valeur;
	}
	
	@Override
	public void setDiscount(Discount discount) {
			this.valeur = discount.getValue();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bike other = (Bike) obj;
		return Objects.equals(marque, other.marque);
	}
}
