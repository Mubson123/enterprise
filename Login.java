import java.util.*;

public class Login {

    //attributes of the class-------------------------------------------------------------------------------
    private String password;
    private String eMail;

    //constructor of the class------------------------------------------------------------------------------
    public Login(String eMail, String password){
        this.eMail = eMail;
        this.password = password;
    }

    //getters and setters-----------------------------------------------------------------------------------

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
