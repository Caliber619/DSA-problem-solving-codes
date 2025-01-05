public class xRaiseN {
    static int func(int x,int n){
        if(n==0){
            return 1;
        }
        return x*func(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(func(3, 3));
    }
}
