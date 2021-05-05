package mediatorAndSingleton;

public interface ChatRoomMediator {

	void sendMessage(String message, ChatParticipant chatParticipant);
	void addUser(ChatParticipant chatParticipant);
	void removeUser(ChatParticipant chatParticipant);
	void removeUser(ChatParticipant chatParticipant, String removeMessage);
}
