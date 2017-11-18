package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	//khong dung toi

	public static Connection getMyConnection() throws SQLException, ClassNotFoundException {
//		String hostName = "localhost";
//		String sqlInstanceName = "MSSSQLSERVER";
//		String database = "QLBanHang";
//		String userName ="sa" ;
//		String password = "1234";
		
		//Hoang Duy
		String hostName = "localhost";
		String sqlInstanceName = "SQLEXPRESS";
		String database = "QLBanHang";
		String userName = "sa";
		String password = "Tivippro1996uit";

		return getSQLServerConnection(hostName, sqlInstanceName, database, userName, password);
	}

	public static Connection getSQLServerConnection(String hostName, String sqlInstanceName, String database,
			String userName, String password) throws SQLException {

		// jdbc:sqlserver://ServerIp:1433/SQLEXPRESS;databaseName=QLBanHang
		String connectionURL = "jdbc:sqlserver://" + hostName + ":1433" + ";instance=" + sqlInstanceName
				+ ";databaseName=" + database;

		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}
}
