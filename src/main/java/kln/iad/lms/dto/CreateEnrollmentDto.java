package kln.iad.lms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateEnrollmentDto {
    private long enrollmentId;
    private Date enrollmentDate;
}
