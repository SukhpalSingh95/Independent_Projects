import java.util.*;

public class ClassWork2 {

    /*
    * This is to use in conjunction with ClassWork
    *
    * Use a try block to test problematic code
    * */


    public static void main(String[] args){
        System.out.println(ClassWork.Multiplication(7,9));

        Integer ValuedSum=0;

        List<Integer> NumberArray = Arrays.asList(1,2,3,4,5);
        ArrayList<Integer> NumberArrayList= new ArrayList<>(NumberArray.size());
        NumberArrayList.addAll(NumberArray);
        for (int i=0;i<NumberArrayList.size();i++){
            //System.out.println(NumberArrayList.get(i));
            ValuedSum=+ClassWork.Sum(NumberArrayList.get(i));
            System.out.println(ValuedSum);

        }

        try {
            int number = 10/0;
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage()) ;
        }finally {
            System.out.println("You are done with trying!");
        }




    }
}
