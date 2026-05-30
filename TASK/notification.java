interface notify{
	void sendMessage(String message);
}
class instanotification implements notify{
	public void sendMessage(String message) {
		System.out.println("Instagram Notification: "+message);
	}
}
class jobnotification implements notify{
	public void sendMessage(String message) {
		System.out.println("Job Notification: "+message);
	}
}
class snapnotification implements notify{
	public void sendMessage(String message) {
		System.out.println("Snap Notification: "+message);
	}
}
public class notification {

	public static void main(String[] args) {}
		instanotification in=new instanotification();
		jobnotification j=new jobnotification();
		snapnotification s=new snapnotification();
		in.sendMessage("Akhila has requested to follw you");
		j.sendMessage("You have a interview on 01-06-2026");
		s.sendMessage("Akhila sent you a snap");
	}

}