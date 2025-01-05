class numInDecOrder{

    static void func(int n ){
        if(n==1){
            System.out.println("1");
            return;
        }
        System.out.print(n);
        func(n-1);
    }

    public static void main(String[] args) {
        // System.out.println("Hello Kshitij");
        func(10);
    }
}