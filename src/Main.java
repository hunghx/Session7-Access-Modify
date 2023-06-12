
import rikkei.Student;
public class Main {
    public static void main(String[] args) {
        // Kiểu tham chiếu và tham trị
        // Kiểu biến nguyên thủy
        int a =5;
        int b = a;
        System.out.println("Trước khi b thay đổi"+a);
        b=10;
        System.out.println("Sau khi b thay đổi"+a);

        // kiểu tham chiếu

        Person p1 = new Person("Hùng",23);
        Person p2 = p1;
        System.out.println("p1 trước khi p2 thay đổi "+ p1 );
        p2.name = "Nam";
        System.out.println("p1 sau khi p2 thay đổi "+ p1 );
        // Lớp là 1 nhóm các đối tượng có cùng đặc điểm hành
        // đối tượng là 1 thể hiện cụ thể của lớp
        System.out.println("số chân cua lớp nguồi là "+ Person.getFoot());
        test();
        // sử dụng
        Student s =new Student();
        // innerclass
        Student.Monitor monitor = s.new Monitor();
        // nested class
        // Student.Monitor monitor = new Student.Monitor();
    }
    public static  void test(){
        Person.display();
    }


}