package dentist.finder;

public class Education {
    private final String Degree;
    private final String Major;
    private final String School;
    private final int Year;


    private Education(EducationBuilder builder) {
        this.Degree = builder.Degree;
        this.Major = builder.Major;
        this.School = builder.School;
        this.Year = builder.Year;

    }

    public String getDegree() {
        return Degree;
    }

    public String getMajor() {
        return Major;
    }

    public String getSchool() {
        return School;
    }

    public  int getYear(){return  Year;}
    @Override
    public String toString() {
        return "User: " + this.Degree + ", " + this.Major + ", " + this.School + ", " + this.Year ;
    }

    public static class EducationBuilder {
        private  String Degree;
        private String Major;
        private String School;
        private int Year;


  public EducationBuilder (){}
        public EducationBuilder Degree(String Degree) {
            this.Degree = Degree;
            return this;

        }
        public EducationBuilder Major( String Major) {
            this.Major = Major;
            return this;
        }
        public EducationBuilder School(String School) {
            this.School = School;
            return this;
        }

        public EducationBuilder Year(int Year) {
            this.Year = Year;
            return this;
        }


        public Education build() {
            Education education = new Education(this);
            return education;
        }


    }
}
