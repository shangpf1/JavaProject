public class ContinueTest {
    // 停止本次循环，继续其他的循环
    public static void main(String[] args) {
        for(int i=1;i<6;i++){
           if (i==2){
               continue;
           }
            System.out.println(i);
        }
        System.out.println("hello world");
    }
}
