public class ReturnTest {
// 直接跳出方法体，整体都不执行了，和break有点相似
    public static void main(String[] args) {
        for (int i =0;i<10;i++){
            if (i==6){
                return;
            }
            System.out.println(i);
        }
        System.out.println("hello world!");
    }
}
