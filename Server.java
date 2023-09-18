import java.util.Arrays;

public class Server extends Database {

    private Message[] data = new Message[12];
    private User[] users = new User[4];

    Server() {
        super();
        

    }

    public String authUser(String Name, String password) {

        boolean isAuthenticated = false;

        for (User user : users) {
            if (user.getName().equals(Name) && user.getPassword().equals(password)) {
                isAuthenticated = true;
                break; // Authentication successful, exit the loop
            }
        }

        if (isAuthenticated) {
            System.out.println("Welcome "+ Name);
            System.out.println("1. Send E-mail");
            System.out.println("2. View Mailbox");
            System.out.println("3. View Message");
            System.out.println("4. Update E-mail");
            System.out.println("5. Delete E-mail");
            System.out.println("6. Logout");
            
        } else {
            System.out.println("Authentication failed!");
        }

        return "";

    }

    public boolean sendMessage(Message message) {
         add(message);
        return true;

    }

    public void add(Message messsage) {

        // Find the first available index to add the message
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                index = i;
                break; // Found an empty slot, exit the loop
            }
        }

        // If an empty slot was found, add the message
        if (index != -1) {
            data[index] = messsage;
            //System.out.println(data[index]);
        } else {
            System.out.println("Array is full, cannot add message.");
        }

    }

    public void getAllUserMessages(User user) {
        

    }

    public void getMessage(int message_id) {
        if (message_id != 0) {
            System.out.println(data[message_id - 1]);
        }

    }

    public void update(Message old, Message newMsg) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == old) {
                data[i] = newMsg;
                break;
            }

        }

    }

    public void remove(Message message) {

    }

    public void getUser(String email) {

        for (User user : users) {
            if (user.getEmail().equals(email)) {
                System.out.println(user.toString());
                break;
            } else {
                System.out.println("The user does not exist!!");
                break;
            }
        }

    }

    public void addUsers() {
       // User[] users = new User[4];
        users[0] = new User("Moribo", "moribo@webmail.com", "ribs12");
        users[1] = new User("Leago", "leago@gmail.com", "leago12");
        users[2] = new User("Lerato", "lerato@webmail.com", "lerato12");
        users[3] = new User("John", "john@gmail.com", "johns12");

    }

}
