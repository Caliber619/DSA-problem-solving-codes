public class tilingProblem {

    // method-1
    static int func(int n){
        if(n==0){
            return 1;
        }
        int way1=0;
        int way2=0;
        if(n>=1){
            if(n>=2){
                way1 =func(n-2);
            }
            way2 =func(n-1);
        }
        return way1+way2;
    }

    // method-2
    static int func2(int n){
        if(n==0||n==1){
            return 1;
        }
        int way1 = func2(n-1);
        int way2 = func2(n-2);

        return way1+way2;
    }
    public static void main(String[] args) {
        System.out.println(func(3));
        System.out.println(func2(3));
    }
}
