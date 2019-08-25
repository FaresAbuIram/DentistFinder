package dentist.finder;

public class User {

    static Object UserBuilder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private final String firstName;
    private final String lastName;
    private final String emailAddress;
    private final String Website;
    private final String phone;
    private final String licenseCountryName;
    private final int licenseNumber;
    private final  int yearsInPractice;
    private final String Gender;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.emailAddress = builder.emailAddress;
        this.Website = builder.Website;
        this.phone = builder.phone;
        this.licenseCountryName=builder.licenseCountryName;
        this.licenseNumber=builder.licenseNumber;
        this.yearsInPractice=builder.yearsInPractice;
        this.Gender = builder.Gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String emailAddress() {
        return emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return Website;
    }
    public  String getLicenseCountryName (){return licenseCountryName;}
    public  int getLicenseNumber(){return licenseNumber;}
    public  int getYearsInPractice(){return  yearsInPractice;}
    public String getGender(){return Gender;}
    @Override
    public String toString() {
        return "User: " + this.firstName + " " + this.lastName + "\n " + this.emailAddress + "|" + this.phone + "| link " + this.Website;
    }

    public static class UserBuilder {
        private  String firstName;
        private String lastName;
        private String emailAddress;
        private String Website;
        private String phone;
        private String licenseCountryName;
        private int licenseNumber;
        private int yearsInPractice;
        private String Gender;

        public UserBuilder() {
        }
        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;

        }

        
        public UserBuilder lastName( String lastName) {
            this.lastName = lastName;
            return this;
        }
        public UserBuilder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public UserBuilder Website(String Website) {
            this.Website = Website;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }



        public UserBuilder licenseCountryName(String licenseCountryName){
            this.licenseCountryName=licenseCountryName;
            return this;
        }
        public UserBuilder  licenseNumber(int licenseNumber){
            this.licenseNumber=licenseNumber;
            return this;
        }
        public UserBuilder   yearsInPractice( int yearsInPractice){
            this.yearsInPractice=yearsInPractice;
            return this;
        }
        public UserBuilder Gender(String Gender){
            this.Gender=Gender;
            return this;
        }
        public User build() {
            User user = new User(this);
            return user;
        }


    }
}

