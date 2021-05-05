package mediatorAndSingleton;

public class ChatBot extends ChatParticipant {

	private static ChatBot chatBot;
	
	private ChatBot(ChatRoomMediator chatRoom, String name) {
		super(chatRoom, name);
		chatRoom.addUser(this);
	}

	public static ChatBot getInstance(ChatRoomMediator chatRoom) {
		
		if(chatBot == null) {
			chatBot = new ChatBot(chatRoom, "ChatBot");
		}
		
		return chatBot;
	}	

	@Override
	public void send(String message) {
		System.out.println(this.name + " sends: " + message);
		this.chatRoom.sendMessage(message, this);
	}

	@Override
	public void receive(ChatParticipant chatParticipant, String message) {
		System.out.println(this.name + " received: " + "User " + chatParticipant.name + ": " + message);
		if (message.contains("cat")) {
			send("\"cat\" is a forbidden word!");
			chatRoom.removeUser(chatParticipant, "was removed due to violation.");
		}
	}

}
