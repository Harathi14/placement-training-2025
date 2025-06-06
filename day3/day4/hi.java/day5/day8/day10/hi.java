Interface hr{
    int a = 10;
    void display();
}
class office implements hr{
    public void display() {
        System.out.println("This is Data Member of Interface" +a)
    }
}