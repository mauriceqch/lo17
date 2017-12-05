package main.db;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fasterxml.jackson.core.JsonProcessingException;

import main.objectmapper.ObjectMapperProvider;

public class PostgresExecutor {
	public static String executeSelect(String query) {	
		return ConnectionManager.doWithConnection((con) -> {
			try (Statement stmt = con.createStatement()) {
				// Send the query and bind to the result set
				ResultSet rs = stmt.executeQuery(query);
				String ret = ObjectMapperProvider.get().writerWithDefaultPrettyPrinter().writeValueAsString(rs);
				System.out.println(ret);
				
				return ret;
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		});
	}
}
