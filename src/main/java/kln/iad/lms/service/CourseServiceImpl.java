package kln.iad.lms.service;

import kln.iad.lms.dto.CreateCourseDto;
import kln.iad.lms.dto.DeleteCourseDto;
import kln.iad.lms.dto.ResponseHeader;
import kln.iad.lms.entity.Course;
import kln.iad.lms.repository.CourseRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseRepo courseRepo;

    @Override
    public Iterable<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    @Override
    public ResponseHeader  updateCourse(CreateCourseDto createCourseDto) {

        Optional<Course> searchedCourse = courseRepo.findById(createCourseDto.getCourseId());


        return null;
    }

    @Override
    public ResponseHeader saveCourse(CreateCourseDto createCourseDto) {
        ResponseHeader responseHeader = new ResponseHeader();
        String code;
        String description;
        if(courseRepo.existsById(createCourseDto.getCourseId())){
            code="01";
            description="Already Exist";
        }

        else {
            Course course = new ModelMapper().map(createCourseDto, Course.class);

            courseRepo.save(course);
            code="00";
            description="SUCCESS";
        }

            responseHeader.setResponseCode(code);
            responseHeader.setResponseDesc(description);

            return responseHeader;

    }

    @Override
    public ResponseHeader deleteCourse(DeleteCourseDto deleteCourseDto) {
        ResponseHeader responseHeader = new ResponseHeader();
    try {
        courseRepo.deleteById(deleteCourseDto.getCourseId());
        responseHeader.setResponseCode("00");
        responseHeader.setResponseDesc("SUCCESS");
    }
    catch (Exception e){
        responseHeader.setResponseCode("99");
        responseHeader.setResponseDesc("Error");

    }
     finally {
        return responseHeader;
    }

    }
}
