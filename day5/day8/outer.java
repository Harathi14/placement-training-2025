public class outer {
    private String Z= "Private Message";
    class inner{
        void display(){
            System.out.println(Z);
        }
    }
    static class staticInner{
        void display2(){
            System.out.println("Hi this is static inner class");
        }
    }
}
