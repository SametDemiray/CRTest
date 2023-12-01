package com.example.car.register.opr.entities;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
@Table(name = "Models")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Transactional
public class Model implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "year")
    private int year;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;                                // <------ mappedby buradaki brand ile ilişkilendirilecek

    /*@OneToMany(mappedBy = "Series",targetEntity = Series.class,fetch = FetchType.LAZY ,cascade = CascadeType.REFRESH)          // Model nesnesinde hangi alanla ilişkilendirilecek ?
    private List<Series> series;*/
}
