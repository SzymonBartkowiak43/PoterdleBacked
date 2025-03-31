package com.example.harypotedle;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String gender;
    private String house;
    private String occupation;
    private Integer birthYear;
    private String bloodStatus;



    public Character(String name, String gender, String house, String occupation, Integer birthYear, String bloodStatus) {
        this.name = name;
        this.gender = gender;
        this.house = house;
        this.occupation = occupation;
        this.birthYear = birthYear;
        this.bloodStatus = bloodStatus;
    }

    public Character() {

    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getHouse() {
        return house;
    }

    public String getOccupation() {
        return occupation;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public String getBloodStatus() {
        return bloodStatus;
    }


}
