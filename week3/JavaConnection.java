package week3;

public class JavaConnection implements DataBaseConnection {

	

	@Override
	public void connect() {
		System.out.println("Connected to the database");
		
	}

	@Override
	public void disconnect() {
		 System.out.println("Disconnected from the database");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Executing an update operation");
		
	}



   public static void main(String[] args) {
   
    JavaConnection connection = new JavaConnection();
    connection.connect();
    connection.executeUpdate();
    connection.disconnect();
}
}