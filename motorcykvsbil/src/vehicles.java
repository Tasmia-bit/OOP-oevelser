public class vehicles {
    String brand;
    String model;
    String color;

    // created constructor
    public vehicles(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
//drive metode

    @Override
    public String toString() {
        return "vehicles{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

