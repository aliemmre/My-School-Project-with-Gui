
package PlayerInformation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterFileProcess {

    final static private String FILE = "UsernameAndPasswords.txt";

    public static boolean isUserAvailable(String username) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] part = line.split("###");
                if (part.length == 3 && part[1].equals(username)) {
                    return false; // kullanıcı VAR
                }

            }
        }
        return true; 
    }

    public static boolean checkUserInformation(String username, String password) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] part = line.split("###");
                if (part.length == 3
                        && part[1].equals(username)
                        && part[2].equals(password)) {

                    return true;
                }
            }
        }

        return false;
    }

    public static int getterLastIdFromFile(String username) throws FileNotFoundException, IOException {

      
        int defaultId =100;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {
            String line;
                
            while ((line = reader.readLine()) != null) {
                if(line.trim().isEmpty())continue;
                
                String[] parts = line.split("###");
                    if(parts!=null && parts[1].equals(username)){
                    defaultId=Integer.parseInt(parts[0]);
                    return defaultId;
                   
                    }
                    if (parts != null && parts.length == 3) {
                        defaultId = Integer.parseInt(parts[0]) ;
                        
                    }

                

            }
        }
        
        return defaultId+1;
    }

    public  static void writeUser(String username, String password) throws IOException {
        try (FileWriter fw = new FileWriter(FILE, true)) {
                        // burda tekrar girip artığı için ayarlamasi lazım ıdyi
            fw.write( (getterLastIdFromFile(username)) + "###" + username + "###" + password+"\n" );
        }
    }
    
}
