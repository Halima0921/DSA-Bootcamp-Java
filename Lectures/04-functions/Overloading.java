import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        halima("rere" ,"mama");

    }
    static void halima(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void halima(String ...v){
        System.out.println(Arrays.toString(v));
    }

}
