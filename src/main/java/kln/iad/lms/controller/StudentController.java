package kln.iad.lms.controller;

import kln.iad.lms.dto.CreateStudentDto;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

//    @PostMapping("/addStudent")
//    public ResponseEntity addStudent(@RequestBody CreateStudentDto createStudentDto){
//    return ResponseEntity.status(HttpStatus.ACCEPTED);
//    }
}
