import coffee-social-app\Models\userProfileCreate; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@Controller
Public class CreateUserController<createProfile>{

    @GetMapping 
    Public String displayUserSignUp (Model, Model){
        return "createNewUser"; 
    }

    @PostMapping 
    Public String processUserSignUp(@RequestParam String Email, @RequestParam String Username, @RequestParam String Firstname, @RequestParam String Aboutme,
    @RequestParam Password){
        User newUser = new User(Email, Username, Firstname, Aboutme, Password); 
        model.addAttribute("User", newUser);

        return "editProfileView"; 
    
    }


}
