package com.example.car.register.opr.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
@Table(name = "Brands")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Transactional

public class Brand implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "stock ")
    private int stock;


    @OneToMany(mappedBy = "brand",fetch = FetchType.LAZY ,cascade = CascadeType.REFRESH)         // Model nesnesinde hangi alanla ilişkilendirilecek ?
    private List<Model> models;
}
