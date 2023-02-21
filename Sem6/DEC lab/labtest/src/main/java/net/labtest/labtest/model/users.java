package net.labtest.labtest.model;
import jakarta.persistence.*;

@Entity
@Table (name="users")

public class users {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String name;

    public void setUsername(String us){
        this.username=us;
    }

    public void setPassword(String paswd){
        this.password=paswd;
    }
    public void setName(String n){
        this.name=n;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getName(){
        return name;
    }

}


