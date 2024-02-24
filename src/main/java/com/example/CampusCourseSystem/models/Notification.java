package com.example.CampusCourseSystem.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String text;

    @Column(name = "is_important")
    private boolean isImportant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "campus_course_id")
    private CampusCourse campusCourse;
}