package JavaEssential.hw1.t2;
public class Book  extends  Author{
    private String book;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    static public void main(String[] arg) {
        Book book=new Book();
        book.setBook("Java");
        book.setAuthor("Bert Bates , Kathy Sierra");
        book.setTitle("Head First Java");
        book.setContent("Between Moore's law and the notion of \"Internet time,\" " +
                "we're constantly being bombarded with more and more information--" +
                "most of it in the form of disorganized data");
        System.out.println("Book - "+book.getBook());
        System.out.println("Author  - "+book.getAuthor());
        System.out.println("Title - "+book.getTitle());
        System.out.println("Content - "+book.getContent());
    }
}