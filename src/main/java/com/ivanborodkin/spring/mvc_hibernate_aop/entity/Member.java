package com.ivanborodkin.spring.mvc_hibernate_aop.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "member")
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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    @Column(name = "university")
    private String university;

    @Column(name = "course")
    private int course;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "number_of_the_group")
    private int numberOfTheGroup;

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
