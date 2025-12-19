class Family implements Runnable
{
    String resource1="Tv";
    String resource2="PlayStation";
    public void run()
    {
        String name=Thread.currentThread().getName();
        if(name.equals("Thanu")==true)
        {
            ThanuAccquiredResource();
        }
        else{
            ThofickAccquiredResource();
        }
    }
    void ThanuAccquiredResource()
    {
        synchronized(resource2)
        {
            try{
                System.out.println("Thanu accquired the playstation");
                Thread.sleep(2000);
                synchronized(resource1)
                {
                    System.out.println("Thanu accquired tv");
                    Thread.sleep(1000);
                }
            }
            catch(Exception e)
            {
                System.out.println("Thanu Failed");
            }
        }
    }
    void ThofickAccquiredResource()
    {
        synchronized(resource1)
        {
            try{
                System.out.println("Thofick accquired the tv");
                Thread.sleep(2000);
                synchronized(resource2)
                {
                    System.out.println("Thofick accquired the playstation");
                    Thread.sleep(1000);
                }
            }
            catch(Exception e)
            {
                System.out.println("Thofick Failed");
            }
        }
    }
}
    public class Deadlock {
        public static void main(String[] args) {
            Family f =new Family();
            Thread t1=new Thread(f);
            Thread t2=new Thread(f);
            t1.setName("Thanu");
            t2.setName("Thofick");
            t1.start();
            t2.start();


        }
    
}
