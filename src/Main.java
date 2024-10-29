public class Main {
    public static void main(String[] args) {
        // TODO: 给Person增加构造方法:
        People ming = new People("小明", 12);
        System.out.println(ming.getName());
        System.out.println(ming.getAge());
    }

}
class People {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public People(String s,int age){
        this.name=s;
        this.age=age;
    }
    public int getAge() {
        return age;
    }
}