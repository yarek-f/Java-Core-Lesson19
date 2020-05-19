package lgs.ua;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee e1 = new Employee("Misha", 237891, 4750.45);
		Methods.serialize(e1);
		Employee e1Deserialized = (Employee) Methods.deserialize();
		System.out.println(e1Deserialized);

		Employee e2 = new Employee("Olya", 225678, 3248.32);
		Methods.serialize(e2);
		Employee e2Deserialized = (Employee) Methods.deserialize();
		System.out.println(e2Deserialized);

		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(new Employee("Ruslan", 111452, 8123.56));
		list.add(new Employee("Borys", 173652, 2365.66));
		list.add(new Employee("Trofym", 278941, 6000.2));
		list.add(new Employee("Kyrylo", 445683, 2000.5));
		list.add(new Employee("Yolyk", 496323, 4444.44));

		Methods.serialize(list);
		List<Employee> listDeserialized = (List<Employee>) Methods.deserialize();
		System.out.println();
		System.out.println("Deserialized list:");
		for (Employee emp : listDeserialized)
			System.out.println(emp);

	}

}
