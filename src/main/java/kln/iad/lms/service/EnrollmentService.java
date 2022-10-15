package kln.iad.lms.service;

import kln.iad.lms.dto.CreateEnrollmentDto;

import java.util.List;

public interface EnrollmentService {
    CreateEnrollmentDto saveStudentEnrolledCourse(CreateEnrollmentDto createEnrollmentDto);

    List<CreateEnrollmentDto> getEnrolledCourses();

    boolean dropCourse(CreateEnrollmentDto createEnrollmentDto);
}
