package com.example.schoolservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="school")
@Entity
public class School {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String schoolName;
    private String location;
    private String principalName;
}
