import java.util.Arrays;

public class remDuplicates {
    static String func(String output,String input){
        if(input.isEmpty()){
            return "";
        }
        char ch=input.charAt(0);
        //using converting loop into recursive calls
        return ch+func(output,input.substring(1));
    }
    public static void main(String[] args) {
        System.out.println((func("","appnnacollege")));
    }
}
