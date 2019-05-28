import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private Integer capacity;

    public Library(Integer capacity){
        this.bookCollection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int countCollection() {
        return this.bookCollection.size();
    }

    public void addBook(Book book) {
        if (this.countCollection() < this.capacity) {
            this.bookCollection.add(book);
        }
    }

    public void removeBook(Book book) {
        this.bookCollection.remove(book);
    }

    public Book removeAndReturnBook(Book book){
        int index = this.bookCollection.indexOf(book);
        Book borrowedBook =  this.bookCollection.remove(index);
        return borrowedBook;
    }

    public boolean bookAvailable(Book book){
       return this.bookCollection.contains(book);
    }
}

