package mediatorAndSingleton;

public class ChatUser extends ChatParticipant {

	public ChatUser(ChatRoomMediator chatRoom, String name) {
		super(chatRoom, name);
		chatRoom.addUser(this);
	}

	@Override
	public void send(String message) {
		System.out.println(this.name + " sends: " + message);
		this.chatRoom.sendMessage(message, this);
	}

	@Override
	public void receive(ChatParticipant chatParticipant, String message) {
		System.out.println(this.name + " received: " + "User " + chatParticipant.name + ": " + message);
	}

}
