package com.course.course.entity;

import java.util.Set;

import javax.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToMany(mappedBy = "student")
    Set<CourseRating> ratings;

    @Column(name = "name")
    private String name;

    @Column(name = "gpa")
    private Double gpa;

    @Column(name = "address")
    private String address;
}
