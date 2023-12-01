package com.example.car.register.opr.response;

import com.example.car.register.opr.repository.BrandRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class GetAllBrandsResponse {



    private int id;
    private String name;
    private int stock;
}
