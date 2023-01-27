package Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();

        bookShelf.appendBooks(new Book("動物図鑑"));
        bookShelf.appendBooks(new Book("植物図鑑"));
        bookShelf.appendBooks(new Book("魚介図鑑"));
        bookShelf.appendBooks(new Book("恐竜図鑑"));

        Iterator it = bookShelf.iterator();

        while (it.hasNext()) {
            System.out.println(((Book) it.next()).getName());
        }

    }
}
