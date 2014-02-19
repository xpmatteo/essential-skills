package esad.chapter01.exercise04;

import static org.junit.Assert.*;


class ParticipantsInDbTest {
	ParticipantsInDb p;

	void setUp() {
		p = ParticipantsInDb.getInstance();
	}

	void tearDown() {
		ParticipantsInDb.freeInstance();
	}

	void testAdd() throws Exception {
		Participant part1 = new Participant("ABC001", "Kent", "Tong", true, "Manager");
		p.deleteAllParticipants();
		p.addParticipant(part1);
		assertEquals(p.getCount(), 1);
	}

	void testAdd2() throws Exception {
		Participant part1 = new Participant("ABC001", "Kent", "Tong", true, "Manager");
		Participant part2 = new Participant("ABC003", "Paul", "Chan", true, "Manager");
		p.deleteAllParticipants();
		p.addParticipant(part1);
		p.addParticipant(part2);
		assertEquals(p.getCount(), 2);
	}

	void testEnum() throws Exception {
		Participant part1 = new Participant("ABC001", "Kent", "Tong", true, "Manager");
		Participant part2 = new Participant("ABC003", "Paul", "Chan", true, "Manager");
		p.deleteAllParticipants();
		p.addParticipant(part2);
		p.addParticipant(part1);
		ParticipantEnumeratorById penum = new ParticipantEnumeratorById();
		assertTrue(penum.hasNext());
		assertTrue(penum.next().equals(part1));
		assertTrue(penum.hasNext());
		assertTrue(penum.next().equals(part2));
		assertTrue(!penum.hasNext());
	}
}
