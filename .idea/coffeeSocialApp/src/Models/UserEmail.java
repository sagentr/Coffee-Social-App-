import coffee-social-app\Models\newUserApplication.java;
import coffee-social-app\Models\userProfileCreate; 
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

public class UserEmail extends userProfileCreate{

    @Valid
    @NotBlank(message = "Field, 'Email', is required.")
    private String email; 
    
    
}

public UserEmail(){}

//Write method for Validating email. 

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}
