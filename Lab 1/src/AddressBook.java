import java.util.ArrayList;
//Comment comment
//new branch commit and push

public class AddressBook {
    private ArrayList<BuddyInfo> friends = new ArrayList<>();

    /**
     * Adds a new Buddy to the friends array list
     * @param buddy is the BuddyInfo object being added
     */
    public void addBuddy(BuddyInfo buddy){
        if (friends != null){
            friends.add(buddy);
        }
    }

    /**
     * Removes a buddy from the friends array list
     * @param index is the index in friends array list to be removed
     */
    public void removeBuddy(int index){
        if (index >=0 && index < friends.size()) {
            friends.remove(index);
        }
    }

    public static void main (String[] args){
        System.out.println("Address Books!");
        BuddyInfo friend = new BuddyInfo("Kelly", "123 Water Street", "905-630-7329");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(friend);
        addressBook.removeBuddy(0);
    }

}
