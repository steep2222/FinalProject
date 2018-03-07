package carcomparison;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		Lamborghini lambo = new Lamborghini("Lamborghini Aventador S Roadster");
		Koenigsegg koen = new Koenigsegg("Koenigsegg Regera");
		Pagani pag = new Pagani("Pagani Huayra Roadster");
		System.out.println(lambo);
		HashMap<String, String> lamborghini = new HashMap<>();
		lamborghini.put("Horsepower: ", "729 Hp");
		lamborghini.put("Torque: ", "507 Lbs-ft");
		lamborghini.put("Acceleration (0-60 Mph): ", "3 Sec.");
		lamborghini.put("Top Speed: ", "217 Mph");
		lamborghini.put("Weight: ", "3,583 Lbs");
		for (String string : lamborghini.keySet()) {
			System.out.print(string);
			System.out.println(lamborghini.get(string));

		}
		System.out.println("\n" + koen );
		HashMap<String, String> koenigsegg = new HashMap<>();
		koenigsegg.put("Horsepower: ", "1,500 Hp");
		koenigsegg.put("Torque: ", "1,475 Lbs-ft");
		koenigsegg.put("Acceleration (0-60 Mph): ", "2.7 Sec.");
		koenigsegg.put("Top Speed: ", "249 Mph");
		koenigsegg.put("Weight: ", "3,589 Lbs");
		for (String string : koenigsegg.keySet()) {
			System.out.print(string);
			System.out.println(koenigsegg.get(string));

		}
		System.out.println("\n" + pag );
		HashMap<String, String> pagani = new HashMap<>();
		pagani.put("Horsepower: ", "764 Hp");
		pagani.put("Torque: ", "738 Lbs-ft");
		pagani.put("Acceleration (0-60 Mph): ", "3 Sec.");
		pagani.put("Top Speed: ", "238 Mph");
		pagani.put("Weight: ", "2,282 Lbs");
		for (String string : pagani.keySet()) {
			System.out.print(string);
			System.out.println(pagani.get(string));

		}

	}
	
	public void compareCars() {
		
	}
	
	
}
