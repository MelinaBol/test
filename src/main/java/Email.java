import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstname;
    private String surname;
  private  String password;
  private int defaultPasswordlength = 10;
  private String department;
  private int mailboxCapacity = 500;
  private String alternateEmail;
  private String email;
private String communitySuffix = "aeycompany.com";

    public Email(String firstname, String surname){
        this.firstname = firstname;
        this.surname = surname;

        department = setDepartemtn();


        this.password = randomPassword(defaultPasswordlength);
        System.out.println("your password is:" + password);

        email = firstname.toLowerCase() + "." + surname.toLowerCase() + "@" + department + communitySuffix;
    }
    private String setDepartemtn(){
        System.out.println("Enter the department\n1 for developement\n2 for accounting\n3 for sales\n0 for none");
        Scanner in = new Scanner(System.in);
       int departmentChoice =  in.nextInt();
        if(departmentChoice == 1){
            return "developement";
        }else if(departmentChoice == 2){
            return"accounting";
        }else if(departmentChoice == 3){
            return "sales";
        }else{
            return "";
        }
    }

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWYZ12345678901@#65";
        char[] password = new char[length];
        for (int i = 0; i < length; i++){
           int rand =  (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    public void setAlternateEmail(String altmail){
        this.alternateEmail = altmail;
    }
    public void changePassword(String password){
        this.password = password;
    }

    public String showInfo(){
        return "DISPLAY: name : "+ firstname +" " + surname
                + " COMPANY EMAIL: " + email;


    }




}
