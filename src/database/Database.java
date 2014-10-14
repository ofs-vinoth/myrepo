package database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Database {
	public static Statement getStatement() throws IOException,ClassNotFoundException {
		try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String dataBase = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
				Connection connection = DriverManager.getConnection(dataBase,
														     "system","system");
				Statement statement = connection.createStatement();
				return statement;
		}
		catch (Exception e) {
			return null;
		}

	}
}
