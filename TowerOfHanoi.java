public class TowerOfHanoi {
    static  void towerOfHanoi(int n,char A,char B,char C){
        if (n == 1) {
            System.out.println("Move disk 1 from " + A+ " to " + C);
            return;
        }
        towerOfHanoi(n-1, A, C, B);
System.out.println("Move disk " + n + " from " + A + " to " + C);
towerOfHanoi(n-1, C, A, B);
    }
    public static void main(String[] args) {

        int n = 3;

        towerOfHanoi(n, 'A', 'B', 'C');

    }
}
