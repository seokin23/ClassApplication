package jp.classapplication.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity @Getter
public class Student {

    @Id @GeneratedValue
    @Column(name = "student_id")
    private Long id;

    @Column(name = "student_name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    private String grade;

    @Column(name = "university_number")
    private String number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professor_id")
    private Professor professor;

    private String credit;
}
