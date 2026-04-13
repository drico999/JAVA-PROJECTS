public class BorrowableMovie implements MediaItem, Borrowable {
    private final String title;
    private final String author;
    private final String isbn;
    private String borrower;

    public BorrowableMovie(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.borrower = null;
    }

    @Override
    public void borrow(String user) {
        if (borrower == null) {
            borrower = user;
            System.out.println(title + " borrowed by " + user);
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        borrower = null;
        System.out.println(title + " returned.");
    }

    @Override
    public boolean isAvailable() {
        return borrower == null;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
