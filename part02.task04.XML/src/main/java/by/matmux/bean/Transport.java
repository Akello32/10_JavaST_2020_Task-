package by.matmux.bean;

public abstract class Transport {
    private String brand;
    private int yearOfManufacture;

    public Transport() { }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

	@Override
	public String toString() {
		return ", brand=" + brand + ", yearOfManufacture=" + yearOfManufacture;
	}
   
}
