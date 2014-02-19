package esad.chapter02.aaa_intro;

// It stores the information of a participant to be printed on his badge.
public class Badge {
	String pid; // participant ID
	String engName; // participant's full name in English
	String chiName; // participant's full name in Chinese
	String engOrgName; // name of the participant's organization in English
	String chiOrgName; // name of the participant's organization in Chinese
	String engCountry; // the organization's country in English
	String chiCountry; // the organization's country in Chinese
	
	// ***********************
	// constructor.
	// The participant ID is provided. It then loads all the info from the DB.
	// ***********************
	public Badge(String pid) {
		this.pid = pid;
		// ***********************
		// get the participant's full names.
		// ***********************
		ParticipantsInDb partsInDB = ParticipantsInDb.getInstance();
		Participant part = partsInDB.locateParticipant(pid);
		// ...
		if (part != null) {
			// get the participant's full name in English.
			engName = part.getELastName() + ", " + part.getEFirstName();
			// get the participant's full name in Chinese.
			chiName = part.getCLastName() + part.getCFirstName();
			// ***********************
			// get the organization's name and country.
			// ***********************
			OrganizationsInDb orgsInDB = OrganizationsInDb.getInstance();
			// find the ID of the organization employing this participant.
			String oid = orgsInDB.getOrganization(pid);
			if (oid != null) {
				Organization org = orgsInDB.locateOrganization(oid);
				engOrgName = org.getEName();
				chiOrgName = org.getCName();
				engCountry = org.getEAddress().getCountry();
				chiCountry = org.getCAddress().getCountry();
			}
		}
	}
	// ...
}
