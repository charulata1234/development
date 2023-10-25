package com.charu;

public enum TaskStatus {

    INPROGRESS("1"),
    TODO("2"),
    DONE("3");

    private String value;

    private TaskStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
};
