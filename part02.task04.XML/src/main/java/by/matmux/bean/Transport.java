package by.matmux.bean;

/**
 *     <complexType name="Transport">
 *         <sequence>
 *             <element name="brand" type="string"/>
 *             <element name="yearOfManufacture" type="string"/>
 *         </sequence>
 *     </complexType>
 */
public class Transport {
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
}
