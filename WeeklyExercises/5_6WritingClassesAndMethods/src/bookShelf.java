public class bookShelf {
    public static void main(String[] args)
    {
        Books b1 = new Books("Harry Potter and the Philospher's Stone", "J.K Rowling", "Bloomsbury", 1997);
        Books b2 = new Books("Twilight", "Stephanie Mayer", "Hachette", 2005);

        System.out.println("Book 1 title: "+b1.getTitle());
        b2.setPublisher("Atom");

        System.out.println(b1);
        System.out.println(b2);
    }
}
