import coffee-social-app\Models\newUserApplication.java;
import coffee-social-app\Models\userProfileCreate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Requestmapping("User")
public class ProfileViewController{


    @GetMapping("Username")
    public String displayUserName() {
        return getUserName; 
    }

    @GetMapping ("Firstname")
    public String displayFirstName(){
        return getFirstName; 
    }

    @GetMapping("AboutMe")
    public String displayAboutMe(){
        return getAboutMe; 
    }

    @GetMapping("coffeeTastes")
        public String displayCoffeeTastes(){
            return getCoffeeTastes; 
        }

    @GetMapping("foodTastes")
        public String displayFoodTastes(){
            return getFoodTastes;
        }
    

}