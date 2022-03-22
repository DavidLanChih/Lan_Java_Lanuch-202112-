import java.util.*;
import static java.lang.Math.abs;
import static java.lang.System.out;

public class Queen {
    final int x, y;
    Queen(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}