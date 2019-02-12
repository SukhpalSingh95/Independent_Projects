public class ClassWork {

    /*
    * This is to explore classes!
    * Public or private determines who can have access to the module
    *
    * static says it belongs to the class.
    *
    * int/str etc indicates that it will return a value of that type
    *
    * */


    public static double Multiplication(int x, int y ){
        return x*y;
    }

    public static double Divisions(int x, int y){
        return x/y;
    }

    public static double Subtract(int x, int y){
        return x-y;
    }

    public static int Sum(int ... Numbers){
        Integer total=0;
        for (int i=0;i<Numbers.length; i++){
            total+=Numbers[i];
        }
        return total;
    }

    public static void main(String[] args){

        Integer x=10;
        Integer y=99;
        Double Answer= new Double(0);

        Answer=Multiplication(x,y);
        System.out.println("The answer to multiplication is "+ Answer);

        Answer=Divisions(x,y);
        System.out.println("The answer to Division is "+ Answer);

        Answer = Subtract(x,y);
        System.out.println("The answer to subtraction is "+ Answer);




    }

}
