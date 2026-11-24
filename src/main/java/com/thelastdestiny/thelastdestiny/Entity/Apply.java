package com.thelastdestiny.thelastdestiny.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "apply")
public class Apply {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String country;
    private String mainCharacter;
    private String role;
    private String spec;
    private String tellMeAboutYourSelf;
    private int age;

    public Apply() {}

    public Apply(String name, String email, String country, int age, String mainCharacter, String role, String spec, String tellMeAboutYourSelf) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid Name.");
        }
        if (email == null || email.trim().isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Please enter a valid Email");
        }
        if (age < 15) {
            throw new IllegalArgumentException("You must be 15+");
        }
        if (mainCharacter == null || mainCharacter.trim().isEmpty())
            throw new IllegalArgumentException("Please enter a valid Main Character");
        if (spec == null || spec.trim().isEmpty())
            throw new IllegalArgumentException("Please enter a valid Spec");
        if (role == null || role.trim().isEmpty())
            throw new IllegalArgumentException("Please enter a correct Role");
        if (tellMeAboutYourSelf == null || tellMeAboutYourSelf.trim().isEmpty())
            throw new IllegalArgumentException("Please tell us about Yourself");

        this.spec = spec;
        this.tellMeAboutYourSelf = tellMeAboutYourSelf;
        this.role = role;
        this.mainCharacter = mainCharacter;
        this.name = name;
        this.email = email;
        this.country = country;
        this.age = age;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCountry() { return country; }
    public String getEmail() { return email; }
    public String getMainCharacter() { return mainCharacter; }
    public String getRole() { return role; }
    public String getSpec() { return spec; }
    public String getTellMeAboutYourSelf() { return tellMeAboutYourSelf; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setCountry(String country) { this.country = country; }
    public void setMainCharacter(String mainCharacter) { this.mainCharacter = mainCharacter; }
    public void setRole(String role) { this.role = role; }
    public void setSpec(String spec) { this.spec = spec; }
    public void setTellMeAboutYourSelf(String tellMeAboutYourSelf) { this.tellMeAboutYourSelf = tellMeAboutYourSelf; }
    public void setAge(int age) { this.age = age; }

}
