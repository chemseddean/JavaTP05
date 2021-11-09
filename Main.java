import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car a = new Car("Audi",10000);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",9000);
		Car d = a;
//		System.out.println(a==b);
//		System.out.println(b==c);
//		System.out.println(a==d);
//		System.out.println(a.equals(b));
//		System.out.println(b.equals(c));
//		System.out.println(a.equals(d));
		
		ArrayList<Car> list = new ArrayList<>();
		list.add(a);
		list.add(b);
//		System.out.println(list.indexOf(a));
//		System.out.println(list.indexOf(b));
//		System.out.println(list.indexOf(c));
//		System.out.println(b.equals(c));
		
		
//		HashSet<Car> set = new HashSet<Car>();
//		set.add(b);
//		System.out.println(c);
		
		Garage garage1 = new Garage();
		 Garage garage2 = new Garage();

		 Car car1 = new Car("BMW",  90000);
		 Car car2 = new Car("Lada", 6500, 2);
		 Car car3 = new Car("Lada",  5500, 1);
		 Bike bike1 = new Bike("Scott");
		 Bike bike2 = new Bike("Merlin",new Discount(50));
		 Bike bike3 = new Bike("Merlin");
		 
		 garage1.add(car1);
		 garage1.add(bike1);
		 garage1.add(car2);
		 garage1.add(bike2);
		 garage1.add(car3);        
		 garage1.add(bike3);
		 
		 garage2.add(bike1);
		 garage2.add(car1);    
		 garage2.add(car3); 
		 garage2.add(car2);
		 garage2.add(bike3);
		 garage2.add(bike2);   
		 
		 System.out.println("Garage 1 :" + garage1);
		 System.out.println(garage2.equals(garage1));
		
	}

}
