import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> stock;
    private int capacity;

    public Library(String name, int Capacity){
        this.name = name;
        this.stock= new ArrayList<Book>();
        this.capacity = capacity;


    }

    public int bookCount() {
        return this.stock.size();
    }


    public void addBook(Book book) {
         this.stock.add(book);
    }

    public void checkCapacity(Library library) {
        if (this.bookCount() < this.capacity) {
            this.stock.add(book);
        }
    }