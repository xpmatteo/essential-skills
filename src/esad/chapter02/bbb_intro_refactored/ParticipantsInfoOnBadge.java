package esad.chapter02.bbb_intro_refactored;

// It stores the information of a participant to be printed on his badge.
public class ParticipantsInfoOnBadge {
	String participantId; 
	String participantsEnglishFullName;
	String participantsChineseFullName;
	String organizationEnglishName;
	String organizationChineseName;
	String organizationCountryEnglishName; // the organization's country in English
	String organizationCountryChinesseName; // the organization's country in Chinese
	
	public ParticipantsInfoOnBadge(String participantId) {
		loadInfoFromDb(participantId);
	}
	// ...

	private void loadInfoFromDb(String participantId) {
		this.participantId = participantId;
		Participant aParticipant = getParticipantFullNames(participantId);
		if (aParticipant != null) {
			getOrganizationNamesAndCountry(participantId);
		}
	}

	private void getOrganizationNamesAndCountry(String participantId) {
		OrganizationsInDb orgsInDB = OrganizationsInDb.getInstance();
		// find the ID of the organization employing this participant.
		String oid = orgsInDB.getOrganization(participantId);
		if (oid != null) {
			Organization org = orgsInDB.locateOrganization(oid);
			organizationEnglishName = org.getEName();
			organizationChineseName = org.getCName();
			organizationCountryEnglishName = org.getEAddress().getCountry();
			organizationCountryChinesseName = org.getCAddress().getCountry();
		}
	}

	private Participant getParticipantFullNames(String participantId) {
		ParticipantsInDb participants = ParticipantsInDb.getInstance();
		Participant aParticipant = participants.locateParticipant(participantId);
		if (aParticipant != null) {
			participantsEnglishFullName = aParticipant.getEnglishFullName();
			participantsChineseFullName = aParticipant.getChineseFullName();
		}
		return aParticipant;
	}
}
