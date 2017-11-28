package main.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.function.Consumer;

import main.config.ConfigManager;
import main.config.DbConfig;

public class ConnectionManager {
	private static final DbConfig dbConfig = ConfigManager.getDbConfig();

	public static void doWithConnection(Consumer<Connection> consumer) {
		// Establish Connection to the database at URL with usename and password
		try (Connection connection = DriverManager.getConnection(
					dbConfig.getUrl(),
					dbConfig.getUsername(),
					dbConfig.getPassword()
		)) {

			consumer.accept(connection);

		} catch(SQLException ex) {
			// print out decent erreur messages
			System.err.println("==> SQLException: ");
			while (ex != null) {
				System.out.println("Message:   " + ex.getMessage ());
				System.out.println("SQLState:  " + ex.getSQLState ());
				System.out.println("ErrorCode: " + ex.getErrorCode ());
				ex = ex.getNextException();
				System.out.println("");
			}
		}
	}
}
