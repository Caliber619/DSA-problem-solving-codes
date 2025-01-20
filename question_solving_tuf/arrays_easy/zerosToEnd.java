package arrays_easy;

class zerosToEnd{
    static int[] func(int a[]){
        int n=a.length;
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
        if (j == -1) return a;

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;

    }
    public static void main(String[] args) {
        int arr1[]={1,0,2,0,4,5,0};
        int arr2[]={0,0,0,0,0,0};
        int arr3[]={1,2,3,4,5,6,0};
        System.out.println(func(arr1));
    }
}