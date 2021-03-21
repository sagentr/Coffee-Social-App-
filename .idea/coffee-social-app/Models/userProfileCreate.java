
@Entity
public abstract class userProfileCreate {
    private String Username; 
    private String Email; 
    private String Firstname; 
    private String Aboutme;
    private String Password; 
     

   

    }
    public userProfileCreate(String Username, String Email, String Firstname, String Aboutme, String Password){
        this(); 
        this.Username = Username; 
        this.Email = Email; 
        this.Firstname = Firstname; 
        this.Aboutme = Aboutme;
        this.Password = Password; 
        
    }
    public  userProfileCreate() {
        
    

    

    }

    
   public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getAboutMe(){
        return Aboutme; 
    }
    public String setAboutMe(String Aboutme){
        this.Aboutme = Aboutme; 
    }
}