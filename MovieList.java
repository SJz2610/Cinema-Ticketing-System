public class MovieList{

    // Data Members
    private static int movieCount = 0 ; // Use to calculate the number of movies in the list
    private Movie[] movies; // Use to store the list of movies

    // Empty Constructor for MovieList class
    public MovieList(){

    }

    // Parameterized Constructor for MovieList class
    public MovieList(Movie[] movies){
        this.movies = movies;
    }

    //  Getter and Setter for MovieList class
    public Movie[] getMovies(){
        return movies;
    }

    public void setMovies(Movie[] movies){
        this.movies = movies;
    }

    public int getMovieCount(){
        return movieCount;
    }

    // Method to show available movies
    public void showMovieList(){
        System.out.println("Available Movies:");
        for (int i = 0; i < movies.length; i++){
            System.out.println((i+1) + ". " + movies[i].showMovieDetails());
        }
    
    
    }






}