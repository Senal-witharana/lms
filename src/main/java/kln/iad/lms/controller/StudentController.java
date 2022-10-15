package kln.iad.lms.controller;

import kln.iad.lms.dto.CreateStudentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @PostMapping("/addStudent")
    public ResponseEntity addStudent(@RequestBody CreateStudentDto createStudentDto){
        return
    }
}
