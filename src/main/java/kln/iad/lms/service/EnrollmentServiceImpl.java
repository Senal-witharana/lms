package kln.iad.lms.service;

import kln.iad.lms.dto.CreateEnrollmentDto;
import kln.iad.lms.dto.ResponseHeader;
import kln.iad.lms.entity.AppUser;
import kln.iad.lms.entity.Course;
import kln.iad.lms.entity.Enrollment;
import kln.iad.lms.repository.EnrollmentRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {
    @Autowired
    private EnrollmentRepo enrollmentRepo;

    @Autowired
    private ModelMapper modelMapper;


    @Autowired
    private CourseService courseService;

    @Override
    public Iterable<Enrollment> getAllEnrollments() {
        return enrollmentRepo.findAll();
    }

    @Override
    public Optional<Enrollment> getEnrollmentById(Long enrollmentId) {
        return enrollmentRepo.findById(enrollmentId);
    }

    @Override
    public ResponseHeader saveEnrollment(CreateEnrollmentDto createEnrollmentDto) {
        ResponseHeader responseHeader = new ResponseHeader();
        String code;
        String description;

            Enrollment enrollment = new ModelMapper().map(createEnrollmentDto, Enrollment.class);

            enrollmentRepo.save(enrollment);

        code="00";
        description="Enrollment Success";


        responseHeader.setResponseCode(code);
        responseHeader.setResponseDesc(description);

        return responseHeader;

    }
}

