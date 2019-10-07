package practice.coding.hackerearth;

public class IsPossible {

    public static void main(String[] args) {
        String possible = isPossible(1, 4, 5, 9);
        System.out.println(possible);
    }

    public static String isPossible(int a, int b, int c, int d) {

        boolean canMove = canChange(a, b, c, d);

        return canMove?"Yes":"No";
    }

    public static boolean canChange(int a, int b, int c, int d){

        if(a==c && b==d){
            return true;
        }

        if(a>c || b>d){
            return false;
        }

        return canChange(a+b,b,c,d) || canChange(a,a+b,c,d);
    }
}
