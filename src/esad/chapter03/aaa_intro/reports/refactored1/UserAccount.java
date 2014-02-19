package esad.chapter03.aaa_intro.reports.refactored1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class UserAccount {
	SecurityPolicy securityPolicy;
	String id;
	String name;
	String password;
	Date dateOfLastPasswdChange;

	SecurityPolicy getSecurityPolicy() {
		return securityPolicy;
	}

	public boolean checkPassword(String password) {
		// ...
		return true;
	}
}

class SecurityPolicy {
	int passwordMaxAgeInDays;
	boolean allowedToPrintReport;

	SecurityPolicy(int passwordMaxAgeInDays, boolean allowedToPrintReport) {
		this.passwordMaxAgeInDays = passwordMaxAgeInDays;
		this.allowedToPrintReport = allowedToPrintReport;
	}

	int getPasswordMaxAgeInDays() {
		return passwordMaxAgeInDays;
	}

	boolean canPrintReport() {
		return allowedToPrintReport;
	}

	static SecurityPolicy normalUserType = new SecurityPolicy(90, true);
	static SecurityPolicy adminUserType = new SecurityPolicy(30, true);
	static SecurityPolicy guestUserType = new SecurityPolicy(Integer.MAX_VALUE, false);
}

class InventoryApp {
	void login(UserAccount userLoggingIn, String password) {
		if (userLoggingIn.checkPassword(password)) {
			GregorianCalendar today = new GregorianCalendar();
			GregorianCalendar expiryDate = getAccountExpiryDate(userLoggingIn);
			if (today.after(expiryDate)) {
				// prompt the user to change password
				// ...
			}
		}
	}

	GregorianCalendar getAccountExpiryDate(UserAccount account) {
		int passwordMaxAgeInDays = getPasswordMaxAgeInDays(account);
		GregorianCalendar expiryDate = new GregorianCalendar();
		expiryDate.setTime(account.dateOfLastPasswdChange);
		expiryDate.add(Calendar.DAY_OF_MONTH, passwordMaxAgeInDays);
		return expiryDate;
	}

	int getPasswordMaxAgeInDays(UserAccount account) {
		return account.getSecurityPolicy().getPasswordMaxAgeInDays();
	}

	void printReport(UserAccount currentUser) {
		boolean canPrint;
		canPrint = currentUser.getSecurityPolicy().canPrintReport();
		if (!canPrint) {
			throw new SecurityException("You have no right");
		}
		// print the report.
	}
}
