package jp.classapplication.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "class_details")
@Getter
@NoArgsConstructor
public class ClassDetails {

    @Id @GeneratedValue
    @Column(name = "class_details_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id")
    private UniClass uniClass;

    @Column(name = "max_student_num")
    private int maxStudentNum;

    @Embedded
    private Period period;

    public ClassDetails(Professor professor, UniClass uniClass, int maxStudentNum, Period period) {
        this.professor = professor;
        this.uniClass = uniClass;
        this.maxStudentNum = maxStudentNum;
        this.period = period;
    }

    public static ClassDetails createClassDetails(Professor professor, UniClass uniClass, int maxStudentNum, Period period){
        return new ClassDetails(professor, uniClass, maxStudentNum, period);
    }
}
