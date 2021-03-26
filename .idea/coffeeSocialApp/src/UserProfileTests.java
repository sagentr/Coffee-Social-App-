import Models.userProfileCreate.java;
import Models.UserEmail.java;
import Models.AboutMe.java;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import static org.junit.Assert.assertTrue;

public class UserProfiletests{

  userProfileCreate new_User_1;
  userProfileCreate new_User_2;
  userProfileCreate new_User_3; 
  userProfileCreate new_User_4; 
  userProfileCreate new_User_5; 
  


@Before
  public void setUp(){
new_User_1 = new userProfileCreate("Izzy_Macchiato", "isabella_jones@gmail.com", "Izzy", "My favorite things in the world are coffee and cake",
  "iheartcoffee");
new_User_2 = new UserProfileCreate("CoffeeFiend", "Stanley_Smith@yahoo.com", "S.", "Just here to drink that hot bean juice", "Passowrd");
new_User_3 = new UserProfileCreate("I_am_A_Latte", "ashleyAshley@outlook.com", "Ashley", null, "Passowrd" ); 
new_User_4 = new UserProfileCreate(null, "Stanley_Smith@yahoo.com", "Stan", "I forgot my Username", "whoops"); 
new_User_5 = new UserProfileCreate("Forgetful_Fred", null, "Freddy", "I forgot my email.", "oopsies"); 
}

  //Does my UserId generate?
@Test
  public void generateUserId(){

  assertEquals(1, new_User_2.getId()-new_User_1.getId());
}

  //Can I generate a profile with all information?
  @Test
  public void profileConstructorSetsAllFields(){
    assertTrue(new_User_1.getUsername().equals((String).new_User_1.getUsername()));
    assertEquals("isabella_jones@gmail.com", new_User_1.getEmail().getValue() );
    assertTrue(new_User_1.getEmail() instanceof UserEmail);
    assertEquals("Izzy", new_User_1.getFirstname().getValue());
    assertTrue(new_User_1.getFirstname() instanceof userProfileCreate.firstname);
    assertTrue(new_User_1.getAboutme() instanceof AboutMe.aboutme);
    assertTrue(new_User_1.getPassword().equals((String).new_User_1.getPassword()));
  }
  //Can I generate a profile without AboutMe and password?

  @Test
  public void profileConstructorsetsRequiredFields(){

  }
  @Test
  public void constructorSetsWithoutOptionalField(){

  }
  //Because the current way I have it set up is not secure, also not what I'd like to do, and too involved to complete right now.
  @Test
  public void constructorSetsWithoutPassword(){

  }

  //Is there an error when I don't include a Username?
  @Test
  public void errorMessageWhenNoUserName(){

  }
  //Is there an error when I don't include an Email?
  @Test
  public void errorMessageWhenNoEmail(){

  }

}

