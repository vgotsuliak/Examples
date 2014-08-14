package com.gotsuliak.example.spock.guestbook;

import java.util.ArrayList;
import java.util.List;

public class GuestBook {

    private List<Message> messages = new ArrayList<Message>();

    public void addMessage(Message message) {
        if (message != null && message.getAuthor() != null) {
            messages.add(message);
        } else {
            throw new IllegalArgumentException("Illegal message");
        }
    }

    public List<Message> getMessages() {
        return messages;
    }
}
