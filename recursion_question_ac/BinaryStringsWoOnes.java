public class BinaryStringsWoOnes {
    //print all binary Strings of size (N) without consecutive ones
    static void func(int n,int lastPlace,String ans){
        if (n==0){
            System.out.println(ans);
            return;
        }
        if(lastPlace==0){
            func(n-1,1, ans+"1");
        }
        func(n-1,0, ans+"0");
    }
    public static void main(String[] args) {
        func(3,0 ,"");
    }
}
