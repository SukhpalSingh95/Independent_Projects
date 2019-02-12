import com.oracle.tools.packager.Log;

import javax.swing.text.html.HTML;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HelloWorld {


    /*
    * This is to start off the Java brush up
    *
    * This was done by following the YouTube video at https://www.youtube.com/watch?v=n-xAqcBCws4
    *
    * */


    static Scanner scannerObject = new Scanner(System.in); // this allows you to take input from the user via a keyboard

    final double PiValue= 3.141; //final means that the value will not change ever!

    /*There are numerous data types to work with
    *
    * byte, short, char, boolean, int, float, double and long
    * */

    UserInputTut userInputTut;

    /*
     *
     * Extra points: you can convert from one data type to another, as is the case in Android studio
     *
     * sticking the ++ after a variable adds it after the operation. Sticking it before adds it before the operation is performed.
     * Therefore 1++ = 1, but ++1=2
     *
     * you can also use var+=10 to add 10 to that very same variable
     *
     * */

    /*
    * if you are going to make many changes on a string, it would be better to use a stringbuilder.
    * There is also the option to use a stringBuffer, but that is more related to threads.
    *
    * */

    /*
    * You can have an array of objects. this stops you from needing a single array of a particular type.
    * */


    public static void main(String[] args){
        /*
        * Public just means anyone can use this function from this class
        * static means that this is a function that belongs to the class
        * void means the function will not return anything that is exectued in the function
        * a String array will be passed and populated
        * */

        System.out.println("Hello World"); // this is the method for printing out objects to console

        System.out.println("Random number Generation!!!");
        int MaxNumber= 100;
        Random RandomNumberGenerator = new Random();
        int RandomNumber = RandomNumberGenerator.nextInt(MaxNumber)+1;
        System.out.println(RandomNumber);


        System.out.println("");
        System.out.println("Moving onto arrays");
        int[] Array1 = new int[10]; //this will hold ten values
        Arrays.fill(Array1, 0);
        System.out.println(Array1[1]);

        System.out.println("");
        System.out.println("Working with some for statements");
        int[] Array2 = new int[20];
        for (int x=0; x<Array2.length; x+=2){
            //System.out.println(x*3);
            Array2[x]=x*2;
            System.out.println(Array2[x]);
        }


        System.out.println("");
        System.out.println("Starting on Arraylists");
        ArrayList<String> arrayList1=new ArrayList<String>(2);
        for (int x=0; x<=20;x++){
            arrayList1.add(Integer.toString(x));
            System.out.println(arrayList1.get(x));
        }


    }
}
