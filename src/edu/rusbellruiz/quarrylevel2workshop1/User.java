package edu.rusbellruiz.quarrylevel2workshop1;

public class User {
    public String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void greet(){
        System.out.println("hola, mi usurio es:" + username);
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        password = pass;
    }
}
