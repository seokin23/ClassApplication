package jp.classapplication.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity @Getter
public class Department {

    @Id @GeneratedValue
    @Column(name = "department_id")
    private Long id;

    @Column(name = "department_name")
    private String name;
}
