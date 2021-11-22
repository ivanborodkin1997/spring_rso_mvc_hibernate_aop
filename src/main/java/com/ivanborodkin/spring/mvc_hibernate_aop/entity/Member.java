package com.ivanborodkin.spring.mvc_hibernate_aop.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
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
