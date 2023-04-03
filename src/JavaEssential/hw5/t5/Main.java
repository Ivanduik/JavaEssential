package JavaEssential.hw5.t5;

public class Main {
    public static void main(String[] args) {
        String[] friend = {"Tolya", "Konstantin", "Leha"};
        Friends friends = new Friends(friend);
        friends.addFriend("Zoya");
        friends.addFriend("Sasha");
        friends.addFriend("Nik");
        friends.addFriend("Alex");
        friends.addFriend("Natasha");

        friends.printFriends();

        friends.sortFriend();

        friends.printFriends();
    }
}
