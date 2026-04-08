public record Podcast(String title, String host, int numberOfEpisodes) implements MediaItem {
    @Override
    public String getTitle() {
        return title;
    }
}
