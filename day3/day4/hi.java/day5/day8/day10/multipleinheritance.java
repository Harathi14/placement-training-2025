package day10;

public class multipleinheritance {
    interface hr{
        int a = 10;
        void display();
    }
    interface finance{
        void budget();
    }
    interface Operations{
        void SOP();
    }
    class office implements hr,finance,operations{
        public.void display(){
            System.out.println("This is Data Member of Interface"+ a);
    } 
    public void display(){
        System.out.println("this is data member of interface"+a)
    }
    public void budget(){
        System.out.println("Budget from finance")
    }
    
}
