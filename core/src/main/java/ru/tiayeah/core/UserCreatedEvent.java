package ru.tiayeah.core;

public class UserCreatedEvent {
    private int id;

    public UserCreatedEvent() {
    }

    public UserCreatedEvent(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
