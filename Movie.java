public class Movie{

    // Dta Members
    private String title;
    private String genre;
    private String director;
    private String language;
    private String cast;
    private int duration;  // Duration in minutes
    private double rating; // Rating out of 5.0
    private Showtime[] showtimes;

    // Empty Construtor for Movie class
    public Movie(){

    }

    // Parameterized Constructor for Movie class
    public Movie(String title, String genre, String director, String language, String cast, int duration, double rating, Showtime[] showtimes){
        this.showtimes = showtimes;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.language = language;
        this.cast = cast;
        this.duration = duration;
        this.rating = rating;
    }

    // Getters and Setters for Movie class
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public String getDirector(){
        return director;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public String getLanguage(){
        return language;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public String getCast(){
        return cast;
    }

    public void setCast(String cast){
        this.cast = cast;
    }

    public double getRating(){
        return rating;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public Showtime[] getShowtimes(){
        return showtimes;
    }

    public void setShowtimes(Showtime[] showtimes){
        this.showtimes = showtimes;
    }

    // Method to show movie details
    public String showMovieDetails(){

        return String.format("Title: %s\nGenre: %s\nDirector: %s\nLanguage: %s\nCast: %s\nDuration: %d minutes\nRating: %.1f/5.0",
                title, genre, director, language, cast, duration, rating);
        
    }
}