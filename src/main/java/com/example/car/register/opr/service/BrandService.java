package com.example.car.register.opr.service;

import com.example.car.register.opr.request.CreateBrandsRequest;
import com.example.car.register.opr.response.GetAllBrandsResponse;

import java.util.List;

public interface BrandService {

    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandsRequest createBrandsRequest);

}
