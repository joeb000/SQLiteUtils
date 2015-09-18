package joe.sql.statements;

import java.util.ArrayList;

import joe.sql.objects.TableColumn;

public class CreateTable {
	
	public String createTable(String tableName, ArrayList<TableColumn> columnList){
		StringBuilder sql = new StringBuilder();
		sql.append("CREATE TABLE ");
		sql.append(tableName);
		sql.append(" (");
		for (TableColumn tc : columnList){
			sql.append(tc.toStatement());
			sql.append(", ");
		}
		sql.deleteCharAt(sql.lastIndexOf(","));
		sql.append(")");
		
		System.out.println("Create Statement:");
		System.out.println(sql.toString());
		return sql.toString();
	}
	
}
