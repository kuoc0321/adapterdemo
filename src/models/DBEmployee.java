package models;

import java.io.Serializable;

public class DBEmployee implements Employee{
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;

    public DBEmployee(Integer id, String firstname, String lastname, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }


    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstname;
    }

    @Override
    public String getLastName() {
        return this.lastname;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "DBEmployee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
