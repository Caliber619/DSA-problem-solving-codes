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

    public static void main(String[] args) {
        // System.out.println(func(4));
        // func(4,0,"");
    }
    
}
