package main.objectmapper;

import java.sql.ResultSet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import main.db.ResultSetSerializer;

public class ObjectMapperProvider {
	public static ObjectMapper get() {
		ObjectMapper mapper = new ObjectMapper();
		
		SimpleModule module = new SimpleModule();
		module.addSerializer(ResultSet.class, new ResultSetSerializer());
		mapper.registerModule(module);

		return mapper;
	}
}
