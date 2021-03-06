package vehicles;

public class Car {
    private String brand;
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void show (){
        System.out.println("To jest " + brand + " " + model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
