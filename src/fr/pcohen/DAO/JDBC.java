package fr.pcohen.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC {

	private static Statement  statement  = null;
	private static Connection connection = null;

	/**
	 * Initiate connexion to the database
	 * @throws SQLException
	 */
	public JDBC() throws SQLException {

		connection = DriverManager.getConnection("jdbc:mysql://localhost/devged" 
				+"?useLegacyDatetimeCode=false&serverTimezone=UTC"
				+"&user=DevGED&password=DevGED" );

		setStatement(connection.createStatement());

	}

	/**
	 * Close database connexion
	 * <br> closing Statement 
	 * <br> closing ResultSet
	 * @param resultSet (ResultSet)
	 */
	public static void jdbcCloseResultSet(ResultSet resultSet ) {

		try {
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Unable to close the database ResultSet");
			e.printStackTrace();
		} 
	}

	public static void jdbcCloseStatement(Statement statement) {

		try {
			statement.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println( "Unable to close the database Statement");
			e.printStackTrace();
		} 
	}

	public Statement getStatement() {
		return JDBC.statement;
	}

	private void setStatement(Statement statement) {
		JDBC.statement = statement;
	}


}