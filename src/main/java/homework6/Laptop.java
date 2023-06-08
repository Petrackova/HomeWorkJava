package homework6;

public class Laptop {
    Color color;
    Manufacturer manufacturer;
    public Laptop(Color color,Manufacturer manufacturer) {
        this.color = color;
        this.manufacturer = manufacturer;
    }

    public Color getColor() {
        return color;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
