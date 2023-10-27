package web.model;

public class Car {

    private double engine;
    private String model;
    private int mileage;

    public Car(double engine, String model, int mileage) {
        this.engine = engine;
        this.model = model;
        this.mileage = mileage;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
