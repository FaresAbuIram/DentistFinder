package dentist.finder;

public class Speciality {
    private final String areaOfSpecialization;
    private final String startYear;



    private  Speciality(SpecialityBuilder builder) {
        this.areaOfSpecialization = builder.areaOfSpecialization;
        this.startYear = builder.startYear;


    }

   

    public String getareaOfSpecialization() {
        return areaOfSpecialization;
    }

    public String getstartYear() {
        return startYear;
    }

    @Override
    public String toString() {
        return "User: " + this.areaOfSpecialization + ", " + this.startYear ;
    }

    public static class SpecialityBuilder {
        private String areaOfSpecialization;
        private String startYear;



 public SpecialityBuilder(){}
        
        public SpecialityBuilder areaOfSpecialization( String areaOfSpecialization) {
            this.areaOfSpecialization = areaOfSpecialization;
            return this;
        }
        public SpecialityBuilder startYear(String startYear) {
            this.startYear = startYear;
            return this;
        }
       


        public Speciality build() {
            Speciality speciality = new Speciality(this);
            return speciality;
        }


    }

}
