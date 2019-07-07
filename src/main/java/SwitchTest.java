public class SwitchTest {
    public static void main(String[] args) {
        int i =1;
        switch (i){
            case 1:
                System.out.println("春天");
                break;
            case 2:
                System.out.println("夏天");
                break;
            case 3:
                System.out.println("秋天");
                break;
            case 4:
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入错误，重新输入！！！");
                break;
        }

    }
}
