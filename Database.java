public abstract class Database {
	
        abstract void add(Message messsage);
        abstract void getAllUserMessages(User user);
        abstract void getMessage(int message_id);
        abstract void update(Message old,Message newMsg);
        abstract void remove(Message message);
        abstract void getUser(String email);
        
        
    }
    

