package kln.iad.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseEvaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @ManyToOne(fetch = FetchType.EAGER)
    private AppUser teacher;

    @OneToOne(fetch = FetchType.EAGER)
    private AppUser student;

    @OneToOne(fetch = FetchType.EAGER)
    private Course course;
}
