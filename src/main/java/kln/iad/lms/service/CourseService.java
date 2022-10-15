package kln.iad.lms.service;

import kln.iad.lms.dto.CreateCourseDto;
import kln.iad.lms.dto.DeleteCourseDto;
import kln.iad.lms.dto.ResponseHeader;
import kln.iad.lms.entity.Course;

public interface CourseService {

    public Iterable<Course> getAllCourses();

    public ResponseHeader saveCourse(CreateCourseDto createCourseDto);

    public ResponseHeader updateCourse(CreateCourseDto createCourseDto);

    public ResponseHeader deleteCourse(DeleteCourseDto deleteCourseDto);

}
