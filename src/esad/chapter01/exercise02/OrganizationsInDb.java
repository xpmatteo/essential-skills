package esad.chapter01.exercise02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


class OrganizationsInDb {
	Connection db;

	OrganizationsInDb() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		db = DriverManager.getConnection(
				"jdbc:postgresql://myhost/ConferenceDB", 
				"PaulChan", 
				"myP@ssword");
	}

	void addOrganization(Organization o) throws SQLException {
		PreparedStatement st = db.prepareStatement("INSERT INTO organizations VALUES (?,?,?,?,?,?,?,?,?,?,)");
		try {
			st.setString(1, o.getId());
			st.setString(2, o.getEName());
			st.setString(3, o.getCName());
			// ...
			st.executeUpdate();
		} finally {
			st.close();
		}
	}
}
