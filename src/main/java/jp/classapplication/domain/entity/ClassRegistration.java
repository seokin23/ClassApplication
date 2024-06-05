package jp.classapplication.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "class_registration")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ClassRegistration {

    @Id @GeneratedValue
    @Column(name = "class_registration_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_details_id")
    private ClassDetails classDetails;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "re_registration")
    private ReSignUpClass reSignUpClass;

    @Embedded
    private Period period;

    public void classSignUp(Student student, ClassDetails classDetails) {

    }
}
