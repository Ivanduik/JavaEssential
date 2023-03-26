package JavaEssential.hw1.t2;

public class Book {
    private final Author author = new Author();

    private final Content content = new Content();

    private final Title title = new Title();
    private String book;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }


    static public void main(String[] arg) {
        Book book = new Book();
        book.setBook("Java");
        book.author.setAuthor("Bert Bates , Kathy Sierra");
        book.title.setTitle("Head First Java");
        book.content.setContent("Between Moore's law and the notion of \"Internet time,\" " +
                "we're constantly being bombarded with more and more information--" +
                "most of it in the form of disorganized data");
        System.out.println("Book - " + book.getBook());
        System.out.println("Author  - " + book.author.getAuthor());
        System.out.println("Title - " + book.title.getTitle());
        System.out.println("Content - " + book.content.getContent());
    }
}