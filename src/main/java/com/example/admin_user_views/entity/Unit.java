package com.example.admin_user_views.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "UNITS")
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "UNIT_NAME", nullable = false, unique = true)
    private String unitName;

    @Column(name = "UNIT_CODE", nullable = false, unique = true)
    private String unitCode;
}
