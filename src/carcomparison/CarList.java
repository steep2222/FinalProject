package carcomparison;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;

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
        lamborghini.setCarColorLight(new Color(52, 154, 255));
        lamborghini.setCarColorDark(new Color(0, 52, 154));
        lamborghini.addCarPics(new ImageIcon("C:\\Users\\Stephen Yamonaco\\Documents\\Neumont CCS\\Quater 2\\Both Sprints\\CSC150-SB\\CarComparison\\src\\carcomparison\\Lamborghini\\Lamborghini1.jpg"));
        lamborghini.addCarPics(new ImageIcon("C:\\Users\\Stephen Yamonaco\\Documents\\Neumont CCS\\Quater 2\\Both Sprints\\CSC150-SB\\CarComparison\\src\\carcomparison\\Lamborghini\\Lamborghini2.jpg"));
        lamborghini.addCarPics(new ImageIcon("C:\\Users\\Stephen Yamonaco\\Documents\\Neumont CCS\\Quater 2\\Both Sprints\\CSC150-SB\\CarComparison\\src\\carcomparison\\Lamborghini\\Lamborghini3.jpg"));
        System.out.println("\n" + koenigsegg);
        koenigsegg.addAttribute("Horsepower", "1,500 Hp");
        koenigsegg.addAttribute("Torque", "1,475 Lbs-ft");
        koenigsegg.addAttribute("Acceleration", "2.7 Sec.");
        koenigsegg.addAttribute("Top Speed", "249 Mph");
        koenigsegg.addAttribute("Weight", "3,589 Lbs");
        koenigsegg.setCarColorLight(new Color(52, 255, 204));
        koenigsegg.setCarColorDark(new Color(0, 154, 154));
        koenigsegg.addCarPics(new ImageIcon("C:\\Users\\Stephen Yamonaco\\Documents\\Neumont CCS\\Quater 2\\Both Sprints\\CSC150-SB\\CarComparison\\src\\carcomparison\\Koengisegg\\Koengisegg1.jpg"));
        koenigsegg.addCarPics(new ImageIcon("C:\\Users\\Stephen Yamonaco\\Documents\\Neumont CCS\\Quater 2\\Both Sprints\\CSC150-SB\\CarComparison\\src\\carcomparison\\Koengisegg\\Koengisegg2.jpg"));
        koenigsegg.addCarPics(new ImageIcon("C:\\Users\\Stephen Yamonaco\\Documents\\Neumont CCS\\Quater 2\\Both Sprints\\CSC150-SB\\CarComparison\\src\\carcomparison\\Koengisegg\\Koengisegg3.jpg"));
        System.out.println("\n" + pagani);
        pagani.addAttribute("Horsepower", "764 Hp");
        pagani.addAttribute("Torque", "738 Lbs-ft");
        pagani.addAttribute("Acceleration", "3 Sec.");
        pagani.addAttribute("Top Speed", "238 Mph");
        pagani.addAttribute("Weight", "2,282 Lbs");
        pagani.setCarColorLight(new Color(102, 0, 204));
        pagani.setCarColorDark(new Color(52, 0, 102));
        pagani.addCarPics(new ImageIcon("C:\\Users\\Stephen Yamonaco\\Documents\\Neumont CCS\\Quater 2\\Both Sprints\\CSC150-SB\\CarComparison\\src\\carcomparison\\Pagani\\Pagani1.jpg"));
        pagani.addCarPics(new ImageIcon("C:\\Users\\Stephen Yamonaco\\Documents\\Neumont CCS\\Quater 2\\Both Sprints\\CSC150-SB\\CarComparison\\src\\carcomparison\\Pagani\\Pagani2.jpg"));
        pagani.addCarPics(new ImageIcon("C:\\Users\\Stephen Yamonaco\\Documents\\Neumont CCS\\Quater 2\\Both Sprints\\CSC150-SB\\CarComparison\\src\\carcomparison\\Pagani\\Pagani3.jpg"));
        Car.compareCars(lamborghini, koenigsegg);
        return cars;
    }

}
