public interface Borrowable {
    void borrow(String user);
    void returnItem();
    boolean isAvailable();
}
