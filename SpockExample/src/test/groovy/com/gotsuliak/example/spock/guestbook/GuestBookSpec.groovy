package com.gotsuliak.example.spock.guestbook

import spock.lang.Specification

class GuestBookSpec extends Specification {

    private GuestBook guestBook = new GuestBook()

    def "addMessageTest"() {
        given:
        Message message = new Message();
        message.setAuthor("Viacheslav")
        message.setMessage("Hello, Spock")
        when:
        guestBook.addMessage(message)
        then:
        guestBook.messages.size() == 1
    }

    def "addMessage with null author"() {
        given:
        Message message = new Message()
        when:
        guestBook.addMessage(message)
        then:
        IllegalArgumentException exception = thrown()
        exception.message.equals("Illegal message")
    }

}
