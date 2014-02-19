package esad.chapter02.bbb_intro_refactored;

public class Participant {

	public String getEnglishFullName() {
		return getELastName() + ", " + getEFirstName();
	}
	
	public String getChineseFullName() {
		return getCLastName() + getCFirstName();
	}

	public String getELastName() {
		throw new RuntimeException("Not yet implemented!");
	}

	public String getEFirstName() {
		throw new RuntimeException("Not yet implemented!");
	}

	public String getCFirstName() {
		throw new RuntimeException("Not yet implemented!");
	}

	public String getCLastName() {
		throw new RuntimeException("Not yet implemented!");
	}


}
