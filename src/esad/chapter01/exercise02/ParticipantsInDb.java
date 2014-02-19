package esad.chapter01.exercise02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ParticipantsInDb {
	Connection db;

	ParticipantsInDb() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		db = DriverManager.getConnection(
				"jdbc:postgresql://myhost/ConferenceDB", 
				"PaulChan", 
				"myP@ssword");
	}

	void addParticipant(Participant part) throws SQLException {
		PreparedStatement st = db.prepareStatement("INSERT INTO participants VALUES (?,?,?,?,?,?,?)");
		try {
			st.setString(1, part.getId());
			st.setString(2, part.getEFirstName());
			st.setString(3, part.getELastName());
			// ...
			st.executeUpdate();
		} finally {
			st.close();
		}
	}
}
