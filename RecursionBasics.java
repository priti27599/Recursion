
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
    public static void main(String args[]){
        int n = 5;
        System.out.println(factNum(n));
    }
}