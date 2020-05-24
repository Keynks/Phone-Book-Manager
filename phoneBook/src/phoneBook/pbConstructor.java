package phoneBook;
import java.util.Scanner;

public class pbConstructor {

    private static String pNumber;
    private static String fName;
    private static String lName;
    private static String email;

    public pbConstructor(String fName, String lName, String email, String pNumber) { //Constructor
        pbConstructor.fName = fName;
        pbConstructor.lName = lName;
        pbConstructor.email = email;
        pbConstructor.pNumber = pNumber;

    }

    @Override
    public String toString(){
        return "First naame: "+fName +"\nLast name: "+lName+ "\nPhone number: "+ pNumber+
                "\nEmail:  " + email;
    }


    public String getpNumber() {
        return pNumber;
    }
    public String getfName() {
        return fName;
    }
    public String getlName() {
        return lName;
    }
    public String getEmail() {
        return email;
    }

}