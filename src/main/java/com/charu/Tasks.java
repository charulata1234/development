package com.charu;

class Tasks{



    private int id;

    private String  name;

    private String status;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tasks [id=" + id + ", name=" + name + ", status=" + status + "]";
    }

    public Tasks(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    

    
}