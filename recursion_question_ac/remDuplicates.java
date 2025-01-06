import java.util.Arrays;

public class remDuplicates {
    static void func(String input,StringBuilder output, boolean map[]){
        if(input.isEmpty()){
            System.out.println(output);
            return;
        }
        char ch = input.charAt(0);
        if(map[ch-'a']!=true){
            //at the start the value of the map array won't be true so we'll have to make them true and append the char to the answer string
            //make that char's map true
            map[ch-'a']=true;
            func(input.substring(1),output.append(ch),map);

        }else{
            // if its true(map array element of that char's index)
            //duplicate found, skip the element
            func(input.substring(1),output,map);
        }


    }
    public static void main(String[] args) {
        String input="appnnacollege";
        boolean map[]=new boolean [26];  
        StringBuilder output = new StringBuilder("");
        func(input, output, map);
    }
}
