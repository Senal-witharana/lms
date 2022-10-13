package kln.iad.lms.controller;

import kln.iad.lms.entity.Course;
import kln.iad.lms.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/findAllCourses")
    public ResponseEntity<Iterable<Course>> getAllCourses() {

        return new ResponseEntity<>(courseService.getAllCourses(), HttpStatus.ACCEPTED);
    }


//    @PutMapping("update")
//    public ResponseEntity<Boolean> updateCourseCategory(@RequestBody UpdateCourseCategoryDto updateCourseCategoryInfo){
//        if(courseCategoryService.updateCourseCategory(updateCourseCategoryInfo)) {
//            return new ResponseEntity<>(true, HttpStatus.CREATED);
//        }
//        return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
//    }
//
//    @PostMapping("delete")
//    public ResponseEntity<Boolean> removeCourseCategory(@RequestBody GetCourseCategoryDto categoryName) {
//        System.out.println("Hello");
//        System.out.println(categoryName.getCategoryName());
//        return new ResponseEntity<>(courseCategoryService.removeCourseCategory(categoryName), HttpStatus.ACCEPTED);
//    }
}
