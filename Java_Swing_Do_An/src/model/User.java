package model;

public class User {
    private int id;
    private String username;
    private String email, mobileNumber, address, password;

    public User() {
    }

    public User(int id, String username, String email, String mobileNumber, String address, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}

