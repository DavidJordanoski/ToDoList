package com.example.mytodo;

public class TaskModel {
    String header;
    String text;

    public TaskModel(String header, String text) {
        this.header = header;
        this.text = text;
    }

    public String getHeader() {
        return header;
    }

    public String getText() {
        return text;
    }
}
