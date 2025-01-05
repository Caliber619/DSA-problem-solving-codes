public class fibonacci {
    static int func(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return func(n-1)+func(n-2);
    }
    public static void main(String[] args) {
        System.out.println(func(5));
    }
}
