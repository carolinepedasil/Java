public class TestaCasting {
    public static void main(String[] args) {
        double d = 15.3;
        int i = (int) d;
        System.out.println(i);

        long l = 15151515151515151l - 28298839283892;
        int i2 = (int) l;
        System.out.println(l);
        System.out.println(i2);

        int x = 200;
        byte b = (byte) x;
        System.out.println(b);
    }
}
