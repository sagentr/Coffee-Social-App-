import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Requestmapping("User")
public class ProfileViewController{


    @GetMapping("")
    public String displayUserName() {
        return getUserName; 
    }

    @GetMapping ("")
    public String displayFirstName(){
        return getFirstName; 
    }

    @GetMapping("")
    public String displayAboutMe(){
        return getAboutMe; 
    }

 

}