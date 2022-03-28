package finalTom1;

public class Room {

	private int numOfBeds;
	private Guest[] allGuests;
	private int isGuestInRoom;

	public Room(int numOfBeds, Guest[] allGuests, int isGuestInRoom) {
		this.numOfBeds = numOfBeds;
		this.allGuests = allGuests;
		this.isGuestInRoom = isGuestInRoom;
	}

	public int getNumOfBeds() {
		return numOfBeds;
	}

	public void setNumOfBeds(int numOfBeds) {
		this.numOfBeds = numOfBeds;
	}

	public Guest[] getAllGuests() {
		return allGuests;
	}

	public void setAllGuests(Guest[] allGuests) {
		this.allGuests = allGuests;
	}

	public int getIsGuestInRoom(int PassportNumber) {
		return isGuestInRoom;
	}

	public void setIsGuestInRoom(int isGuestInRoom) {
		this.isGuestInRoom = isGuestInRoom;
	}

}