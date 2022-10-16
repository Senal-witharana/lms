package kln.iad.lms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEvaluationDto {
    private String teacherId;

    private String studentId;

    private String courseId;
}
