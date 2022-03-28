package finalTom1;

import java.util.Scanner;

import finalTom1.Guest;
import finalTom1.Room;
import finalTom1.Hotel;

public class main {

	public static void main(String[] args) {// e
		Hotel hotel1 = new Hotel(9, 99);
		int userChoose = 0;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println(
					"Welcome to Ariel University hotel! please choose one of the options: \n 1) Sign in the hotel. \n 2) Find a guest by passport number. \n 3) Show the guests by room. \n 4) Show the most empty floor.");
			userChoose = input.nextInt();

			switch (userChoose) {
			case 1: {
				int h, i, j = 0, numOfGuests, passportNumber = 0;
				String name = null;
				System.out.println("Choose how many guests will be in the room (Between 1-4).");
				numOfGuests = input.nextInt();
				Guest[] guest1 = new Guest[numOfGuests];
				System.out.println("Sign the guests's name and passport number.");
				for (h = 0; h < guest1.length; h++) {
					input.nextLine();
					name = input.nextLine();
					passportNumber = input.nextInt();
					guest1[h] = new Guest(name, passportNumber);

				}
				System.out.printf("%03d\n", hotel1.putGuestInRoomArr(guest1));

			}
				break;
			case 2: {
				int newPassportNumber = 0;
				newPassportNumber = input.nextInt();
				System.out.println(hotel1.roomByPassport(newPassportNumber));
			}
				break;
			case 3: {
				int m;
				for (m = 0; m < hotel1.getAllRooms().length; m++)
					;
				if (hotel1.getAllRooms() != null) {
					System.out.println("The details of the guests in room " + m + " are " + hotel1.getAllRooms());
				}
			}
				break;
			case 4: {
				System.out.println("The most empty floor is " + hotel1.mostAvailableRoomsPerFloor());
			}
			}

		} while (userChoose != 0);

	}
}
