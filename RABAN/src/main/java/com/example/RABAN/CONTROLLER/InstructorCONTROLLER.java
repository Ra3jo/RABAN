package com.example.RABAN.CONTROLLER;

import com.example.RABAN.ENTITY.InstructorEntity;
import com.example.RABAN.SERVICES.InstructorSERVICES;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/instructorEntity")
public class InstructorCONTROLLER {
    private InstructorSERVICES instructorSERVICES;
    //build create InstructorEntity REST API
    @PostMapping
    public ResponseEntity<InstructorEntity>createInstructorEntity(@RequestBody InstructorEntity instructorEntity){
       InstructorEntity savedInstructorEntity=instructorSERVICES.createInstructorEntity(instructorEntity);
        return new ResponseEntity<>(savedInstructorEntity, HttpStatus.CREATED);
    }
    // build get instructorEntity by id REST API
    //http://localhost:8080/api/instructorEntity/1
    @GetMapping("/{id}")
    public ResponseEntity<InstructorEntity> getInstructorEntityById(@PathVariable("id") Long instructorId) {
        InstructorEntity instructorEntity = instructorSERVICES.getInstructorEntittyById(instructorId);
        return new ResponseEntity<>(instructorEntity, HttpStatus.OK);
    }

    //Build Updated InstructorEntity Get All REST API
    @GetMapping
    public ResponseEntity<List<InstructorEntity>>getAllInstructorEntity(){
        List<InstructorEntity>instructorEntities=instructorSERVICES.getAllInstructorEntity();
        return new ResponseEntity<>(instructorEntities,HttpStatus.OK);

    }
    //Build Update Instructor REST API
    @PutMapping("/{id}")
    public ResponseEntity<InstructorEntity> updateInstructorEntity(@PathVariable("id") Long instructorId, @RequestBody InstructorEntity instructorEntity) {
        instructorEntity.setId(instructorId); // set the ID of the instructor to the instructorId parameter
        InstructorEntity updatedInstructorEntity = instructorSERVICES.updteInstructorEntity(instructorEntity);
        return new ResponseEntity<>(updatedInstructorEntity, HttpStatus.OK);
    }

    public ResponseEntity<String>deleteInstructor(@PathVariable("id")Long instructorId){
        instructorSERVICES.deleteInstructorEntity(instructorId);
        return new ResponseEntity<>("Instructor Successfully Deleted!",HttpStatus.OK);
    }


}
