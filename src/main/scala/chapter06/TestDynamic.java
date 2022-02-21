package chapter06;


class Person01 {
    public String name = "person";

    public void hello() {
        System.out.println("hello person");
    }
}

class Teacher01 extends Person01 {
    public String name = "teacher";

    @Override
    public void hello() {
        System.out.println("hello teacher");
    }
}

public class TestDynamic {
    public static void main(String[] args) {
        Teacher01 teacher = new Teacher01();
        Person01 teacher1 = new Teacher01();
        System.out.println(teacher.name);  // teacher
        teacher.hello();  // hello teacher
        System.out.println(teacher1.name);  // person
        teacher1.hello();  // hello teacher
    }
}
