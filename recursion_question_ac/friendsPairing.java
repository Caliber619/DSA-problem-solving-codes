public class friendsPairing {
    static int func(int n){
        if(n==1 || n==2){
            return n;
        }
        // assume for n=3 i.e. (abc)
        int way1 =  func(n-1);//(abc)
        int way2 = (n-1)*func(n-2); //a(bc),b(ac),c(ab)
        //here (n-1) is no of people left with which we have to make a pair of 2
        return way1+way2;

    }
    public static void main(String[] args) {
        System.out.println(func(4));
    }
}
