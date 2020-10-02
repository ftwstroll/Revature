package eg2;

import java.util.HashSet;
import java.util.Set;

public class FlightMain {

	public static void main(String[] args) {
		
		Set<Flight> flightsList=new HashSet<>();
		flightsList.add(new Flight(900, "TV", 122.22, 2));
		flightsList.add(new Flight(120, "TV", 122.22, 2));
		flightsList.add(new Flight(100, "TV", 122.22, 2));
		flightsList.add(new Flight(100, "TV", 122.22, 2));
		flightsList.add(new Flight(100, "TV", 122.22, 2));
		flightsList.add(new Flight(101, "TV", 122.22, 2));
		
		System.out.println("Printing all product/s");
		printFlights(flightsList);

	}
	
	public static void printFlights(Set<Flight> flightsList) {
		for(Flight f:flightsList) {
			System.out.println(f);
		}
	}
	

}
