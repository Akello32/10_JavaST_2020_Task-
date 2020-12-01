package by.matmux.bean;

public class Airplane extends Transport {
    private int seat;
    private String airlines;

    public Airplane() {
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getAirlines() {
        return airlines;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

	@Override
	public String toString() {
		return "Airplane: seat=" + seat + ", airlines=" + airlines + super.toString();
	}
    
}
