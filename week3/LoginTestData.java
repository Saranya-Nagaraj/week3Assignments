package week3;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("Username");
	}
	
	public void password() {
		System.out.println("password");

	}

	public static void main(String[] args) {
		
		LoginTestData TD = new LoginTestData();
		TD.enterCredentials();
		TD.navigateToHomePage();
		TD.enterUsername();
		TD.password();
		

	}

	
}
