public class shuzu {
    public static void main(String[] args) {
        Person a=new Person();
        a.setName("why");
       System.out.println(a.getName());
    }

}
class Person{
    private String name;
    private int age;
    public  String getName() {
        return this.name;
    }
     public  void setName(String s){
        this.name=s;
     }
}