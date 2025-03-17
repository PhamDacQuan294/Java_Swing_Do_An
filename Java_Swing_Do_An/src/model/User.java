package model;

public class User {
    private String name;
    private String email, mobileNumber, address, password;

    public User() {
    }

    public User(String name, String email, String mobileNumber, String address, String password) {
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.password = password;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}

