package kln.iad.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long enrollmentId;
    private Date enrollmentDate;

    @ManyToOne(fetch = FetchType.EAGER)
    private AppUser student;

    @ManyToOne(fetch = FetchType.EAGER)
    private Course course;

}
