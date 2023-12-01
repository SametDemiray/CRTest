package com.example.car.register.opr.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Table(name = "series")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Series implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "gear")
    private String gear;

    @Column(name = "fuel")
    private String fuel;

    @Column(name = "price")
    private double price;


   @ManyToOne
    @JoinColumn(name = "model")
    private Model model;         // <------ mappedby buradaki model ile ilişkilendirilecek


}
