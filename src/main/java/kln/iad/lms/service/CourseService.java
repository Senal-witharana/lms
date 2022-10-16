package kln.iad.lms.service;

import kln.iad.lms.dto.CreateCourseDto;
import kln.iad.lms.dto.DeleteCourseDto;
import kln.iad.lms.dto.ResponseHeader;
import kln.iad.lms.entity.Course;

import java.util.Optional;

public interface CourseService {

    Iterable<Course> getAllCourses();

    Optional<Course> getCourseById(final String id);

    ResponseHeader saveCourse(CreateCourseDto createCourseDto);

    ResponseHeader updateCourse(CreateCourseDto createCourseDto);

    ResponseHeader deleteCourse(DeleteCourseDto deleteCourseDto);

}
