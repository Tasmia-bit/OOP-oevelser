public class bil {
    String brand;
    String model;
    String color;
    int year;
    double price;
    Boolean isElectric;

    public bil(String brand, String model, String color,
                int year, double price, Boolean isElectric)
    {
        this.brand =brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.isElectric = isElectric;
    }
    public void PrintInfo() {

        System.out.println("---bil ---");
        System.out.println("the brand is" + brand);
        System.out.println("the model is" + model);
        System.out.println("the color is" + color);
        System.out.println("the year is" + year);
        System.out.println("price of the car" + price);
        System.out.println("is it electric" + isElectric);
    }

//    public void dyt() {
//        System.out.println(brand + " siger: DYT DYT!");
//    }
}
