package mediatorAndSingleton;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChatRoom implements ChatRoomMediator {

	private List<ChatParticipant> users;
	
	public ChatRoom() {
		this.users = new ArrayList<ChatParticipant>();
	}

	@Override
	public void sendMessage(String message, ChatParticipant chatParticipant) {
		
		if(users.contains(chatParticipant) == false) {
			return;
		}
		
		for(int i = 0; i<users.size(); i++)
		{
			// skip sender
			if(users.get(i) != chatParticipant) {
				users.get(i).receive(chatParticipant, message);
			}
		}
		
		if(message.equals("addBot")) {
			ChatBot.getInstance(this);
		}
	}

	@Override
	public void addUser(ChatParticipant chatParticipant) {
		this.users.add(chatParticipant);
		System.out.println(chatParticipant.name + " joined the room.");
	}

	@Override
	public void removeUser(ChatParticipant chatParticipant) {
		this.users.remove(chatParticipant);
		System.out.println(chatParticipant.name + " left the room.");
	}
	
	@Override
	public void removeUser(ChatParticipant chatParticipant, String removeMessage) {
		this.users.remove(chatParticipant);
		System.out.println(chatParticipant.name + " " + removeMessage);
	}

}
