public class CinemaStaff extends Person {

    //Data Members for CinemaStaff class
    private String staffId;
    private String password;
    private String position;

    //Empty Constructor
    public CinemaStaff(){

    }
    
    //Parameterized Constructor
    public CinemaStaff(String name, String gender, String email, String phoneNumber, String staffId, String position, String password) {
        super(name, gender, phoneNumber, email);
        this.staffId = staffId;
        this.position = position;
        this.password = password;
    }

    // Method to get Staff Information
    public String toString(){
        return String.format("Staff ID: %s\nPosition: %s\nStaff Name: %s\nEmail: %s\nPhone Number: %s",staffId, position, getName(), getEmail(), getPhoneNumber());
    }
    
    //Getters and Setters for StaffId and Position
    public String getStaffId(){
        return staffId;
    }
    
    public void setStaffId(String staffId){
        this.staffId = staffId;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}