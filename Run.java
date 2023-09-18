public class Run {
    

    public static void main(String[] args) {
		
   Message message1 =new Message(1 ,"Lerato@webmail.com", "Interview", "We have invited you for interview");
   Message message2 =new Message(2 ,"Leago@gmail.com", "Job", "We have job offer");
   Message message3 =new Message(3 ,"john@gmail.com", "contract offer", "We have sent you an contract that you need to sign");
    
   
   Server server =new Server();
   server.sendMessage(message1);
   server.sendMessage(message2);
   server.sendMessage(message3);
   server.addUsers();

  System.out.println("Message required:");
  server.getMessage(1);

  //server.authUser("Moribo", "ribs12");

 // server.getUser("moribo@webmail.com");

  Application app =new Application(server);
  app.login();

 
  

  


                                            
   
    
 
    }
}
