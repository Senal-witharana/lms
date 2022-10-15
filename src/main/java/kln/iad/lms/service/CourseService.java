package kln.iad.lms.service;

import kln.iad.lms.dto.CreateCourseDto;
import kln.iad.lms.dto.DeleteCourseDto;
import kln.iad.lms.dto.ResponseHeader;
import kln.iad.lms.entity.Course;

public interface CourseService {

    Iterable<Course> getAllCourses();

    ResponseHeader saveCourse(CreateCourseDto createCourseDto);

    ResponseHeader updateCourse(CreateCourseDto createCourseDto);

    ResponseHeader deleteCourse(DeleteCourseDto deleteCourseDto);

}
