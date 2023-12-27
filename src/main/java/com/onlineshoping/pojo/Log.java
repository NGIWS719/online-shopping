package com.onlineshoping.pojo;

import java.sql.Timestamp;

public class Log {
    private long id;
    private String message;
    private Timestamp time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public Log(long id, String message, Timestamp time) {
        this.id = id;
        this.message = message;
        this.time = time;
    }

    public Log() {

    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", time=" + time +
                '}';
    }
}
