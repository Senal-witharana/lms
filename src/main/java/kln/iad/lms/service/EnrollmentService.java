package kln.iad.lms.service;

import kln.iad.lms.dto.CreateEnrollmentDto;
import kln.iad.lms.dto.ResponseHeader;
import kln.iad.lms.entity.Enrollment;

import java.util.List;
import java.util.Optional;

public interface EnrollmentService {
    Iterable<Enrollment> getAllEnrollments();

    Optional<Enrollment> getEnrollmentById(final Long enrollmentId);

    ResponseHeader saveEnrollment(final CreateEnrollmentDto enrollmentInfo);
}
