package com.example.RABAN.SERVICES;

import com.example.RABAN.ENTITY.InstructorEntity;

import java.util.List;

public interface InstructorSERVICES {
    InstructorEntity createInstructorEntity(InstructorEntity instructorEntity);
    InstructorEntity getInstructorEntittyById(Long instructorId);
    List<InstructorEntity>getAllInstructorEntity();
    InstructorEntity updteInstructorEntity(InstructorEntity instructorEntity);
    void deleteInstructorEntity(Long instructorId);
}
