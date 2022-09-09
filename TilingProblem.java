
public class TilingProblem{
    public static int tilingPro(int n){ //2Xn (floor Size)
      //base case
      if(n == 0 || n == 1){
        return 1;
      }
      
      //vertical choice
      int fnm1 = tilingPro(n-1);

      //horizontal choice
      int fnm2 = tilingPro(n-2);

      int totWays = fnm1 + fnm2;
      return totWays;
    }
    public static void main(String args[]){
      System.out.println(tilingPro(4));
    }
}