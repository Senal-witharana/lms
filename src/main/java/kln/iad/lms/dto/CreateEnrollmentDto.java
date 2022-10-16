package kln.iad.lms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateEnrollmentDto {
    private Long enrollmentId;
    private Date enrollmentDate;
    private String courseId;
}
