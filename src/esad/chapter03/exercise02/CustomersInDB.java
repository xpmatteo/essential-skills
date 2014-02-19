package esad.chapter03.exercise02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomersInDB {
	Connection conn;

	@SuppressWarnings("unused")
	Customer getCustomer(String IDNumber) throws SQLException {
		PreparedStatement st = conn.prepareStatement("select * from customer where ID=?");
		Customer customer = new Customer();
		try {
			st.setString(1, IDNumber.replace('-', ' ').replace('(', ' ').replace(')', ' ').replace('/', ' '));
			ResultSet rs = st.executeQuery();
			// ...
		} finally {
			st.close();
		}
		return customer;
	}

	void addCustomer(Customer customer) throws SQLException {
		PreparedStatement st = conn.prepareStatement("insert into customer values(?,?,?,?)");
		try {
			st.setString(1, customer.getIDNumber().replace('-', ' ').replace('(', ' ').replace(')', ' ').replace('/', ' '));
			st.setString(2, customer.getName());
			// ...
			st.executeUpdate();
			// ...
		} finally {
			st.close();
		}
	}
}
