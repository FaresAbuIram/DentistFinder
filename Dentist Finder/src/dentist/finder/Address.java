package dentist.finder;

public class Address {
    private final String Country;
    private final String State;
    private final String City;
    private final String Street;
    private final String postalCode;


    private Address(AddressBuilder builder) {
        this.Country = builder.Country;
        this.State = builder.State;
        this.City = builder.City;
        this.Street = builder.Street;
        this.postalCode=builder.postalCode;

    }

    public String getCountry() {
        return Country;
    }

    public String getState() {
        return State;
    }

    public String getCity() {
        return City;
    }

    public  String getStreet(){return  Street;}
    public  String getPostalCode(){return  postalCode;}
    @Override
    public String toString() {
        return "User: " + this.Country + ", " + this.State + ", " + this.City + ", " + this.Street+", "+this.postalCode;
    }

    public static class AddressBuilder {
        private  String Country;
        private String State;
        private String City;
        private String Street;
        private String postalCode;


       public AddressBuilder(){}
        public AddressBuilder Country(String Country) {
            this.Country = Country;
            return this;

        }
        public AddressBuilder State( String State) {
            this.State = State;
            return this;
        }
        public AddressBuilder City(String City) {
            this.City = City;
            return this;
        }

        public AddressBuilder Street(String Street) {
            this.Street = Street;
            return this;
        }
        public AddressBuilder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }


        public Address build() {
            Address address = new Address(this);
            return address;
        }


    }

}
