package finalTom1;

public class Hotel { // a
	private int numOfUsedRooms;
	private Room[][] allRooms;

	final int MAX_BEDS = 4;
	final int MIN_BEDS = 1;

	public Hotel(int numOfFloors, int numOfRoomPerFloor) {
		this.allRooms = new Room[numOfFloors][numOfRoomPerFloor];
		this.numOfUsedRooms = 0;

		for (int i = 0; i < allRooms.length; i++) {
			for (int j = 0; j < allRooms[i].length; j++) {
				allRooms[i][j] = new Room((MIN_BEDS + (int) (Math.random() * (MAX_BEDS - MIN_BEDS + 1))), null, 0);
			}
		}

	}

	public int getNumOfUsedBeds() {
		return numOfUsedRooms;
	}

	public void setNumOfUsedBeds(int numOfUsedBeds) {
		this.numOfUsedRooms = numOfUsedBeds;
	}

	public Room[][] getAllRooms() {
		return allRooms;
	}

	public void setAllRooms(Room[][] allRooms) {
		this.allRooms = allRooms;
	}

	public int putGuestInRoomArr(Guest[] guests) {// b
		for (int j = 0; j < allRooms.length; j++) {
			for (int i = 0; i < allRooms[j].length; i++) {
				if (allRooms[j][i].getAllGuests() == null && allRooms[j][i].getNumOfBeds() >= guests.length) {
					allRooms[j][i].setAllGuests(guests);
					return (j * 100) + i;
				}
			}
		}
		return -1;
	}

	public int roomByPassport(int PassportNumber) {// c
		for (int i = 0; i < allRooms.length; i++) {
			for (int j = 0; j < allRooms[i].length; j++) {
				Guest[] guests= allRooms[i][j].getAllGuests();
				for(int k=0; k<guests.length; k++) {
					if (PassportNumber== guests[k].getPassportNumber()) {
						
						return i * 100 + j;
					}
				}
				
			}
		}
			return -1;
	}

	public int mostAvailableRoomsPerFloor() {// d
		int j, notUsedRooms = 0;
		for (j = 0; j < allRooms[j].length; j++) {
			for (int i = 0; i < allRooms[i].length; i++) {
				if (allRooms[i] == null) {
					notUsedRooms++;
				}
				if (notUsedRooms > i) {
					j++;
				}

			}
		}
		return j;
	}
}
