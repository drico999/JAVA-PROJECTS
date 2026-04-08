public record Book(String title, String author, String isbn) implements MediaItem {
    @Override
    public String getTitle() {
        return title;
    }
}
