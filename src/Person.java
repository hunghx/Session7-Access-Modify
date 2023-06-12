public class Person {
    private static int foot = 2;
    static {
        foot =3;
    }
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : + "+ name + " | Age : "+ age;
    }
    public  static void display(){

    }
    public static int getFoot(){
        return foot;
    }
}
