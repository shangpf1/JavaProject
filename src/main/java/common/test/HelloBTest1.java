import java.util.Scanner;

public class HelloBTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入成绩分数：");
        int Score = sc.nextInt();
        if (Score>90){
            System.out.println("不错，给你《独孤九剑》剑谱");
        }else {
            System.out.println("混账东西，去闭门思过去吧");
        }
    }
}
