package by.matmux.bean;

import java.util.Calendar;
import java.util.Date;

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

	@Override
	public String toString() {
		return "\nVoucher name=" + name + ",\n country=" + country + ",\n date=" + date + ",\n days=" + days + ",\n cost=" + cost
				+ ",\n transport=" + transport + ",\n hotel=" + hotel;
	}
    
}
