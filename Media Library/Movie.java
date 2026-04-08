public record Movie(String title, String director, int durationMinutes) implements MediaItem {
    @Override
    public String getTitle() {
        return title;
    }
}
