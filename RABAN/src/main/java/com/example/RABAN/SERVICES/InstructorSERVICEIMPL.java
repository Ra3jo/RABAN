package com.example.RABAN.SERVICES;

import com.example.RABAN.ENTITY.InstructorEntity;
import com.example.RABAN.REPOSITORY.INSTRUCTORREPOSITORY;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor


public class InstructorSERVICEIMPL implements InstructorSERVICES{
    private INSTRUCTORREPOSITORY instructorrepository;
   public InstructorEntity createInstructorEntity(InstructorEntity instructorEntity) {
        return instructorrepository.save(instructorEntity);
    }

    @Override
    public InstructorEntity getInstructorEntittyById(Long instructorId) {
        Optional<InstructorEntity>optionalInstructorEntity=instructorrepository.findById(instructorId);
        return optionalInstructorEntity.get();
    }

    @Override
    public List<InstructorEntity> getAllInstructorEntity() {
       return instructorrepository.findAll();
    }

    @Override
    public InstructorEntity updteInstructorEntity(InstructorEntity instructorEntity) {
       InstructorEntity existingInstructorEntity=instructorrepository.findById(instructorEntity.getId()).get();
       existingInstructorEntity.setFname(instructorEntity.getFname());
       existingInstructorEntity.setMname(instructorEntity.getMname());
       existingInstructorEntity.setLname(instructorEntity.getLname());
       existingInstructorEntity.setPhon(instructorEntity.getPhon());
       InstructorEntity updatedInstructorEntity=instructorrepository.save(existingInstructorEntity);
        return updatedInstructorEntity;
    }

    @Override
    public void deleteInstructorEntity(Long instructorId) {
       instructorrepository.deleteById(instructorId);

    }
}
