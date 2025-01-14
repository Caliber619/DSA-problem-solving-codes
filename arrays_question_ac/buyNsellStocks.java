public class buyNsellStocks {
    static void func(int arr[]){
        //this array has the prices list of the stocks of each day
        int maxProfit = 0;
        int bestBuyPrice = arr[0];   //because we want minimum buy price
        // so if the current buy price is less than this than that current buy price is the bestBuyPrice

        for(int i=1;i<arr.length;i++){
            if(bestBuyPrice < arr[i]){
                int profit = arr[i] - bestBuyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                bestBuyPrice = arr[i];
            }
        }

        System.out.println(maxProfit);
    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        func(arr);
    }
}
