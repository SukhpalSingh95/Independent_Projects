import javax.swing.*;
import java.util.Scanner;

public class UserInputTut {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter some line of text. Maybe your name?");
        if (scanner.hasNextLine()){
            //essentially the scanner is going to be checking if the user has entered any text
            String UsersText=scanner.nextLine();
            System.out.println(UsersText);

        }

        System.out.println("");
        System.out.println("Using Dialog boxes to retrieve a name now");
        String UserName= JOptionPane.showInputDialog("Enter your name");
        System.out.println(UserName);
        }


}
