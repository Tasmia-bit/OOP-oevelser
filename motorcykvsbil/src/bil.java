public class bil extends vehicles {
    int trunkSize; // Uniq for cars

    public bil(String brand, String model, String color, int trunkSize) {
        super(brand, model, color);
        this.trunkSize = trunkSize;
    }

    public void PrintInfo() {


        System.out.println("---bil ---");
        System.out.println("the brand is" + brand);
        System.out.println("the model is" + model);
        System.out.println("the color is" + color);
        System.out.println("the seize is" + trunkSize);
    }

    @Override
    public String toString() {
        return "bil{" +
                "trunkSize=" + trunkSize +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}