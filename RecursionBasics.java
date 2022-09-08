
public class RecursionBasics{
    public static void printDec(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }

        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int factNum(int n){
        if(n == 0)
        {
            return 1;
        }
        int fact = factNum(n-1);
        int fn = n * fact;

        return fn;
    }

    public static int sumN(int n){
        if(n == 1)
        {
            return 1;
        }
       int Snm1 = sumN(n-1);
       int sum = n + Snm1;

       return sum;
    }

    public static int fibonacci(int n){
        if(n == 0 || n == 1)
        {
            return n;
        }

        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);
        int fn =  fnm1 + fnm2;

        return fn;
    }

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1)
        {
            return true;
        }

        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccurence(int arr[], int key, int i){
        if( i == arr.length-1){
            return -1;
        }
        if(arr[i] == key)
        {
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);

        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n)
    {
        if(n == 1)
        {
            return x;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x,n-1);
    }

    public static void main(String args[]){
        // int n = 5;
        // System.out.println(fibonacci(n));
        // int arr[]={8,3,6,9,5,10,2,6,3};
        // System.out.println(lastOccurence(arr, 5, 0));

        int x = 2;
        int n = 10;
        System.out.println(power(2, 10));
    }
}