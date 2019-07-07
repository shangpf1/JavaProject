import java.util.Scanner;


public class HelloBTest {
    public static void main(String[] args) {
        int lisi=80;
        boolean isBig;

        Scanner input = new Scanner(System.in);
        System.out.println("输入学员张三的成绩：");
        int zhangsan = input.nextInt();
        isBig=zhangsan>lisi;
        System.out.println("张三的成绩比李四的高吗？"+isBig);
    }
}
