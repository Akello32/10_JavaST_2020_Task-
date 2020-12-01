package by.matmux.bean;

import java.util.Calendar;
import java.util.Date;

/**
 *     <complexType name="Tourism">
 *         <sequence>
 *             <element name="date" type="date"/>
 *             <element name="days" type="int"/>
 *             <element name="cost" type="int"/>
 *             <element ref="tns:transport"/>
 *             <element name="hotel" type="tns:Hotel"/>
 *         </sequence>
 *         <attribute name="nameVoucher" type="ID" use="required"/>
 *         <attribute name="country">
 *             <simpleType>
 *                 <restriction base="string">
 *                     <enumeration value="ENG"/>
 *                     <enumeration value="RUS"/>
 *                     <enumeration value="BY"/>
 *                     <enumeration value="USA"/>
 *                     <enumeration value="UA"/>
 *                     <enumeration value="UK"/>
 *                 </restriction>
 *             </simpleType>
 *         </attribute>
 *     </complexType>
 */
public class Voucher {
    private String name;
    private Countries country;
    private Date date;
    private int days;
    private int cost;
    private Transport transport;
    private Hotel hotel;

    public Voucher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Countries getCountry() {
        return country;
    }

    public void setCountry(Countries country) {
        this.country = country;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
