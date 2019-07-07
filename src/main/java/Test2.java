import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入成绩：");
        int score = sc.nextInt();
        if (score>90){
            System.out.println("学霸");
        }else {
            System.out.println("良好");
        }
    }
}
