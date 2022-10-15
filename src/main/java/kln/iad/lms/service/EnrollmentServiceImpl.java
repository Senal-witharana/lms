package kln.iad.lms.service;

import kln.iad.lms.dto.CreateEnrollmentDto;
import kln.iad.lms.entity.Enrollment;
import kln.iad.lms.repository.EnrollmentRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EnrollmentServiceImpl implements EnrollmentService {
    @Autowired
    private EnrollmentRepo enrollmentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CreateEnrollmentDto saveStudentEnrolledCourse(CreateEnrollmentDto createEnrollmentDto) {
        enrollmentRepo.save(modelMapper.map(createEnrollmentDto, Enrollment.class));
        return createEnrollmentDto;
    }

    @Override
    public List<CreateEnrollmentDto> getEnrolledCourses(){
        List<Enrollment>courseList= enrollmentRepo.findAll();
        return modelMapper.map(courseList, new TypeToken<List<CreateEnrollmentDto>>(){}.getType());
    }

    @Override
    public boolean dropCourse(CreateEnrollmentDto createEnrollmentDto) {
        enrollmentRepo.delete(modelMapper.map(createEnrollmentDto, Enrollment.class));
        return true;
    }
}

