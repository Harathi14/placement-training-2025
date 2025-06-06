class Library {
    String bookName;
     static int count = 0;
    Library(String name) {
        bookName = name; count++; }
    void show() { 
        System.out.println("Book: " + bookName); }
    static void total() { 
        System.out.println("Total: " + count); }
    public static void main(String[] args) {
        Library b1 = new Library("Book A"), 
        b2 = new Library("Book B");
        b1.show(); b2.show(); Library.total();
    }
}


