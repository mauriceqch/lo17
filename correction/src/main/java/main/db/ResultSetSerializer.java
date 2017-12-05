package main.db;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class ResultSetSerializer extends StdSerializer<ResultSet> {

	public ResultSetSerializer() {
		this(null);
	}

	public ResultSetSerializer(Class<ResultSet> t) {
		super(t);
	}

	@Override
	public void serialize(ResultSet resultSet, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
		jgen.writeStartArray();
		try {
			while (resultSet.next()) {
				jgen.writeStartObject();

				ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
				for(int idx = 1; idx<= resultSetMetaData.getColumnCount(); idx++) {
					jgen.writeStringField(resultSetMetaData.getColumnLabel(idx), resultSet.getString(idx).trim());
				}

				jgen.writeEndObject();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		jgen.writeEndArray();
	}
}
