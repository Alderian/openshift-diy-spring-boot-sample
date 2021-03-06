package ar.com.alderian.demo.openshift.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "people")
public class Person extends AbstractEntity {

    @Column(name = "first_name")
    @NotEmpty
    protected String firstName;

    @Column(name = "last_name")
    @NotEmpty
    protected String lastName;

    @Column(name = "address")
    @NotEmpty
    private String address;

    @Column(name = "city")
    @NotEmpty
    private String city;

    @Column(name = "telephone")
    @NotEmpty
    @Digits(fraction = 0, integer = 10)
    private String telephone;

    public String getAddress() {
	return this.address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public String getCity() {
	return this.city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getTelephone() {
	return this.telephone;
    }

    public void setTelephone(String telephone) {
	this.telephone = telephone;
    }

    public String getFirstName() {
	return this.firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return this.lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

}
