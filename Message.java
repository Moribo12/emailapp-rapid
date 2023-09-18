public class Message {
    
    private int message_id;
	private String message;
	private String subject;
	private String to;
	private User user;
	
	public Message(int message_id,String to, String subject,String message) {	
		
		this.message_id = message_id;
		this.message = message;
		this.subject = subject;
		this.to = to;
		this.user = user;
	}
	Message(){
		
	}
	
	public int getMessage_id() {
		return message_id;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	public String toString() {
		return "Message_Id:" + message_id +"\n"+"From:"+user+"\n"+"To:"+ to+"\n"+ "Message:" + message + "\n" + "Subject:" + subject+"\n";
	} 
	
}
