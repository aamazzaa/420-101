/**
 * Store the details of a music track,
 * such as the artist, title, file name, and genre.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class Track
{
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;
    // The number of times the track has been played.
    private int playCount;
    // The genre of the track.
    private String genre;

    /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    public Track(String artist, String title, String filename)
    {
        setDetails(artist, title, filename);
        this.playCount = 0; // Initialize playCount to zero
        this.genre = "Unknown"; // Default genre
    }

    /**
     * Constructor for objects of class Track.
     * It is assumed that the file name cannot be
     * decoded to extract artist and title details.
     * @param filename The track file. 
     */
    public Track(String filename)
    {
        setDetails("unknown", "unknown", filename);
        this.playCount = 0; // Initialize playCount to zero
        this.genre = "Unknown"; // Default genre
    }

    /**
     * Return the artist.
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }

    /**
     * Return the title.
     * @return The title.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Return the file name.
     * @return The file name.
     */
    public String getFilename()
    {
        return filename;
    }

    /**
     * Return the number of times the track has been played.
     * @return The play count.
     */
    public int getPlayCount()
    {
        return playCount;
    }

    /**
     * Return the genre of the track.
     * @return The genre.
     */
    public String getGenre()
    {
        return genre;
    }

    /**
     * Set the genre of the track.
     * @param genre The genre to set.
     */
    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    /**
     * Return details of the track: artist, title, file name, play count, and genre.
     * @return The track's details.
     */
    public String getDetails()
    {
        return artist + ": " + title + "  (file: " + filename + ") [Played: " + playCount + " times, Genre: " + genre + "]";
    }

    /**
     * Set details of the track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    private void setDetails(String artist, String title, String filename)
    {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
    }

    /**
     * Reset the play count to zero.
     */
    public void resetPlayCount()
    {
        playCount = 0;
    }

    /**
     * Increment the play count by one.
     */
    public void incrementPlayCount()
    {
        playCount++;
    }
}