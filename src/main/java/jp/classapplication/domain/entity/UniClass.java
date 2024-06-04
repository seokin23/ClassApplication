package jp.classapplication.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity(name = "class")
@Getter
public class UniClass {

    @Id @GeneratedValue
    @Column(name = "class_id")
    private Long id;

    @Column(name = "class_name")
    private String name;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "major_check")
    private MajorCheck majorCheck;
}
