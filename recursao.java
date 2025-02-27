public class Main {
    public int multi_tail (int a, int b, int total, int retornos) {

        return b;
    }
    public int multi (int a, int b) {
        if ((a | b) == 0) return 0;
        if (a == 1) return b;
        if (b == 1) return a;
        return multi_tail(a,b,0,b);
    }
    public static void main(String[] args) {

    }
}
