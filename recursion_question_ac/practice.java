import java.util.HashMap;

public class practice {

    // //DEC ORDER
    // static void func1(int n){
    //     if(n==0){
    //         return;
    //     }

    //     System.out.println(n);
    //     func(n-1);
    // }

    // //INC order
    // static void func(int n){
    //     if(n==0){
    //         return;
    //     }

    //     func(n-1);
    //     System.out.println(n);
    // }

    // factorial
    // static int func(int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     return n*func(n-1);

    // }


    // //Sum of N 
    // static int func(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     return n+func(n-1);
    // }


    // nth fibonacci number
    // static int func(int n){
    //     if(n==0){
    //         return 0;
    //     } 
    //     if(n==1){
    //         return 1;
    //     }
        
    //     return func(n-1)+func(n-2);
    // }

    //sorted or not
    // static boolean func(int []arr, int i){
    //     if(i==arr.length-1){
    //         return true;
    //     }
    //     if(arr[i]>arr[i+1]){
    //         return false;
    //     }
    //     return func(arr, i+1);
    // }

    // // first Occurence
    // static int func(int []arr, int element,int i){
    //     if(i==arr.length){
    //         return -1;
    //     } 
    //     if(arr[i] == element){
    //         return i;
    //     }
    //     return func(arr, element, i+1);
    // }


    
    // last Occurence
    // static int func(int []arr, int element,int i){
    //     if(i==-1){
    //         return -1;
    //     } 
    //     if(arr[i] == element){
    //         return i;
    //     }
    //     return func(arr, element, i-1);
    // }

    // xpow n
    // static int func(int x, int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     return x*func(x, n-1);
    // }


    //tiling problem
    // static int func(int n){
    //     if(n==1 || n==0){
    //         return 1;
    //     }
    //     if(n>1){
    //         return func(n-1)+func(n-2);
    //     }
    //     return 0;
    // }

    
    //remove duplicates from a string
    // static void func(String input,StringBuilder output, boolean map[]){
    //     if(input.isEmpty()){
    //         System.out.println(output);
    //         return;
    //     }
    //     char ch = input.charAt(0);
    //     if(map[ch-'a']!=true){
    //         //at the start the value of the map array won't be true so we'll have to make them true and append the char to the answer string
    //         //make that char's map true
    //         map[ch-'a']=true;
    //         func(input.substring(1),output.append(ch),map);

    //     }else{
    //         // if its true(map array element of that char's index)
    //         //duplicate found, skip the element
    //         func(input.substring(1),output,map);
    //     }


    // }


    //binary string problem
    // static void func(int n,int previouschar,String output){
    //     if(n==0){
    //         System.out.println(output);
    //         return;
    //     }
    //     //previous char initially 0 pass krege 
    //     if(previouschar == 0){
    //         func(n-1, 0, output+"0");
    //         func(n-1, 1, output+"1");
    //     }else if(previouschar == 1){
    //         func(n-1,0, output+"0");
    //     }
    // }


    //find all the occurences
    // static void func(int []arr, int target, int index){
    //     if(index == arr.length){
    //         return;
    //     }

    //     if(arr[index]==target){
    //         System.out.print(index+" ");
    //     }
    //     func(arr, target, index+1);
    // }


    //1 to one
    // static String mapping(char n){
    //     HashMap<Character,String> map = new HashMap<>();
    //     map.put('1', "one");
    //     map.put('2', "two");
    //     map.put('0', "Zero");
    //     map.put('3', "three");
    //     map.put('4', "four");
    //     map.put('5', "five");
    //     map.put('6', "six");
    //     map.put('7', "seven");
    //     map.put('8', "eight");
    //     map.put('9', "nine");

    //     return map.get(n);
    // }
    // static void func(String n, String ans){
    //     if(n.isEmpty()){
    //         System.out.println(ans);
    //         return ;
    //     }

    //     char ch = n.charAt(0);
    //     func(n.substring(1), ans+(mapping(ch))+" ");
    // }

    // // length of a string 
    // static int func(String input, int ans){
    //     if(input.isEmpty()){
    //         return ans;
    //     }
    //     return func(input.substring(1), ans+1);
    // }


    // static int func(String input, int start, int end, int count) {
    //     if (start == input.length()) {
    //         return count;
    //     }
    
    //     // substring from start to end
    //     String substring = input.substring(start, end);
    //     if (!substring.isEmpty() && substring.charAt(0) == substring.charAt(substring.length() - 1)) {
    //         System.out.println(substring); 
    //         count++; 
    //     }
    
    //     if (end == input.length()) {
    //         return func(input, start + 1, start + 1, count); 
    //     }
    //     return func(input, start, end + 1, count);
    // }

    // approach 2 -- easy
    static int func(String input, int index, int count){
        if(index == input.length()){
            System.out.println(count);
            return 0;
        }

        String subString = "";
        for(int i=index;i<input.length();i++){
            subString = subString + input.charAt(i);
            if(subString.charAt(0)==subString.charAt(subString.length()-1)){
                System.out.println(subString);
                count++;
            }
        }
        return func(input, index+1,count);
    }


    public static void main(String[] args) {
        String input1  = "abcab";
        String input2  = "aba";
        // System.out.println(func(input1, 0,0,0));
        // System.out.println();
        // System.out.println(func(input2, 0,0,0));
        func(input1, 0, 0);
        System.out.println();
        func(input2, 0, 0);
    }
    
}
