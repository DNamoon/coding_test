package algorithm.chap02;

public class XYZ {
    int x = 0;
    long y;
    double z;

    public static void main(String[] args) {
        XYZ a = new XYZ();
        a.x = 3;
        XYZ b = new XYZ();
        System.out.println(a.x);
        System.out.println("b.x = " + b.x);
    }
}
