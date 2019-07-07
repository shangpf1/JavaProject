import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        int[] score= new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("输入5位学生的成绩：");
        for (int i =0;i<5;i++){
             score[i] = input.nextInt();
            }
        Arrays.sort(score);
        System.out.println("学生按照升序排列");
        for (int index = 0;index<score.length;index++){
            System.out.println(score[index]);
        }
    }
}
