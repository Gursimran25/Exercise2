package sheridan.kang7.exercise2.model;

public class CustomerForm {
    private int customer_id = 0;

    private String firstName = "";

    private String lastName = "";
    private String street;
    private String state;
    private String email;
    private String city;

    public CustomerForm() {
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        String email = null;
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return City();
    }

    private String City() {
        return null;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        String state = null;
        return state;
    }

    public void setSate(String state) {
        this.state = state;
    }


    public void setState(String state) {
    }

    public void setZip_Code(String zip_code) {
    }

    public String getZip_Code() {
        return null;
    }
}
