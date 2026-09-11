package PlayerInformation;

import java.io.IOException;

public class RegisterAndSignIn {

    private String username;


    public String getUserName() {
        return username;
    }

    public boolean register(String username,String pass1,String pass2) throws IOException {
   

        if (!ReaderAndWriterFileProcess.isUserAvailable(username)) {
            return false;
        }

        if (!pass1.equals(pass2)) {
            return false;
        }

        ReaderAndWriterFileProcess.writeUser(username, pass1);
        this.username = username;
        
        
        
        return true;
    }

    public int signIn(String username,String password) throws IOException {
     
        if(username.equals("Admin")   && password.equals("admin")){
        this.username=username;
        return 0;
        }
        if (ReaderAndWriterFileProcess.checkUserInformation(username, password)) {
            this.username = username;
            return 1;
        }

        return -1;
    }
}
