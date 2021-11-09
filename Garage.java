import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Garage {
	public List<IVehicule> garage = new ArrayList<>();
	public static int cpt = 0; 
	public final int id; 
	
	
	public Garage() {
		this.id = cpt;
	}
	
	public void addCar(Car c) {
		Objects.requireNonNull(c);
		garage.add(c);
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder s= new StringBuilder();
		for(IVehicule c : garage) {
			s.append(c.toString());
		}
		return s.toString();
	}
	
	public int valGarage() {
		int somme = 0;
		for(IVehicule c : garage) {
			somme=+(c.getValue());
		}
		return somme;
	}
	
	public IVehicule firstCarByBrand(String brand) {
		Objects.requireNonNull(brand);
		for (IVehicule c : garage) {
			if (c.getBrand() == (brand)) {
				return c; 
			}
		}
		return null;
	}
	
	public void remove(IVehicule c) {
		for (int i = 0; i < garage.size(); i++) {
			if (c.equals(garage.get(i))) {
				garage.remove(c);
				return;
			}
		}
		throw new IllegalStateException("");
	}
	
	public void protectionism(String brand) {
		for (Iterator<IVehicule> iterator = garage.iterator(); iterator.hasNext(); ) {
		    IVehicule value = iterator.next();
		    if (value.getBrand() == brand) {
		        iterator.remove();
		    }
		}
	}

	public void add(IVehicule v1) {
		// TODO Auto-generated method stub
		Objects.requireNonNull(v1);
		garage.add(v1);
		Collections.sort((List) garage);
	}

	public int getValue() {
		// TODO Auto-generated method stub
		int result = 0;
		
		for (IVehicule v : garage) {
			result+=v.getValue();
		}
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		return garage.equals(obj);
	}
}











