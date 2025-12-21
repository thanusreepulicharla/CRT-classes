import java.util.LinkedHashSet;
class Student {
    private final String rollno;
    private final String name;
    private final String email;

    public Student(final String rollno , final String name , final String email){
        super();
        this.rollno = rollno;
        this.name = name;
        this.email = email;

    }
    public String getRollNo(){
        return rollno;
    }
    public String getName(){
        return name;
    }
public String getEmail(){
        return email;
    }

    public String toString(){
        return "Student[rollno=" +rollno +",name=" + name + ",email=" + email + "]";
        
    }

}



public class LnkedHashset2 {
    public static void main(final String[] args) {
        final Student s1 = new Student("Ak3250","thanu","thanugmail.com");
        final Student s2 = new Student("ak3270","hello","gmail,com");
        final LinkedHashSet<Student> lhs = new LinkedHashSet<Student>();
        lhs.add(s1);
        lhs.add(s2);
        for(final Student s : lhs){
            System.out.println(s);
        }
    }
}
