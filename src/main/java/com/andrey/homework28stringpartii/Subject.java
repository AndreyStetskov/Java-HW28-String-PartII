package com.andrey.homework28stringpartii;

import java.util.List;

public class Subject {
    private final String UUID;
    private String subject;
    private int hours;
    private List<String> topic;


    public Subject(String UUID, String subject, int hours, List<String> topic) {
        this.UUID = UUID;
        this.subject = subject;
        this.hours = hours;
        this.topic = topic;
    }

    public String getUUID() {
        return UUID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public List<String> getTopic() {
        return topic;
    }

    public void setTopic(List<String> topic) {
        this.topic = topic;
    }
}
