package by.matmux.bean;

public class Train extends Transport {
    private String railwayCar;

    public Train() {
    }

    public String getRailwayCar() {
        return railwayCar;
    }

    public void setRailwayCar(String railwayCar) {
        this.railwayCar = railwayCar;
    }

	@Override
	public String toString() {
		return "Train: railwayCar=" + railwayCar + super.toString();
	}
    
}
