package com.utest.automation.model;

import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.person.Person;
import com.devskiller.jfairy.producer.person.PersonProperties;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class User {

    private String firstname;
    private String lastname;
    private String emailaddress;
    private String birthmonth;
    private String birthday;
    private String birthyear;
    private String city;
    private String postalcode;
    private String password;
    private List<String> idioms;


    public User(String gender) {

        PersonProperties.PersonProperty personProperties;

        if ("he".equalsIgnoreCase(gender)) {
            personProperties = PersonProperties.male();
        } else {
            personProperties = PersonProperties.female();
        }

        Fairy fairy = Fairy.create(Locale.forLanguageTag("en"));
        Person person = fairy.person(personProperties, PersonProperties.minAge(18));
        this.firstname = person.getFirstName();
        this.lastname = person.getLastName();
        this.emailaddress = person.getEmail();
        this.birthmonth = person.getDateOfBirth().format(DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH));
        this.birthday = String.valueOf(person.getDateOfBirth().getDayOfMonth());
        this.birthyear = String.valueOf(person.getDateOfBirth().getYear());
        this.city = person.getAddress().getCity();
        this.postalcode = person.getAddress().getPostalCode();
        this.password = "@A.-/12".concat(person.getPassword());
        this.idioms = Arrays.asList("Spanish", "French");
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public String getBirthmonth() {
        return birthmonth;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getBirthyear() {
        return birthyear;
    }

    public String getCity() {
        return city;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getIdioms() {
        return idioms;
    }

}
