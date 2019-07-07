public class ManTest {
    public static void main(String[] args) {
        Man m = new Man();
        m.setName("李飞");
        m.setAge(39);
        m.setStuno("10021");
        m.setSex("男");
        System.out.println("姓名："+m.getName()+"\n"+"年龄："+m.getAge()+"\n"+
                "学号："+m.getStuno()+"\n"+"性别："+m.getSex());
    }
}
