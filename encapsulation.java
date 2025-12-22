class Student{
   private String rollNo;
   private String name;
   private String email;
   private int age;

   public void setData(String x,String y,String z,int a){
    rollNo = x;
    name = y;
    email = z;
    age = a;
   }
   public String getRollNo()
   {
    return rollNo;
   }
   public String getName() 
   {
    return name;
   }
   public String getEmail()
   {
    return email;
   }
   public int getAge()
   {
    return age;
   }
}

    public class Encapsulation{ 

        public static void main(String[] args){


            Student s = new Student();
            s.setData("A101","thanusree","thanusree@gmail.com",25);

            System.out.println("the student roll number :" + s.getRollNo());
            System.out.println("the student name :" + s.getName());
            System.out.println("the student email :" + s.getEmail());
            System.out.println("the student age :" + s.getAge());
        }


    }



