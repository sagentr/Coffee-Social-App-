import java.util.Objects;

public abstract class UserID {
    private int id; 
    private static int nextId= 1; 
    private String idValue; 

    public UserID(){
        id= nextId; 
        nextId++; 
    }
    
    public UserID(String idValue){
        this();
        this.idValue=idValue; 
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserID)) return false;
        UserID UserID = (UserID) o;
        return id == UserID.id;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, idValue);
    }

    


   
    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }

    
    public String getIdValue() {
        return idValue;
    }

    
    public void setIdValue(String idValue) {
        this.idValue = idValue;
    }

}