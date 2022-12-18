import  java.util.Scanner ;
public class argumentGreeting {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter your name ");
        String name = in.next();
        String personlized = myGreet(name);
        System.out.println(personlized);

    }
    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }


}
