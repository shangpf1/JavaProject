public class Man{
    //对属性的封装，一个人的姓名，年龄，妻子都是这个对象（人）的私有属性
    private String name;
    private int age;
    private  String sex;
    private  String stuno;
// 方法封装
    public  String getName(){
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  int getAge(){
        return  age;
    }
    public void  setAge(int age){
        this.age = age;
    }
    public  String getStuno(){
        return  stuno;
    }
    public  void  setStuno(String stuno){
        this.stuno = stuno;
    }
    public  String getSex(){
        return  sex;
    }
    public void  setSex(String sex){
        this.sex = sex;
    }
}