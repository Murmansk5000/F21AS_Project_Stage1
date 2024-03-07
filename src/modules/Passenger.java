package modules;
public class Passenger implements Comparable<Passenger> {
    private String referenceCode;
    private String firstName;
    private String lastName;
    private String flightCode;
    private boolean ifCheck;
    private BaggageList baggageOfPassenger;

    /**
     * Construct a new models.Passenger with the specified details. All provided information is used
     * to initialize the passenger's state.
     *
     * @param referenceCode The unique reference code for the passenger.
     * @param firstName     The first name of the passenger.
     * @param lastName      The last name of the passenger.
     * @param flightCode    The code of the flight associated with the passenger.
     * @param ifCheck       Boolean flag indicating whether the passenger has checked in.
     */
    public Passenger(String referenceCode, String firstName, String lastName, String flightCode, boolean ifCheck) {
        if (firstName.trim().length() == 0 || lastName.trim().length() == 0 || referenceCode.trim().length() == 0) {
            throw new IllegalStateException(
                    "Cannot have blank name or reference code");
        }
        this.referenceCode = referenceCode.trim();
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
        this.flightCode = flightCode.trim();
        this.ifCheck = ifCheck;
        this.baggageOfPassenger = new BaggageList(); // Initialize the baggage list for the passenger
    }


    public String getRefCode() {
        return referenceCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public boolean getIfCheck() {
        return ifCheck;
    }

    public void setIfCheck(boolean ifCheck) {
        this.ifCheck = ifCheck;
    }

    /**
     * @return A string containing the passenger's reference code, first name, last name, flight code and check status.
     */
    @Override
    public String toString() {
        return "models.Passenger{" +
                "refCode='" + referenceCode + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", flightCode='" + flightCode + '\'' +
                ", checkedIn=" + ifCheck +
                '}';
    }


    @Override
    public int compareTo(Passenger other) {
        return this.referenceCode.compareTo(other.referenceCode);
    }

    /**
     * Retrieves the list of baggage associated with this passenger.
     *
     * @return The BaggageList belonging to the passenger.
     */
    public BaggageList getBaggageList() {
        return this.baggageOfPassenger;
    }

    /**
     * Sets or updates the list of baggage for this passenger.
     *
     * @param baggageList The new BaggageList to be associated with the passenger.
     */
    public void setBaggageList(BaggageList baggageList) {
        this.baggageOfPassenger = baggageList;
    }


}