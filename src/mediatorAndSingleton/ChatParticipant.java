package mediatorAndSingleton;

public abstract class ChatParticipant {

	protected ChatRoomMediator chatRoom;
	protected String name;
	
	public ChatParticipant(ChatRoomMediator chatRoom, String name) {
		this.chatRoom = chatRoom;
		this.name = name;
	}
	
	public abstract void send(String message);
	
	public abstract void receive(ChatParticipant chatParticipant, String message);

}
