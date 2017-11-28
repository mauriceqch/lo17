package main.db;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fasterxml.jackson.core.JsonProcessingException;

import main.objectmapper.ObjectMapperProvider;

public class PostgresExecutor {
	public static void executeSelect(String query) {	
		ConnectionManager.doWithConnection((con) -> {
			try (Statement stmt = con.createStatement()) {
				// Send the query and bind to the result set
				ResultSet rs = stmt.executeQuery(query);
				while (rs.next()) {
					System.out.println(ObjectMapperProvider.get().writerWithDefaultPrettyPrinter().writeValueAsString(rs));
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
}
