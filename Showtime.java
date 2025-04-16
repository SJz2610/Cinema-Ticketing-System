public class Showtime{
    
    // Data Members
    private String screeningDate;
    private String screeningTime;
    private String cinemaHall;
    private boolean[][] availableSeats = new boolean[6][10];  //Number of seats for a particular showtime
    
    // Empty Constructor
    public Showtime(){
    
    }

    // Parameterized Constructor
    public Showtime(String screeningDate, String screeningTime, String cinemaHall){
        this.screeningDate = screeningDate;
        this.screeningTime = screeningTime;
        this.cinemaHall = cinemaHall;
    }

    // Getters and Setters
    public String getScreeningDate(){
        return screeningDate;
    }

    public void setScreeningDate(String screeningDate){
        this.screeningDate = screeningDate;
    }

    public String getScreeningTime(){
        return screeningTime;
    }

    public void setScreeningTime(String screeningTime){
        this.screeningTime = screeningTime;
    }

    public String getCinemaHall(){
        return cinemaHall;
    }

    public void setCinemaHall(String cinemaHall){
        this.cinemaHall = cinemaHall;
    }

    public boolean[][] getAvailableSeats(){
        return availableSeats;
    }

    public void setAvailableSeats(boolean[][] availableSeats){
        this.availableSeats = availableSeats;
    }

    // Method to check seat availability
    public boolean isSeatAvailable(){     // True is not available
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 10; j++){
                if(availableSeats[i][j] == false){ // Seat is available
                    return true; // Seat is available
                }
            }
        }
        return false; // No seats available
    }

    // Method to count available seats
    public int countAvailableSeats(){
        int count = 0;
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 10; j++){
                if(availableSeats[i][j] == false){ // Seat is available
                    count++;
                }
            }
        }
        return count;
    }
    









}