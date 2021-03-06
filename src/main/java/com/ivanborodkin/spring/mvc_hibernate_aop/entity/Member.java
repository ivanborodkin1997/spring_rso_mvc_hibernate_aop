package com.ivanborodkin.spring.mvc_hibernate_aop.entity;

import javax.persistence.*;

@Entity
@Table(name = "membersoftheorganization")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "university")
    private String university;

    @Column(name = "course")
    private int course;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "number_of_the_group")
    private String numberOfTheGroup;

    @Column(name = "social_networks")
    private String socialNetworks;

    public Member() {
    }

    public Member(int id, String firstName, String secondName,
                  String lastName, String dateOfBirth, String university,
                  int course, String faculty, String numberOfTheGroup, String socialNetworks) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.university = university;
        this.course = course;
        this.faculty = faculty;
        this.numberOfTheGroup = numberOfTheGroup;
        this.socialNetworks = socialNetworks;
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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getNumberOfTheGroup() {
        return numberOfTheGroup;
    }

    public void setNumberOfTheGroup(String numberOfTheGroup) {
        this.numberOfTheGroup = numberOfTheGroup;
    }

    public String getSocialNetworks() {
        return socialNetworks;
    }

    public void setSocialNetworks(String socialNetworks) {
        this.socialNetworks = socialNetworks;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", firstName=" + firstName +
                ", secondName=" + secondName +
                ", lastName=" + lastName +
                ", dateOfBirth=" + dateOfBirth +
                ", university=" + university +
                ", course=" + course +
                ", faculty=" + faculty +
                ", numberOfTheGroup=" + numberOfTheGroup +
                ", socialNetworks=" + socialNetworks +
                '}';
    }
}
