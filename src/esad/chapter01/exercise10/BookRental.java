package esad.chapter01.exercise10;

import java.util.Date;

// Suppose that there are two kinds of rentals: book and movie. 
// Point out and remove the duplication in the code:

public class BookRental {
	protected String bookTitle;
	protected String author;
	protected Date rentDate;
	protected Date dueDate;
	protected double rentalFee;

	public boolean isOverdue() {
		Date now = new Date();
		return dueDate.before(now);
	}

	public double getTotalFee() {
		return isOverdue() ? 1.2 * rentalFee : rentalFee;
	}
}

class MovieRental {
	protected String movieTitle;
	protected int classification;
	protected Date rentDate;
	protected Date dueDate;
	protected double rentalFee;

	public boolean isOverdue() {
		Date now = new Date();
		return dueDate.before(now);
	}

	public double getTotalFee() {
		return isOverdue() ? 1.3 * rentalFee : rentalFee;
	}
}
