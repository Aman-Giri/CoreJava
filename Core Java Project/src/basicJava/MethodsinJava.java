package basicJava;

public class MethodsinJava {
	public static void main(String[] args) {
		MethodsinJava md = new MethodsinJava();
		md.login();
		md.login();
		md.login();
		md.login();
		md.logout();
	}
	
	public void login() {
		System.out.println("Login is Succesful");
	}
	
	public void logout() {
		login();
		System.out.println("Logout is Successful");
	}
}
