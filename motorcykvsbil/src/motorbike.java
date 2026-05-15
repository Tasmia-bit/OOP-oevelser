public class motorbike extends vehicles {
    Boolean anotherAttribute;

    public motorbike(String brand, String model, String color, Boolean anotherAttribute) {
        super(brand, model, color);
        this.anotherAttribute = anotherAttribute;
    }

    @Override
    public String toString() {

    }
}


