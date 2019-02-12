import java.util.Scanner;

public class Operators {

    public static void main(String[] args){
        //operators == (equal), != (not equal), >, <, <=,=>
        //logical operators ! (not), && (and), || (or)

        Scanner scanner= new Scanner(System.in);


        int age =24;
        if (age<4){
            System.out.println("Go to nursery");
        }else if (age>5&&age<11){
            System.out.println("Go to primary school");
        }else if (age>11&&age<18){
            System.out.println("Go to high school");
        }else if (age>18){
            System.out.println("Have you tried University???");
            if (scanner.hasNextLine()){
                String UsersText=scanner.nextLine();
                if(UsersText.equals("Yes")||UsersText.equals("yes")){
                    System.out.println("You have your entire world free to do with as you please!");
                }else {
                    System.out.println("Well go THEN!!!!");
                }
            }
        }


        System.out.println("True || False "+ (true||false));
        System.out.println("!true "+(!true));

        System.out.println("");
        System.out.println("Moving onto Switches.");

        String Word = "One";
        switch (Word) {
            case "One":
                System.out.println("option one");
                break;
            case "Two":
                System.out.println("option two");
                break;
            case "Three":
                System.out.println("option three");
                break;
            default: System.out.println("Choose a number between 1 and three");
        }


        int SecretNumber=7;
        int guess=0;
        do {
            System.out.println("Guess a number: ");
            if (scanner.hasNextInt()){
                guess=scanner.nextInt();
            }
        }while (guess!=SecretNumber);
        System.out.println("You guessed correctly");
    }


}
