import coffee-social-app\Models\newUserApplication.java;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;


@MappedSuperclass
public abstract class userProfileCreate {

    @Id
    @GeneratedValue
    private int id;
  
    @NotBlank(message = "Field, 'Username', is required.")
    @Size(min=3, max=15)
    private String username; 

    private String firstname; 
    
    private String password; 
     
   
    
   

    
    public userProfileCreate(String username, String email, String firstname, String aboutme, String password){
        this.username = username; 
        this.firstname = firstname; 
        this.password = password; 
        
    }
   
    @Override
    public boolean equals(Object o) {
       if (this == o) return true;
       if (o == null || getClass() != o.getClass()) return false;
       userProfileCreate entity = (userProfileCreate) o;
       return id == entity.id;
    }
        
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return this.id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}