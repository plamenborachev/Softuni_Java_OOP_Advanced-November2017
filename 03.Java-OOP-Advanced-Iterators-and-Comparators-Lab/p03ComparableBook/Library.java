package p03ComparableBook;

import java.util.Iterator;

public class Library<Book> implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    private final class LibIterator implements Iterator<Book>{
        private int counter = 0;

        @Override
        public boolean hasNext() {
            if (this.counter < books.length){
                return true;
            }
            return false;
        }

        @Override
        public Book next() {
            counter++;
            return books[counter - 1];
        }
    }
}
