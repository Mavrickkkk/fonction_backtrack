import java.util.ArrayList;
import java.util.List;

public class Backtracking {
    public static void main(String[] args) {
        System.out.println(backtrack(17));
    }
    public static List<Integer> backtrack(int n) {
        if (TERM(n)) {
            return new ArrayList<>();
        }
        if (NONSOL(n)) {
            return null;
        }
        List<Integer> rules = APPREGLES();
        List<Integer> chemin = null;
        int r = 0;
        while (chemin == null && !rules.isEmpty()) {
            r = rules.get(0);
            rules.remove(0);
            int rd = n-r;
            System.out.println(rd);
            chemin = backtrack(rd);
        }
        if (chemin != null) {
            chemin.add(0, r);
            return chemin;
        } else {
            return null;
        }
    }
    private static boolean TERM(int n) {
        if (n==0)
            return true;
        else
            return false;
    }
    private static boolean NONSOL(int n) {
        if (n<0)
            return true;
        else
            return false;
    }
    private static List<Integer> APPREGLES() {
        return new ArrayList<>(List.of(5, 2, 1));
    }
    private static int r(int n) {
        return n;
    }
}
