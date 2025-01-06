import java.util.Arrays;

public class remDuplicates {
    static void func(String input,StringBuilder output, boolean map[]){
        if(input.isEmpty()){
            System.out.println(output);
            return;
        }
        char ch = input.charAt(0);
        if(map[ch-'a']==true){
            //duplicate found, skip the element
            func(input.substring(1),output,map);
        }else{
            //make that char's map true
            map[ch-'a']=true;
            func(input.substring(1),output.append(ch),map);
        }


    }
    public static void main(String[] args) {
        String input="appnnacollege";
        boolean map[]=new boolean [26];  
        StringBuilder output = new StringBuilder("");
        func(input, output, map);
    }
}
