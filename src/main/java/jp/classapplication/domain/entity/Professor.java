package jp.classapplication.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Professor {

    @Id @GeneratedValue
    @Column(name = "professor_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    @Column(name = "professor_name")
    private String name;

    @OneToMany(mappedBy = "professor")
    private List<Student> students = new ArrayList<>();
}
