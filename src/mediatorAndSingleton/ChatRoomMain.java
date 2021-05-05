package mediatorAndSingleton;

public class ChatRoomMain {

	public static void main(String[] args) {

		ChatRoomMediator chatMediator = new ChatRoom();
		
		ChatParticipant user1 = new ChatUser(chatMediator, "Ivan");
		ChatParticipant user2 = new ChatUser(chatMediator, "Maria");
		ChatParticipant user3 = new ChatUser(chatMediator, "Peter");
		
		user2.send("Hi, guys");
		user1.send("cat");
		user3.send("addBot"); // ChatBot added
		user1.send("cat"); // Ivan removed
		user1.send("hello");
		user1.send("anyone there?");
		user2.send("Ivan is gone");
		user3.send("because he said cat?"); // Peter removed
		user2.send("yes, because he mentioned cat"); // Maria removed
		user1.send("test");
		user2.send("test");
		user3.send("test");
	}
}
