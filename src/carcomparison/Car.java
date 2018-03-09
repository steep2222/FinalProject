package carcomparison;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;

public class Car {

    private String name;
    private HashMap<String, String> attributes = new HashMap<>();
    private Color carColorLight;
    private Color carColorDark;
    private ArrayList<ImageIcon> carPics = new ArrayList<ImageIcon>();

    public HashMap<String, String> getAttributes() {

        return attributes;
    }

    public void addAttribute(String type, String value) {

        attributes.put(type, value);

    }

    public ArrayList<ImageIcon> getCarPics() {
        return carPics;
    }

    public void addCarPics(ImageIcon carPic) {
        carPics.add(carPic);
    }

    public void setCarColorLight(Color carColorLight) {
        this.carColorLight = carColorLight;
    }

    public Color getCarColorLight() {
        return carColorLight;
    }

    public void setCarColorDark(Color carColorDark) {
        this.carColorDark = carColorDark;
    }

    public Color getCarColorDark() {
        return carColorDark;
    }

    public String getAtrribute(String type) {

        return attributes.get(type);
    }

    public Car(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void compareCars(Car lamborghini, Car koenigsegg) {
        String horsepower;
        String topSpeed;
        horsepower = lamborghini.getAtrribute("Horsepower");
        topSpeed = lamborghini.getAtrribute("Top Speed");
        System.out.println(horsepower);
        System.out.println(topSpeed);
    }

    @Override
    public String toString() {
        return getName();
    }
}
