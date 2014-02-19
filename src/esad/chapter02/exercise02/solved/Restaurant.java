package esad.chapter02.exercise02.solved;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

class Restaurant extends Account {
	// the string "Rest" is concated with the restaurant ID to
	// form the key.
	final static String RestaurantIDText = "Rest";
	String website;
	String addressInChinese;
	String addressInEnglish;
	// the restaurant would like to update its fax # with this. After it is
	// confirmed, it will be stored in Account. Before that, it is stored
	// here.
	
	String numb_newfax;
	boolean has_NewFax = false;
	List holidays; 
	String restaurantCategoryId;
	// a list of business session. Each business session is an array
	// of two times. The first time is the start time. The second time
	// is the end time. The restaurant is open for business in each
	// session.
	List businessHours; 

	void addHoliday(int year, int month, int day) {
		if (year < 1900)
			year += 1900;
		Calendar aHoliday = (new GregorianCalendar(year, month, day, 0, 0, 0));
		holidays.add(aHoliday);
	}

	public boolean addBsHour(int fromHr, int fromMin, int toHr, int toMin) {
		int fMin = fromHr * 60 + fromMin; // start time in minutes.
		int tMin = toHr * 60 + toMin; // end time in minutes.
		// make sure both times are valid and the start time is earlier
		// than the end time.
		if (fMin > 0 && fMin <= 1440 && tMin > 0 && tMin <= 1440 && fMin < tMin) {
			GregorianCalendar bs[] = { new GregorianCalendar(1900, 1, 1, fromHr, fromMin, 0), new GregorianCalendar(1900, 1, 1, toHr, toMin, 0) };
			businessHours.add(bs);
			return true;
		} else {
			return false;
		}
	}
}
