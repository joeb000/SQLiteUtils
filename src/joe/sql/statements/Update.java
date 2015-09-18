package joe.sql.statements;

public class Update {

	public String update(String tableName, String label, String value, String whereClause){


		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE ");
		sql.append(tableName);
		sql.append(" set ");

		sql.append(label);
		sql.append(" = ");
		sql.append(value);
		sql.append(" ");
		sql.append(whereClause);
		sql.append(";");

		System.out.println("Update Statement:\n");
		System.out.println(sql.toString());
		return sql.toString();

	} 
}

