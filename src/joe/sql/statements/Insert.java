package joe.sql.statements;

public class Insert {

	public String insert(String tableName, String[] labels, String[] values){
		StringBuilder sql = new StringBuilder();
		if (labels.length != values.length){
			System.err.println("The length of labels ("+ labels.length+ ") and values ("+ values.length+ ") is not equal. Try again.");
		}
		else {
			sql.append("INSERT INTO ");
			sql.append(tableName);
			sql.append(" (");
			for (int i = 0; i < labels.length; i++) {
				sql.append(labels[i]);
				if (i+1<labels.length){
					sql.append(",");
				}
			}
			sql.append(") ");
			sql.append("VALUES ");
			sql.append("(");
			for (int i = 0; i < values.length; i++) {
				sql.append(values[i]);
				if (i+1<values.length){
					sql.append(",");
				}
			}
			sql.append(");");

			System.out.println("Insert Statement:\n");
			System.out.println(sql.toString());

		}
		return sql.toString();
	}

}
