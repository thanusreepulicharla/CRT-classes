class Car{
   private String name;
   private int mailage;
   private String color;

   public void setName(String name){
    this.name=name;
   }
   public void setMilage(int mailage){
    this.mailage=mailage;
   }
   public void setColor(String color){
    this.color=color;
   }
    
    public String getName()
    {
        return name;
    }
    public int getMailage() 
    {
        return mailage;
    }
    public String getColor()
    {
        return color;
    }
}
public class CarExample{ 

    public static void main(String[] args){


        Car c = new Car();
        c.setName("audi");
        c.setMilage(200);
        c.setColor("red");

        System.out.println("the car name :" + c.getName());
        System.out.println("the car mailage :" + c.getMailage());
        System.out.println("the car color :" + c.getColor());
    }
}
