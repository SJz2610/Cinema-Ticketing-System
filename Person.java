public class Person {
    
    //Data Members for Person class
    private String name;
    private String phoneNumber;
    private String email;
    private String gender;

    // Empty Constructor for Person class
    public Person(){

    }

    // Paremetirized Constructor for Person 
    public Person(String name, String email){
        this.name = name;
        this.email = email;
    }

    public Person(String name, String gender, String phoneNumber, String email){
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters and Setters for Person class
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

}
