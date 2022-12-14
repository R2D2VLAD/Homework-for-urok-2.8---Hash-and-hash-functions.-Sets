public class Passport {
    private final long numPassport;
    private final String lastName;
    private final String firstName;
    private final String midlName;
    private  final String dateBD;

    public Passport(long numPassport, String lastName, String firstName, String midlName, String dateBD) {
        this.numPassport = numPassport;
        this.lastName = lastName;
        this.firstName = firstName;
        this.midlName = midlName;
        this.dateBD = dateBD;
    }

    public long getNumPassport() {
        return numPassport;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMidlName() {
        return midlName;
    }

    public String getDateBD() {
        return dateBD;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "numPassport=" + numPassport +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", midlName='" + midlName + '\'' +
                ", dateBD='" + dateBD + '\'' +
                '}';
    }
}
