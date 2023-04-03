package JavaEssential.hw5.t5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Friends {
    private final ArrayList<String> friends;

    public Friends() {
        friends = new ArrayList<>();
    }

    public Friends(String[] name) {
        friends = new ArrayList<>(name.length);
        friends.addAll(Arrays.asList(name));
    }

    public void addFriend(String name) {
        friends.add(name);
    }

    public void sortFriend() {
        Collections.sort(friends);
    }

    public void printFriends() {
        System.out.println("All fiends " + friends.toString());
    }
}
