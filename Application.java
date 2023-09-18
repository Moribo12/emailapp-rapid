import java.util.Scanner;

public class Application{
    
    private User session;
	private Server server;
	private User[] users = new User[4];

	Application(){

	}
	
	Application(Server server){
		this.server= server;
	}
	
	public void startApplication() {
		
		
	}
	
	public User login() {
		
		Scanner s =new Scanner(System.in);
		System.out.print("Enter your name:");
		String inputName =s.next();

		System.out.print("Enter your password:");
		String inputPassword =s.next();
        server.authUser(inputName, inputPassword);
		
	

		return session;
	}
	
	public void logout() {
		
	}
	
	public int menu() {
     
	  Scanner s =new Scanner(System.in);
	  System.out.println("Please select an option:");
	  int choice =s.nextInt();
	  int options =choice;

	  		switch (options) {
			case 1:
			     System.out.println();
				break;
			case 2:
			     server.getMessage(options);
		
			default:
				break;
		}
		return 1;
	}



}