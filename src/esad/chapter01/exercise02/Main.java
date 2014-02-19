package esad.chapter01.exercise02;


public class Main {	
	public static void main(String[] args) throws Exception {
		OrganizationsInDb organizations = new OrganizationsInDb();
		Organization o = new Organization();
		organizations.addOrganization(o);
		
		ParticipantsInDb participants = new ParticipantsInDb();
		Participant p = new Participant();
		participants.addParticipant(p);
	}
}
