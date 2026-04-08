public sealed interface MediaItem permits Book, Movie, Podcast {
    String getTitle();
}
