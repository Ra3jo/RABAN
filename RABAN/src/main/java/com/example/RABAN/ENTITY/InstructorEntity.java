package com.example.RABAN.ENTITY;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="instructors")
public class InstructorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;
    @Column(nullable = false)
    private String Fname;
    @Column(nullable = false)
    private  String Mname;
    @Column(nullable = false)
    private  String Lname;
    @Column(nullable = false,unique = true)
    private int Phon;




}
