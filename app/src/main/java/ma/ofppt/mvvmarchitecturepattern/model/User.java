package ma.ofppt.mvvmarchitecturepattern.model;

public class User {
    private String email;
    private String password;

    public User(String email,String password){
        this.email=email;
        this.password=password;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(){
        this.password=password;
    }
}
