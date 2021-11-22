package dbaccess;

public class TestDbConnection {

	public static void main(String[] args) {
		
		try {
			MYSQLDBAccess.getConnection();
			System.out.println("connection successful");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
