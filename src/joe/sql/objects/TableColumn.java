package joe.sql.objects;


public class TableColumn {
	
	private String mName;
	private String mType;
	private boolean mNull=true;
	private boolean mPrimeKey=false;

	public TableColumn(String name, String type){
		mName=name;
		mType=type;
		mPrimeKey=false;
		mNull=true;
	}
	
	public TableColumn(String name, String type, boolean nullable){
		mName=name;
		mType=type;
		mNull=nullable;
	}
	
	public TableColumn(String name, String type, boolean nullable, boolean pk){
		mName=name;
		mType=type;
		mNull=nullable;
		mPrimeKey=pk;
	}
	
	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmType() {
		return mType;
	}

	public void setmType(String mType) {
		this.mType = mType;
	}

	public boolean ismNull() {
		return mNull;
	}

	public void setmNull(boolean mNull) {
		this.mNull = mNull;
	}

	public boolean ismPrimeKey() {
		return mPrimeKey;
	}

	public void setmPrimeKey(boolean mPrimeKey) {
		this.mPrimeKey = mPrimeKey;
	}

	public String toStatement(){
		StringBuilder sb = new StringBuilder();
		sb.append(mName);
		sb.append(" ");
		sb.append(mType);
		if (mPrimeKey){
			sb.append(" PRIMARY KEY ");
			sb.append(" NOT NULL");
		}
		else if (!mNull){
			sb.append(" NOT NULL");
		}

		return sb.toString();
	}

}
