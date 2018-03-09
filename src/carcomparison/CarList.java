package carcomparison;

import java.util.ArrayList;
import java.util.HashMap;

public class CarList {
	
	public static ArrayList<Car> listOfCars() {
		ArrayList<Car> cars = new ArrayList<Car>();
		Car lamborghini = new Car("Lamborghini Aventador S Roadster");
		Car koenigsegg = new Car("Koenigsegg Regera");
		Car pagani = new Car("Pagani Huayra Roadster");
		cars.add(lamborghini);
		cars.add(koenigsegg);
		cars.add(pagani);
		System.out.println(lamborghini);
		lamborghini.addAttribute("Horsepower", "729 Hp");
		lamborghini.addAttribute("Torque", "507 Lbs-ft");
		lamborghini.addAttribute("Acceleration", "3 Sec.");
		lamborghini.addAttribute("Top Speed", "217 Mph");
		lamborghini.addAttribute("Weight", "3,583 Lbs");	
		System.out.println("\n" + koenigsegg);
		koenigsegg.addAttribute("Horsepower", "1,500 Hp");
		koenigsegg.addAttribute("Torque", "1,475 Lbs-ft");
		koenigsegg.addAttribute("Acceleration", "2.7 Sec.");
		koenigsegg.addAttribute("Top Speed", "249 Mph");
		koenigsegg.addAttribute("Weight", "3,589 Lbs");
		System.out.println("\n" + pagani);
		pagani.addAttribute("Horsepower", "764 Hp");
		pagani.addAttribute("Torque", "738 Lbs-ft");
		pagani.addAttribute("Acceleration", "3 Sec.");
		pagani.addAttribute("Top Speed", "238 Mph");
		pagani.addAttribute("Weight", "2,282 Lbs");
		Car.compareCars(lamborghini, koenigsegg);
		return cars;
		}
	
	
	
}
