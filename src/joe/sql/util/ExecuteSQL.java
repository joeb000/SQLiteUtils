package joe.sql.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import joe.sql.statements.Insert;
import joe.sql.statements.Update;

public class ExecuteSQL {
	
	private static Connection c = null;
	private static Statement stmt = null;
	
	public ExecuteSQL(Connection con, Statement statement) throws ClassNotFoundException, SQLException{
		Class.forName("org.sqlite.JDBC");
		c = con;
		stmt = statement;
	}
	
	public ExecuteSQL() throws ClassNotFoundException, SQLException{
		Class.forName("org.sqlite.JDBC");
		c = DriverManager.getConnection("jdbc:sqlite:test.db");
		stmt = c.createStatement();
	}

	public static void executeInsert() throws SQLException{
		String[] str1 = {"",""};
		String[] str2 = {"",""};
		Insert ins = new Insert();
		stmt.executeUpdate(ins.insert("", str1, str2));
	}
	
	public static void executeUpdate(String tableName, String label, String value, String whereClause) throws SQLException{
		Update upd = new Update();
		stmt.executeUpdate(upd.update(tableName, label, value, whereClause));
	}
	
	public void commitAndClose() throws SQLException{
		stmt.close();
		c.commit();
		c.close();
	}

}
