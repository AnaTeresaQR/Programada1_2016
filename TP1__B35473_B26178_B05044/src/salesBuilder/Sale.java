package salesBuilder;

/**
 * The sale object with its data, get and set
 *
 * @author Robert Sánchez, Edgardo Quirós, Ana Teresa Quesada.
 */
public class Sale {

    private String brand;
    private String model;
    private int year;
    private String carId;
    private String color;
    private String description;
    private int days;
    private int minOffer;

    public Sale() {
    }

    public Sale(String brand, String model, int year, String carId, String color, String description, int days, int minOffer) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.carId = carId;
        this.color = color;
        this.description = description;
        this.days = days;
        this.minOffer = minOffer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getMinOffer() {
        return minOffer;
    }

    public void setMinOffer(int minOffer) {
        this.minOffer = minOffer;
    }

    @Override
    public String toString() {
        return "\nSale{" + "brand: " + brand + ", model: " + model + ", year: " + year + ", carId: " + carId + ", color: " + color + ", description: " + description + ", days: " + days + ", minOffer: " + minOffer + '}';
    }

}
