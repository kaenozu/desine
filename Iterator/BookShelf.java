package Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Iterator {
    private List<Book> books;
    private int index;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBooks(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public Iterator iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return index < this.getLength();
    }

    @Override
    public Object next() {
        Book book = this.getBookAt(index);
        index++;
        return book;
    }
}