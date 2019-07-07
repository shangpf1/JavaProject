public class Test {
    public int sum(int a,int b) {
        int resultsum = a + b;
        return  resultsum;

    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.sum(1,4));

        System.out.println("----------------------------------");
        int i =4;
        int j = 5;
        int g,h;
        g = i + j;
        h = i*j;
        System.out.println(g);
        System.out.println(h);
    }
}
