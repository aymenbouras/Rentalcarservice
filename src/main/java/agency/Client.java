package agency;

import java.util.Objects;

public class Client {
    private int yearOfBirth;
    private String lastname;
    private String firstlastname;

    public Client(String firstlastname, String lastname, int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        this.lastname = lastname;
        this.firstlastname = firstlastname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstName() {
        return firstlastname;
    }

    public void setFirstName(String firstlastname) {
        this.firstlastname = firstlastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return yearOfBirth == client.yearOfBirth &&
                Objects.equals(lastname, client.lastname) &&
                Objects.equals(firstlastname, client.firstlastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth, lastname, firstlastname);
    }



}
