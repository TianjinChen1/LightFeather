package com.example.lightfeater.springboot.springboot_2.data;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;



public class Notification {


    private  int id;

    @NotBlank(message = "First name is required")
    @Pattern(regexp = "^[a-zA-Z]*$", message = "First name must only contain letters")
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Pattern(regexp = "^[a-zA-Z]*$", message = "Last name must only contain letters")
    private String lastName;

    @Pattern(regexp = "^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$", message = "Invalid email format")
    private String email;

    @Pattern(regexp = "^\\+?(1\\s?-?)?\\(?[0-9]{3}\\)?[-.\\s]?[0-9]{3}[-.\\s]?[0-9]{4}$", message = "Phone number format is invalid")
    private String phone_Number;


    @NotBlank(message = "Supervisor is required")
    private String supervisor;



    public Notification(){

    }


    public Notification(String firstName, String lastName, String email, String phone_Number, String supervisor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone_Number = phone_Number;
        this.supervisor = supervisor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone_Number='" + phone_Number + '\'' +
                ", supervisor='" + supervisor + '\'' +
                '}';
    }

}
