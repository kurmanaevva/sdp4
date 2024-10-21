package assignment6;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new RegularUser(chatRoom, "Alice");
        User user2 = new PremiumUser(chatRoom, "Bob");
        User user3 = new RegularUser(chatRoom, "Charlie");
        User user4 = new PremiumUser(chatRoom, "Diana");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        user1.send("Hello, everyone!");
        user2.send("Hey Alice!");
    }
}