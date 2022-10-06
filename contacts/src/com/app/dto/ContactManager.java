package com.app.dto;

public class ContactManager {

    // Field
    private Contact[] myFriends;
    private int friendsCount;

    // Constructor
    public ContactManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    // Methods:
    public void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    public Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].getName().equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }

    public void ContactsList() {
        for (int i = 0; i < friendsCount; i++) {
            System.out.println(myFriends[i].toString());
        }
    }
}
