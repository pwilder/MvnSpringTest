package edu.pwilder.mvnSpringTest.model;

public class Greeting {
    private int id;
    private String response;
    
    public Greeting() {
        super();
    }
    
    public Greeting(int id, String response) {
        super();
        this.id = id;
        this.response = response;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getResponse() {
        return response;
    }
    public void setResponse(String response) {
        this.response = response;
    }
    
    
}
