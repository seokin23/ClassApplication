package jp.classapplication.domain.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.time.LocalDate;
import java.time.Year;

@Embeddable
@Getter
public class Period {

    private LocalDate localDate;
    private String semester;
}
