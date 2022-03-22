import java.util.*;
import static java.lang.Math.abs;
import static java.lang.System.out;



public class Queens {
    public static List<List<Queen>> queens(int n) {
        return placeQueens(n, n);
    }
    
    public static List<List<Queen>> placeQueens(int n, int k) {
        List<List<Queen>> queensList = new ArrayList<>();
        if(k == 0) {
            queensList.add(new ArrayList<Queen>());
        }
        else {
            for(List<Queen> queens : placeQueens(n, k - 1)) {
                for(int column = 1; column <= n; column++) {
                    Queen queen = new Queen(k, column);
                    if(isSafe(queen, queens)) {
                        List<Queen> qs = new ArrayList<>();
                        qs.addAll(queens);
                        qs.add(queen);
                        queensList.add(qs);
                    }
                }
            }
        }
        return queensList;
    }
    
    public static boolean isSafe(Queen queen, List<Queen> queens) {
        for(Queen q : queens) if(inCheck(queen, q)) {
            return false;
        }
        return true;
    }
    
    public static boolean inCheck(Queen q1, Queen q2) {
        return q1.x == q2.x || // 同列
               q1.y == q2.y || // 同行
               abs(q1.x - q2.x) == abs(q1.y - q2.y); // 對角線
    }
    
    public static void main(String[] args) {
        for(List<Queen> queens : queens(8)) {
            for(Queen queen : queens) {
                out.print(queen);
            }
            out.println();
        }
    }
}