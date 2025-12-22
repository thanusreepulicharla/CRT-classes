import java.util.ArrayList;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class ExampleForArrayList {

    public static void main(String[] args) {

        Student s1 = new Student("Thanu", 21);
        Student s2 = new Student("liki", 21);

        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1);
        al.add(s2);

        for (Student i : al) {
            System.out.println(i);
        }
    }
}
