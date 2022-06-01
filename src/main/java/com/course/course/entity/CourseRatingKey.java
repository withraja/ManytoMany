package com.course.course.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.*;

@Embeddable
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class CourseRatingKey implements Serializable {

    @Column(name = "student_id")
    Long studentId;

    @Column(name = "course_id")
    Long courseId;

}
