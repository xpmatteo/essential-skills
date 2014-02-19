package esad.chapter03.aaa_intro.reports.refactored;

import java.util.Date;

abstract class UserAccount {
	String id;
	String name;
	String password;
	Date dateOfLastPasswdChange;

	abstract int getPasswordMaxAgeInDays();
	abstract boolean canPrintReport();
}

class NormalUserAccount extends UserAccount {
	int getPasswordMaxAgeInDays() {
		return 90;
	}

	boolean canPrintReport() {
		return true;
	}
}

class AdminUserAccount extends UserAccount {
	int getPasswordMaxAgeInDays() {
		return 30;
	}

	boolean canPrintReport() {
		return true;
	}
}

class GuestUserAccount extends UserAccount {
	int getPasswordMaxAgeInDays() {
		return Integer.MAX_VALUE;
	}

	boolean canPrintReport() {
		return false;
	}
}
