package by.matmux.bean;

public class Hotel {
    private String meals;
    private int rating;
    private Room room;

    public Hotel() {
    }

    public String getMeals() {
        return meals;
    }

    public void setMeals(String meals) {
        this.meals = meals;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

	@Override
	public String toString() {
		return "Hotel: meals=" + meals + ", rating=" + rating + ", room=" + room;
	}
    
}
