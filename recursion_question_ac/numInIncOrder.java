class numInIncOrder{

    static void func(int n ){
        if(n==1){
            System.out.println("1");
            return;
        }
        func(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        // System.out.println("Hello Kshitij");
        func(10);
    }
}