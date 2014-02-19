package esad.chapter01;

import java.util.List;

public class BookRentals {
	private List rentals;

	// public String getCustomerName(String rentalId) {
	// for (int i = 0; i < rentals.size(); i++) {
	// BookRental rental = (BookRental) rentals.get(i);
	// if (rental.getId().equals(rentalId)) {
	// return rental.getCustomerName();
	// }
	// }
	// throw new RentalNotFoundException();
	// }
	//
	// public void deleteRental(String rentalId) {
	// for (int i = 0; i < rentals.size(); i++) {
	// BookRental rental = (BookRental) rentals.get(i);
	// if (rental.getId().equals(rentalId)) {
	// rentals.remove(i);
	// return;
	// }
	// }
	// throw new RentalNotFoundException();
	// }

	public String getCustomerName(String rentalId) {
		int index = getRentalIndexById(rentalId);
		return ((BookRental) rentals.get(index)).getCustomerName();
	}

	public void deleteRental(String rentalId) {
		rentals.remove(getRentalIndexById(rentalId));
	}

	private int getRentalIndexById(String rentalId) {
		for (int i = 0; i < rentals.size(); i++) {
			BookRental rental = (BookRental) rentals.get(i);
			if (rental.getId().equals(rentalId)) {
				return i;
			}
		}
		throw new RentalNotFoundException();
	}

	public class RentalNotFoundException extends RuntimeException {
		// ...
	}
}
