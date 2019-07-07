public class PersonTest {
    public static void main(String[] args) {
      Person p = new  Person();  //  此处的Person为封装的类名
        p.setName("王菲");
        p.setAge(30);

        System.out.println("名字："+p.getName()+"\n"+"年龄："+p.getAge());
    }
}
